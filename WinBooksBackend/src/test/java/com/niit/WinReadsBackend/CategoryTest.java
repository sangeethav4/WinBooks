package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Model.Category;

     public class CategoryTest {
	 public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		
	    Category category=(Category)ctx.getBean("category");
		CategoryDao categoryDao=(CategoryDao)ctx.getBean("categoryDao");
		
	    category.setCatId("c101");
		category.setCatname("category1");
		if(categoryDao.saveorupdate(category)==true) {
		System.out.println("category is saved successfully");
		}
		else		{
		System.out.println("category is not saved");
		}
		
		category.setCatId("c102");
		category.setCatname("category2");
		if(categoryDao.saveorupdate(category)==true) {
			System.out.println("category is saved successfully");
		}
		else
		{
		System.out.println("category is not saved");
		}
		
		category.setCatId("c103");
		category.setCatname("category3");
		if(categoryDao.saveorupdate(category)==true) {
			System.out.println("category is saved successfully");
		}
		else
		{
		System.out.println("category is not saved");
		}
		
		category=categoryDao.getCategory("c102");
		if(categoryDao.delete(category)==true)
		{
			System.out.println("Category deleted");
		}
		else
		{
			System.out.println("Category not deleted");
		}
		
		category=categoryDao.getCategory("c103");
		if(category==null) {
			System.out.println("Category not found");
		}
		else
		{
			System.out.println(category.getCatId());
			System.out.println(category.getCatname());
		}
//		List<Category> cat=categoryDao.list();
//		for(Category c:cat)
//		{
//			System.out.println(c.getCatId());
//			System.out.println(c.getCatName());		}
//		
		}
}
	


