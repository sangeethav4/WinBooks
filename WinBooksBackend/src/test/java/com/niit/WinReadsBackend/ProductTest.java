package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Dao.ProductDao;
import com.niit.WinBooksBackend.Model.Category;
import com.niit.WinBooksBackend.Model.Product;

public class ProductTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		Product product=(Product)ctx.getBean("product");
		ProductDao productDao=(ProductDao)ctx.getBean("productDao");
		Category category=(Category)ctx.getBean("category");
		CategoryDao categoryDao=(CategoryDao)ctx.getBean("categoryDao");
	    
	     product.setProductId("p101");
		 product.setProductname("prod1");
		 product.setPrice(343.0);
		 product.setQuantity(3);
		 category=categoryDao.getCategory("c101");
		 product.setCategory(category);
		 
		if(productDao.saveorupdate(product)==true) {
		System.out.println("Product is saved successfully");
		}
		else		{
		System.out.println("Product is not saved");
		}
		product.setProductId("p102");
		 product.setProductname("prod2");
		 product.setPrice(343.0);
		 product.setQuantity(3);
		 category=categoryDao.getCategory("c101");
		 product.setCategory(category);
		 
		if(productDao.saveorupdate(product)==true) {
			System.out.println("product is saved successfully");
		}
		else
		{
		System.out.println("product is not saved");
		}
		product=productDao.getProduct("c102");
		if(productDao.delete(product)==true)
		{
			System.out.println("Product deleted");
		}
		else
		{
			System.out.println("Product not deleted");
		}
		product=productDao.getProduct("c103");
		if(product==null) {
			System.out.println("Product not found");
		}
		else
		{
			System.out.println(product.getProductId());
			System.out.println(product.getProductId());
			System.out.println(product.getPrice());
			System.out.println(product.getQuantity());
			System.out.println(product.getDescription());
		}
		
		}
}
	





