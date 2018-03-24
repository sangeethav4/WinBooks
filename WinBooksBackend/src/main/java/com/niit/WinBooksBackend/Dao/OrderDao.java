package com.niit.WinBooksBackend.Dao;

import java.util.List;

import com.niit.WinBooksBackend.Model.Order;

public interface OrderDao {
public boolean saveorupdate(Order order);
	
	public boolean delete(Order order);
	
	public Order getOrder(String orderId);
	
	public List<Order> list();


}
