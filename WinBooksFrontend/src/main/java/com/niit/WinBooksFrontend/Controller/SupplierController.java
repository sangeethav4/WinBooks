package com.niit.WinBooksFrontend.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.WinBooksBackend.Dao.SupplierDao;
import com.niit.WinBooksBackend.Model.Supplier;



@Controller

public class SupplierController {
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDao supplierDao;
	

	@RequestMapping("/Supplier")
	public ModelAndView Supplier()
	{
	    List<Supplier> supplist= supplierDao.list();
		ModelAndView mv= new ModelAndView("Supplier");
		mv.addObject("supplier", new Supplier());
		mv.addObject("suppliers",supplist);
		return mv;
		
	}
	
	
	@RequestMapping("/addsupplier")
	public ModelAndView addsupp(@ModelAttribute("supplier")Supplier supplier)
	{
		ModelAndView mv1= new ModelAndView("redirect:/Supplier");
		if(supplierDao.saveorupdate(supplier)==true)
		{
			System.out.println("Supplier is saved");
			mv1.addObject("msg", "Supplier is saved");
		}
		else
		{
			System.out.println(" Supplier is not saved");
			mv1.addObject("msg", "Supplier is not saved");
		}
		return mv1;
	}
	
	

	@RequestMapping("/editsupplier/{suppId}")
	public ModelAndView editsupplier(@PathVariable("suppId")String suppId)
	{
		ModelAndView mv= new ModelAndView("Supplier");
		supplier= supplierDao.getSupplier(suppId);
		mv.addObject("supplier", supplier);
		List<Supplier> supplist= supplierDao.list();
		mv.addObject("suppliers", supplist);
		return mv;
	}


    @RequestMapping("/deleteSupplier/{suppId}")
    public ModelAndView deleteCat(@PathVariable("suppId")String suppId)
    {
    	supplier=supplierDao.getSupplier(suppId);
    	ModelAndView mv=new ModelAndView("redirect:/Supplier");
    	List<Supplier> supplist=supplierDao.list();
    	if(supplierDao.delete(supplier)==true)
    	{
        mv.addObject("msg1", "Supplier deleted");
    	}
    	
    	else
    	{
    		mv.addObject("msg1", "Supplier not deleted");
  
    	}
    		return mv;
    	}
}


