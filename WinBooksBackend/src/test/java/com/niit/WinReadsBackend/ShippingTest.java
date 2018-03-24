package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.ShippingDao;
import com.niit.WinBooksBackend.Model.Shipping;

public class ShippingTest
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Shipping ship=(Shipping)ctx.getBean("shipping");
		ShippingDao shipDao=(ShippingDao)ctx.getBean("shippingDao");
		ship.setShipId("sh103");
		ship.setHouseno("35");
		ship.setCountry("India");
		ship.setCity("bangalore");
		ship.setPincode("560056");
		ship.setEmail("abc.com");
		ship.setMobileno("7899428045");
		ship.setFirstname("abc");
		ship.setLastname("def");
		
		if(shipDao.saveorupdate(ship)==true) {
			System.out.println("Ship is saved successfully");
		}
		else
		{
			System.out.println("Ship is not saved");
		}
		
		ship=shipDao.getShipping("sh101");
		if(shipDao.delete(ship)==true)
		{
			System.out.println("Ship deleted");
		}
		else
		{
			System.out.println("Ship not deleted");
		}
		
		ship=shipDao.getShipping("sh101");
		if(ship==null) {
			System.out.println("Ship not found");
		}
		else
		{
			System.out.println(ship.getShipId());
			System.out.println(ship.getHouseno());
			System.out.println(ship.getCountry());
			System.out.println(ship.getCity());
			System.out.println(ship.getPincode());
			System.out.println(ship.getEmail());
			System.out.println(ship.getMobileno());
			System.out.println(ship.getFirstname());
			System.out.println(ship.getLastname());
		}
		
		}
}








