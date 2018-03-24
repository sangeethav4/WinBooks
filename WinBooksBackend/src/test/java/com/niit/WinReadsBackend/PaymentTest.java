package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.PaymentDao;
import com.niit.WinBooksBackend.Model.Payment;

public class PaymentTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Payment payment=(Payment)ctx.getBean("pay");
		PaymentDao paymentDao=(PaymentDao)ctx.getBean("payDao");
		payment.setPaymentId("pay101");
		payment.setPaymentmethod("cash");
		payment.setPaymentstatus("processing");
		if(paymentDao.saveorupdate(payment)==true) {
			System.out.println("payment is saved successfully");
		}
		else
		{
			System.out.println("payment is not saved");
		}
		payment=paymentDao.getPayment("pay101");
		if(paymentDao.delete(payment)==true)
		{
			System.out.println("Payment deleted");
		}
		else
		{
			System.out.println("Payment not deleted");
		}
		payment=paymentDao.getPayment("pay101");
		if(payment==null) {
			System.out.println("Payment not found");
		}
		else
		{
			System.out.println(payment.getPaymentId());
			System.out.println(payment.getPaymentmethod());
			System.out.println(payment.getPaymentstatus());
		}
		
		}
}








