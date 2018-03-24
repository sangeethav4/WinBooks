package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.OrderDao;
import com.niit.WinBooksBackend.Model.Order;
@Repository("orderDao")
@EnableTransactionManagement
@Transactional
public class OrderDaoImpl  implements OrderDao
{
@Autowired
 SessionFactory sessionFactory;

public OrderDaoImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}



public boolean saveorupdate(Order order) {
   sessionFactory.getCurrentSession().saveOrUpdate(order);
	return true;
}


public boolean delete(Order order) {
	sessionFactory.getCurrentSession().saveOrUpdate(order);
	return true;
}


public Order getOrder(String orderId) 
{
	String cat="From Order where orderId='"+orderId+"'";
	Query q1=sessionFactory.getCurrentSession().createQuery(cat);
	List<Order>orderlist=(List<Order>)q1.list();
	if(orderlist==null||orderlist.isEmpty())
	{
		System.out.println("Order list not found");
		return null;
	}
	else
	{
		System.out.println("Order  list");
	    return orderlist.get(0);
	}
}
	
public List<Order> list() {

	List<Order> order=(List<Order>) sessionFactory.getCurrentSession().createCriteria(Order.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return order;


}
}

