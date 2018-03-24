package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.ProductDao;
import com.niit.WinBooksBackend.Model.Product;
@Repository("productDao")
@EnableTransactionManagement
@Transactional
@SuppressWarnings("deprecation")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}


	
	public boolean saveorupdate(Product product) {
	   sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	
	public boolean delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
		return true;
		}

	
	public Product getProduct(String productId) {
		String cat="from Product where productId='"+productId+"'";
		Query q1=sessionFactory.getCurrentSession().createQuery(cat);
		List<Product>prodlist=(List<Product>)q1.list();
		if(prodlist==null||prodlist.isEmpty()) {

			{
				System.out.println("Product Items list not found");
				return null;
			}
		}
			else
			{
				System.out.println("Product list");
			    return prodlist.get(0);
			}
			}
			


	public List<Product> list() {
		
		List<Product> product=(List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return product;
	

}
	}

	


