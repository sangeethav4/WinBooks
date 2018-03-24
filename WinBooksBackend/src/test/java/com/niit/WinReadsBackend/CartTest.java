package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.CartDao;
import com.niit.WinBooksBackend.Model.Cart;

public class CartTest {
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Cart cart=(Cart)ctx.getBean("cart");
		CartDao cartDao=(CartDao)ctx.getBean("cartDao");
		cart.setCartId("ca102");
		cart.setGrandtotal(36.0);
		cart.setTotalitem(7);
		if(cartDao.saveorupdate(cart)==true)
		{
			System.out.println("cart is saved successfully");
		}
		else
		{
			System.out.println("cart is not saved");
		}
		
		cart=cartDao.getCart("ca101");
		if(cartDao.delete(cart)==true)
		{
			System.out.println("Cart deleted");
		}
		else
		{
			System.out.println("Cart not deleted");
		}
		
		cart=cartDao.getCart("ca101");
		if(cart==null) {
			System.out.println("Cart not found");
		}
		else
		{
			System.out.println(cart.getCartId());
			System.out.println(cart.getGrandtotal());
			System.out.println(cart.getTotalitem());
		}
		
		}
}


