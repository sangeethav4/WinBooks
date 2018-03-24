package com.niit.WinBooksBackend.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Shipping {
@Id
private String shipId;
private String houseno;
private String country;
private String city;
private String pincode;
private String email;
private String mobileno;
private String firstname;
private String lastname;
@ManyToOne
@JoinColumn(name="user")
private User user;
public String getShipId() {
	return shipId;
}
public void setShipId(String shipId) {
	this.shipId = shipId;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}


}
