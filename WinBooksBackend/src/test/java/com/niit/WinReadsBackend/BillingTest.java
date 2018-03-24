package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.BillingDao;
import com.niit.WinBooksBackend.Model.Billing;

public class BillingTest {
	public static void main(String args[]) {
	
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.scan("com.niit.*");
	ctx.refresh();
	Billing bill=(Billing)ctx.getBean("billing");
	BillingDao billingDao=(BillingDao)ctx.getBean("billingDao");
	bill.setBillId("123");
	bill.setHouseno("35");
	bill.setCountry("India");
	bill.setCity("Bangalore");
	bill.setPincode("560056");
	bill.setMobile("9686537461");
            bill.setEmail("p@gmail.com");
	if(billingDao.saveorupdate(bill)==true) 
	{
		System.out.println("Bill is saved successfully");
	}
	else
	{
		System.out.println("Bill is not saved");
	}
	
	bill=billingDao.getBilling("b101");
	if(billingDao.delete(bill)==true)
	{
		System.out.println("Bill deleted");
	}
	else
	{
		System.out.println("Bill not deleted");
	}
	bill=billingDao.getBilling("b102");
	if(bill==null) {
		System.out.println("Bill not found");
	}
	else
	{
		System.out.println(bill.getBillId());
		System.out.println(bill.getHouseno());
		System.out.println(bill.getCountry());
		System.out.println(bill.getCity());
		System.out.println(bill.getPincode());
		System.out.println(bill.getEmail());
		System.out.println(bill.getMobile());
		
	}
	
	
	}
}


