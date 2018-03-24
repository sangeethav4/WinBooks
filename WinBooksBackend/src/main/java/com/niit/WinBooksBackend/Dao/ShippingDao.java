package com.niit.WinBooksBackend.Dao;

import java.util.List;

import com.niit.WinBooksBackend.Model.Shipping;



public interface ShippingDao {
public boolean saveorupdate(Shipping shipping);
	
	public boolean delete(Shipping shipping);
	
	public Shipping getShipping(String shipId);
	
	public List<Shipping> list();


}
