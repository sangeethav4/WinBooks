package com.niit.WinBooksFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.WinBooks.Fileinput.Fileinput;
import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Dao.ProductDao;
import com.niit.WinBooksBackend.Dao.SupplierDao;
import com.niit.WinBooksBackend.Model.Category;
import com.niit.WinBooksBackend.Model.Product;
import com.niit.WinBooksBackend.Model.Supplier;


@Controller

public class ProductController {

	@Autowired
	   Product product;
	   
	   @Autowired
	   ProductDao productDao;
	   @Autowired
	   Category category;
	   @Autowired
	   CategoryDao categoryDao;
	   @Autowired 
	   Supplier supplier;
	   @Autowired
	   SupplierDao supplierDao;
	   String path="C:\\Users\\guest 1\\eclipse-workspace\\WinBooksFrontend\\src\\main\\webapp\\resources\\image\\";
	   @RequestMapping("/product")
	   public ModelAndView Product()
	   {
		   ModelAndView mv=new ModelAndView("Product");
		  
		   mv.addObject("product", new Product());
		   List<Category> catlist=categoryDao.list();
		   mv.addObject("categories", catlist);
		   List<Supplier> supplist=supplierDao.list();
		   mv.addObject("suppliers", supplist);
		   List<Product> prodlist=productDao.list();
		   mv.addObject("products", prodlist);
		return mv;
		   
	   }
	   
		@RequestMapping("/addproduct")
		public ModelAndView addproduct(@ModelAttribute("product")Product product)
		{
			ModelAndView mv1= new ModelAndView("redirect:/product");
			mv1.addObject("product", product);
			if(productDao.saveorupdate(product)==true)
			{
				Fileinput.upload(path,product.getPimg(),product.getProductId()+".jpg");
				System.out.println("product is saved");
				mv1.addObject("msg", "product is saved");
			}
			else
			{
				System.out.println("Product is not saved");
				mv1.addObject("msg", "Product is not saved");
			}
			return mv1;
		}
		
		@RequestMapping("/editproduct/{productId}")
		public ModelAndView editproduct(@PathVariable("productId")String productId)
		{
			ModelAndView mv=new ModelAndView("product");
			product=productDao.getProduct(productId);
			List<Category> catlist=categoryDao.list();
			   mv.addObject("categories", catlist);
			   List<Supplier> suplist=supplierDao.list();
			   mv.addObject("suppliers", suplist);
			mv.addObject("product", product);
			List<Product> prodlist=productDao.list();
			mv.addObject("products", prodlist);
			return mv;
		}
		
		@RequestMapping("/deleteProduct/{productId}")
		public ModelAndView deleteproduct(@PathVariable("productId")String productId)
		{
			ModelAndView mv=new ModelAndView("redirect:/product");
			product=productDao.getProduct(productId);
			if(productDao.delete(product)==true)
			{
				mv.addObject("msg1","product deleted");
				
			}
			else
			{
				mv.addObject("msg1","product not deleted");
			}
			return mv;
		}
}
		
	   
	   
	


