package com.niit.WinBooksBackend.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class User {

	@Id
	private String userId;
	private String username;
	private String address;
	private int phoneno;
	private String emailId;
	private String password; 
	@OneToOne
	@JoinColumn(name="billId")
	private Billing  billing;
	
	
	


public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return username;
	}



	public void setUserName(String userName) {
		this.username = userName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(String string) {
		this.phoneno = phoneno;
	}



	public String getEmailiD() {
		return emailId;
	}



	public void setEmailiD(String emailiD) {
		this.emailId = emailiD;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
}

