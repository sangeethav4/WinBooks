package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.ShippingDao;
import com.niit.WinBooksBackend.Model.Category;
import com.niit.WinBooksBackend.Model.Shipping;
@Repository("shippingDao")
@EnableTransactionManagement
@Transactional
public class ShippingDaoImpl implements ShippingDao
{
  @Autowired
   SessionFactory sessionFactory;
  
	public ShippingDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}



public boolean saveorupdate(Shipping shipping) {
	sessionFactory.getCurrentSession().saveOrUpdate(shipping);
	return true;
}


public boolean delete(Shipping shipping) 
{
	sessionFactory.getCurrentSession().delete(shipping);
	return true;
}


public Shipping getShipping(String shipId) {
	String cat="From Shipping where catId='"+shipId+"'";
	Query q1=sessionFactory.getCurrentSession().createQuery(cat);
	List<Shipping> shiplist= (List<Shipping>)q1.list();
	if(shiplist==null||shiplist.isEmpty())

	{
		System.out.println("Shipping Items list not found");
		return null;
	}
	else
	{
		System.out.println("Shipping list");
	    return shiplist.get(0);
	}
}
	
	
	



public List<Shipping> list() {
	List<Shipping> shipping=(List<Shipping>) sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return shipping;
	}
}

