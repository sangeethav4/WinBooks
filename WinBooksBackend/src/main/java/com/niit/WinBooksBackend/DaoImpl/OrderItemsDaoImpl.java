package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.OrderItemsDao;
import com.niit.WinBooksBackend.Model.OrderItems;
import com.niit.WinBooksBackend.Model.Payment;
@Repository("orderitemsDao")
@EnableTransactionManagement
@Transactional
public class OrderItemsDaoImpl implements OrderItemsDao
{
  @Autowired
  
  SessionFactory sessionFactory;
  
 public OrderItemsDaoImpl(SessionFactory sessionFactory)
 {
	 this.sessionFactory=sessionFactory;
 }

public boolean saveorupdate(OrderItems orderitems) {
	sessionFactory.getCurrentSession().saveOrUpdate(orderitems);
	return false;
}


public boolean delete(OrderItems orderitems) {
	sessionFactory.getCurrentSession().delete(orderitems);
	return false;
}


public OrderItems getOrderItems (String orderitemsId)
{
	String cat="From OrderItems where orderId='"+orderitemsId+"'";
	Query q1=sessionFactory.getCurrentSession().createQuery(cat);
	List<OrderItems> orderitemslist= (List<OrderItems>)q1.list();
	if(orderitemslist==null||orderitemslist.isEmpty())
	{
		System.out.println("OrderItems list not found");
		return null;
	}
	else
	{
		System.out.println("OrderItems list");
	    return orderitemslist.get(0);
	}
}
	    		
	public List<OrderItems> list() {
	
	List<OrderItems> orderitems=(List<OrderItems>) sessionFactory.getCurrentSession().createCriteria(OrderItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return orderitems;


}
}
  

