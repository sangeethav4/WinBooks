package com.niit.WinBooksFrontend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Model.Category;


@Controller

public class CategoryController {
	@Autowired
	Category category;
	
	@Autowired
	CategoryDao categoryDao;
	

	@RequestMapping("/Category")
	public ModelAndView Category()
	{
	    List<Category> catlist= categoryDao.list();
		ModelAndView mv= new ModelAndView("Category");
		mv.addObject("category", new Category());
		mv.addObject("categories",catlist);
		return mv;
		
	}
	
	
	@RequestMapping("/addcat")
	public ModelAndView addcat(@ModelAttribute("category")Category category)
	{
		ModelAndView mv1= new ModelAndView("redirect:/Category");
		if(categoryDao.saveorupdate(category)==true)
		{
			System.out.println("Category is saved");
			mv1.addObject("msg", "Category is saved");
		}
		else
		{
			System.out.println("Category is not saved");
			mv1.addObject("msg", "Category is not saved");
		}
		return mv1;
	}
	
	

	@RequestMapping("/editcat/{catid}")
	public ModelAndView editcategory(@PathVariable("catid")String catid)
	{
		ModelAndView mv= new ModelAndView("Category");
		category= categoryDao.getCategory(catid);
		mv.addObject("category", category);
		List<Category> catlist= categoryDao.list();
		mv.addObject("categories", catlist);
		return mv;
	}


    @RequestMapping("/delete/{catId}")
    public ModelAndView deleteCat(@PathVariable("catId")String catId)
    {
    	category=categoryDao.getCategory(catId);
    	ModelAndView mv=new ModelAndView("redirect:/Category");
    	List<Category> catlist=categoryDao.list();
    	if(categoryDao.delete(category)==true)
    	{
        mv.addObject("msg1", "category deleted");
    	}
    	
    	else
    	{
    		mv.addObject("msg1", "category not deleted");
  
    	}
    		return mv;
    	}
}


