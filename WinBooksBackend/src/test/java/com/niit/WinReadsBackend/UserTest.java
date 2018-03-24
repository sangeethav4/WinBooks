package com.niit.WinReadsBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.WinBooksBackend.Dao.UserDao;
import com.niit.WinBooksBackend.Model.User;

public class UserTest {
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.*");
		ctx.refresh();
		User user=(User)ctx.getBean("user");
		UserDao userDao=(UserDao)ctx.getBean("userDao");
		user.setUserId("u102");
		user.setUserName("user");
		user.setAddress("About user2");
		user.setPhoneno("9686537461");
		user.setEmailiD("abcd@gmail.com");
		user.setPassword("casino");
		if(userDao.saveorupdate(user)==true) {
			System.out.println("User is saved successfully");
		}
		else
		{
			System.out.println("User is not saved");
		}
		user=userDao.getUser("u102");
		if(user==null) {
			System.out.println("User not found");
		}
		else
		{
			System.out.println(user.getUserId());
			System.out.println(user.getUserName());
			System.out.println(user.getAddress());
			System.out.println(user.getPhoneno());
			System.out.println(user.getEmailiD());
			System.out.println(user.getPassword());
		}
		
		}
}






