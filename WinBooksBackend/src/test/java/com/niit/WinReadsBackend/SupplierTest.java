package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.SupplierDao;
import com.niit.WinBooksBackend.Model.Supplier;

public class SupplierTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Supplier supplier=(Supplier)ctx.getBean("supplier");
		SupplierDao supplierDao=(SupplierDao)ctx.getBean("supplierDao");
		supplier.setSuppId("s103");
		supplier.setSuppName("supplier3");
		supplier.setAddress("About supplier3");
		supplier.setPhoneno("9451545121");
        supplier.setEmail("abcd@gmail.com");
		if(supplierDao.saveorupdate(supplier)==true) {
			System.out.println("supplier is saved successfully");
		}
		else
		{
			System.out.println("Supplier is not saved");
		}
		supplier=supplierDao.getSupplier("s101");
		if(supplierDao.delete(supplier)==true)
		{
			System.out.println("Supplier deleted");
		}
		else
		{
			System.out.println("Supplier not deleted");
		}
		supplier=supplierDao.getSupplier("s102");
		if(supplier==null) {
			System.out.println("Supplier not found");
		}
		else
		{
			System.out.println(supplier.getSuppId());
			System.out.println(supplier.getSuppName());
			System.out.println(supplier.getAddress());
			System.out.println(supplier.getPhoneno());
            System.out.println(supplier.getEmail());
		}
		
		}
}


