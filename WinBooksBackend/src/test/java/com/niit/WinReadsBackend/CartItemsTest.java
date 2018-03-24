package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.CartItemsDao;
import com.niit.WinBooksBackend.Model.CartItems;


public class CartItemsTest {


	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		CartItems cartitems=(CartItems)ctx.getBean("cartItems");
		CartItemsDao cartitDao=(CartItemsDao)ctx.getBean("cartItemsDao");
		cartitems.setCartItemsId("cai101");
		
		if(cartitDao.saveorupdate(cartitems)==true) {
			System.out.println("cartItem is saved successfully");
		}
		else
		{
			System.out.println("cartItem is not saved");
		}
		CartItems c=cartitDao.getCartItems("cai101");
		if(cartitDao.delete(cartitems)==true)
		{
			System.out.println("Cartitem deleted");
		}
		else
		{
			System.out.println("Cartitem not deleted");
		}
		c=cartitDao.getCartItems("cai101");
		if(c==null) {
			System.out.println("CartItem not found");
		}
		else
		{
			System.out.println(c.getCartItemsId());
			
		}
		
		}
}


