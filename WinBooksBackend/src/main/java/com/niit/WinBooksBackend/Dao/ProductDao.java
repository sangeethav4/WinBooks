package com.niit.WinBooksBackend.Dao;

import java.util.List;


import com.niit.WinBooksBackend.Model.Product;

public interface ProductDao {
	
	public boolean saveorupdate(Product product);
	
	public boolean delete(Product product);
	
	public Product getProduct(String productId);
	
	public List<Product> list();

}

