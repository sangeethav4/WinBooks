package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.CartItemsDao;
import com.niit.WinBooksBackend.Model.CartItems;

@Repository("caritemsDao")
@EnableTransactionManagement
@Transactional
public class CartItemsDaoImpl implements CartItemsDao{
  @Autowired
  SessionFactory sessionFactory;
  
  public CartItemsDaoImpl(SessionFactory sessionFactory)
  {
	  this.sessionFactory=sessionFactory;
  }

@Override
public boolean saveorupdate(CartItems cartitems) {
	sessionFactory.getCurrentSession().saveOrUpdate(cartitems);
	return true;
}

@Override
public boolean delete(CartItems cartitems) {
	sessionFactory.getCurrentSession().delete(cartitems);
	
	return true;
}


public CartItems getCartItems(String cartitemsId) {
	String cat="From CartItems where cartitemsId='"+cartitemsId+"'";	
    Query q1=sessionFactory.getCurrentSession().createQuery(cat);
	
	List<CartItems> cartitemslist= (List<CartItems>)q1.list();
	if(cartitemslist==null||cartitemslist.isEmpty())
	{
		System.out.println("CartItems list not found");
		return null;
	}
	else
	{
		System.out.println("CartItems list");
	    return cartitemslist.get(0);
	}

}




public List<CartItems> list() {
	List<CartItems> cartitems=(List<CartItems>) sessionFactory.getCurrentSession().createCriteria(CartItems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return cartitems;
}
}
