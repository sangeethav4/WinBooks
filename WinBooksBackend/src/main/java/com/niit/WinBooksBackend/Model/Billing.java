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

public class Billing {
@Id
private String billId;
private String houseno;
private String country;
private String city;
private String pincode;
private String mobile;
private String email;
@OneToOne
@JoinColumn(name="userId")
private User user;



public String getBillId() {
	return billId;
}
public void setBillId(String billId) {
	this.billId = billId;
}
public String getHouseno() {
	return houseno;
}
public void setHouseno(String houseno) {
	this.houseno = houseno;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}







