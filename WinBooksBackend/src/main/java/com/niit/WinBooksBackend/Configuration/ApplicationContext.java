package com.niit.WinBooksBackend.Configuration;


import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.WinBooksBackend.Dao.BillingDao;
import com.niit.WinBooksBackend.Dao.CartDao;
import com.niit.WinBooksBackend.Dao.CartItemsDao;
import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Dao.OrderDao;
import com.niit.WinBooksBackend.Dao.OrderItemsDao;
import com.niit.WinBooksBackend.Dao.PaymentDao;
import com.niit.WinBooksBackend.Dao.ProductDao;
import com.niit.WinBooksBackend.Dao.ShippingDao;
import com.niit.WinBooksBackend.Dao.SupplierDao;
import com.niit.WinBooksBackend.Dao.UserDao;
import com.niit.WinBooksBackend.DaoImpl.BillingDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.CartDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.CartItemsDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.CategoryDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.OrderDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.OrderItemsDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.PaymentDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.ProductDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.ShippingDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.SupplierDaoImpl;
import com.niit.WinBooksBackend.DaoImpl.UserDaoImpl;
import com.niit.WinBooksBackend.Model.Billing;
import com.niit.WinBooksBackend.Model.Cart;
import com.niit.WinBooksBackend.Model.CartItems;
import com.niit.WinBooksBackend.Model.Category;
import com.niit.WinBooksBackend.Model.Order;
import com.niit.WinBooksBackend.Model.OrderItems;
import com.niit.WinBooksBackend.Model.Payment;
import com.niit.WinBooksBackend.Model.Product;
import com.niit.WinBooksBackend.Model.Shipping;
import com.niit.WinBooksBackend.Model.Supplier;
import com.niit.WinBooksBackend.Model.User;




@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class ApplicationContext {
  @Bean("dataSource")
  public DataSource getDataSource() {
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("org.h2.Driver");
	  dataSource.setUrl("jdbc:h2:tcp://localhost/~/test/WinBooks");
	  dataSource.setUsername("sangeetha");
	  dataSource.setPassword("casino");
	  return dataSource;
  }
   private Properties getHibernateProperties() {
	  Properties properties = new Properties();
	  properties.put("hibernate.connection.pool_size","10");
	  properties.put("hibernate.hbm2ddl.auto","update");
	  properties.put("hibernate.show_sql","true");
	  properties.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
	  return properties;
	  
   }
   @Autowired
   @Bean("sessionFactory")
   public SessionFactory getSessionFactory(DataSource dataSource) {
	   LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	   sessionBuilder.addProperties(getHibernateProperties());
	   sessionBuilder.addAnnotatedClass(Category.class);
	   sessionBuilder.addAnnotatedClass(Product.class);
	   sessionBuilder.addAnnotatedClass(Supplier.class);
	   sessionBuilder.addAnnotatedClass(User.class);
	   sessionBuilder.addAnnotatedClass(Billing.class);
	   sessionBuilder.addAnnotatedClass(Cart.class);
	   sessionBuilder.addAnnotatedClass(CartItems.class);
	   sessionBuilder.addAnnotatedClass(Payment.class);
	   sessionBuilder.addAnnotatedClass(OrderItems.class);
	   sessionBuilder.addAnnotatedClass(Shipping.class);
	   sessionBuilder.addAnnotatedClass(Order.class);
		  
	   return sessionBuilder.buildSessionFactory();
	   }
   @Autowired
   @Bean("transactionManager")
   public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
	   HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	   return transactionManager;
	  }
   @Autowired
   @Bean("categoryDao")
   public CategoryDao getCategoryDao(SessionFactory sessionFactory) {
	   return new CategoryDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("productDao")
   public ProductDao getProductDao(SessionFactory sessionFactory) {
	   return new ProductDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("supplierDao")
   public SupplierDao getSupplierDao(SessionFactory sessionFactory) {
	   return new SupplierDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("userDao")
   public UserDao getUserDao(SessionFactory sessionFactory) {
	   return new UserDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("billingDao")
   public BillingDao getBillingDao(SessionFactory sessionFactory) {
	   return new BillingDaoImpl(sessionFactory);
	   }
  
   @Autowired
   @Bean("cartDao")
   public CartDao getCartDao(SessionFactory sessionFactory) {
	   return new CartDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("cartitemsDao")
   public CartItemsDao getCartItemsDao(SessionFactory sessionFactory) {
	   return new CartItemsDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("paymentDao")
   public PaymentDao getPaymentDao(SessionFactory sessionFactory) {
	   return new PaymentDaoImpl(sessionFactory);
	   }
   
   @Autowired
   @Bean("orderitemsDao")
   public OrderItemsDao getOrderItemsDao(SessionFactory sessionFactory) {
	   return new OrderItemsDaoImpl(sessionFactory);
	   }
   @Autowired
   @Bean("shippingDao")
   public ShippingDao getShippingDao(SessionFactory sessionFactory) {
	   return new ShippingDaoImpl(sessionFactory);
	   }
  
   @Autowired
   @Bean("orderDao")
   public OrderDao getOrderDao(SessionFactory sessionFactory) {
	   return new OrderDaoImpl(sessionFactory);
	   }
  
  
  
  
}


