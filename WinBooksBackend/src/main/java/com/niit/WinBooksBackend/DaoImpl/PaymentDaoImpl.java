package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.PaymentDao;
import com.niit.WinBooksBackend.Model.Category;
import com.niit.WinBooksBackend.Model.Payment;
@Repository("paymentDao")
@EnableTransactionManagement
@Transactional
public class PaymentDaoImpl implements PaymentDao
{
 @Autowired
   SessionFactory sessionFactory;
 
  public PaymentDaoImpl(SessionFactory sessionFactory)
  {
    this.sessionFactory=sessionFactory;
  }
  


public boolean saveorupdate(Payment payment) 
{
	sessionFactory.getCurrentSession().saveOrUpdate(payment);
	return true;
}


public boolean delete(Payment payment) 
{
	sessionFactory.getCurrentSession().delete(payment);
	   return true;
}


public Payment getPayment(String paymentId)
{
	String cat="From Payment where paymentId='"+paymentId+"'";	
	Query q1=sessionFactory.getCurrentSession().createQuery(cat);
	List<Payment> paymentlist= (List<Payment>)q1.list();
	if(paymentlist==null||paymentlist.isEmpty())
	{
		System.out.println("PaymentItems list not found");
		return null;
	}
	else
	{
		System.out.println("CartItems list");
	    return paymentlist.get(0);
	}
}
	



public List<Payment> list() {
	List<Payment> payment=(List<Payment>) sessionFactory.getCurrentSession().createCriteria(Payment.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return payment;
}
}
 

