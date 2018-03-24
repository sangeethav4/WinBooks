
package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.CategoryDao;
import com.niit.WinBooksBackend.Model.Category;

@Repository("categoryDao")
@EnableTransactionManagement
@Transactional
@SuppressWarnings("deprecation")
public class CategoryDaoImpl implements CategoryDao{
	
	@Autowired
	
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	
	public boolean saveorupdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}

	public boolean delete(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		return true;
	}

	
	public Category getCategory(String catId) {
		String cat="From Category where catId='"+catId+"'";
		Query q1=sessionFactory.getCurrentSession().createQuery(cat);
		List<Category> catlist= (List<Category>)q1.list();
		if(catlist==null||catlist.isEmpty())
		{ 
			System.out.println("category list not found");
			return null;
		}
		else
		{
		System.out.println("category list");
		return catlist.get(0);
		}
	}

	 
		public List<Category> list()
		{
			List<Category> category=(List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
				return category;
			
	 
	}

}
