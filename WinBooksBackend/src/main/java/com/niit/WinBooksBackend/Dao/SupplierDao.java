package com.niit.WinBooksBackend.Dao;
import java.util.List;

import com.niit.WinBooksBackend.Model.Supplier;

public interface SupplierDao {
	
	public boolean saveorupdate(Supplier supplier);
	
	public boolean delete(Supplier supplier);
	
	public Supplier getSupplier(String suppId);
	
	public List<Supplier> list();

}
