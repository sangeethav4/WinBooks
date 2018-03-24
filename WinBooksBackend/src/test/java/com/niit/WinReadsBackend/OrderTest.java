package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.OrderDao;
import com.niit.WinBooksBackend.Model.Order;

public class OrderTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Order order=(Order)ctx.getBean("order");
		OrderDao orderDao=(OrderDao)ctx.getBean("orderDao");
		order.setOrderId("o101");
		order.setGrandtotal(36.0);
		order.setOrdertime("5:00 pm");
		if(orderDao.saveorupdate(order)==true) {
			System.out.println("order is saved successfully");
		}
		else
		{
			System.out.println("order is not saved");
		}
		order=orderDao.getOrder("o101");
		if(orderDao.delete(order)==true)
		{
			System.out.println("Order deleted");
		}
		else
		{
			System.out.println("Order not deleted");
		}
		order=orderDao.getOrder("o101");
		if(order==null) {
			System.out.println("Order not found");
		}
		else
		{
			System.out.println(order.getOrderId());
			System.out.println(order.getGrandtotal());
			System.out.println(order.getOrdertime());
		}
		
		}
}






