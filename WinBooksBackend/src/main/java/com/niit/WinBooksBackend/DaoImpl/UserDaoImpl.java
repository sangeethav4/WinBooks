package com.niit.WinBooksBackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.WinBooksBackend.Dao.UserDao;
import com.niit.WinBooksBackend.Model.User;
@Repository("userDao")
@EnableTransactionManagement
@Transactional
public class UserDaoImpl implements UserDao{
	@Autowired
	
	SessionFactory sessionFactory;

   public UserDaoImpl(SessionFactory sessionFactory)
   {
	   this.sessionFactory=sessionFactory;
   }
	
	public boolean saveorupdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
	}

	
	public boolean delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	
	public User getUser(String userId) {
		String cat="From User where userId='"+userId+"'";
		Query q1=sessionFactory.getCurrentSession().createQuery(cat);
		List<User>userlist=(List<User>)q1.list();
		if(userlist==null||userlist.isEmpty()) {
			{
				System.out.println("User list not found");
				return null;
			}
		}
			else
			{
				System.out.println("User tems list");
			    return userlist.get(0);
			}
		}
			


	public List<User> list() {
		
		List<User> user=(List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return user;
	

}
	}


	

	

	
	