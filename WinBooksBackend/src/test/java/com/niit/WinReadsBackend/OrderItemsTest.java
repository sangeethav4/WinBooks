package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.OrderItemsDao;
import com.niit.WinBooksBackend.Model.OrderItems;

public class OrderItemsTest {
	public static void main(String args[])
	{
	

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		OrderItems orderitems=(OrderItems)ctx.getBean("orderItems");
		OrderItemsDao orderitemsDao=(OrderItemsDao)ctx.getBean("orderItemsDao");
		orderitems.setOrderItemId("109");
		orderitems.setProductId("5489");
		if(orderitemsDao.saveorupdate(orderitems)==true) {
			System.out.println("orderItem is saved successfully");
		}
		else
		{
			System.out.println("orderItem is not saved");
		}
		orderitems=orderitemsDao.getOrderItems("101");
		if(orderitemsDao.delete(orderitems)==true)
		{
			System.out.println("Orderitems deleted");
		}
		else
		{
			System.out.println("Orderitems not deleted");
		}
		orderitems=orderitemsDao.getOrderItems("oi101");
		if(orderitems==null) {
			System.out.println("OrderItems not found");
		}
		else
		{
			System.out.println(orderitems.getOrderItemId());
			System.out.println(orderitems.getProductId());
		}
		
		}
}





