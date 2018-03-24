package com.niit.WinBooksBackend.Dao;

import java.util.List;

import com.niit.WinBooksBackend.Model.Payment;
public interface PaymentDao {
	
public boolean saveorupdate(Payment payment);
	
	public boolean delete(Payment payment);
	
	public Payment getPayment(String paymentId);
	
	public List<Payment> list();


}
