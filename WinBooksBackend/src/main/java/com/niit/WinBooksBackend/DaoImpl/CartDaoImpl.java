package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.CartDao;
import com.niit.WinBooksBackend.Model.Cart;

@Repository(" cartDao")
@EnableTransactionManagement
@Transactional
public class CartDaoImpl implements CartDao
{
@Autowired
 
    SessionFactory sessionFactory;


public CartDaoImpl(SessionFactory sessionFactory) {
	this.sessionFactory=sessionFactory;
}


public boolean saveorupdate(Cart cart) {
    sessionFactory.getCurrentSession().saveOrUpdate(cart);	
	return true;
}


public boolean delete(Cart cart) {
   sessionFactory.getCurrentSession().delete(cart);
	return true;
}


public Cart getCart(String cartId) 
{
	
	String cart="From Cart where cartId='"+cartId+"'";
	Query q1=sessionFactory.getCurrentSession().createQuery(cart);
	List<Cart>cartlist=(List<Cart>)q1.list();
	if(cartlist==null||cartlist.isEmpty())
	{
		System.out.println("Cart list not found");
		return null;
	}
	else
	{
		System.out.println("Cart list");
	    return cartlist.get(0);
	
	}
}
	



public List<Cart> list() {
	
	
	List<Cart> cart=(List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	
	return cart;


}

}
