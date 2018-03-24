package com.niit.WinBooksBackend.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component


public class Cart {
 @Id
 private String cartId;
 private  Double grandtotal=0.0;
 private int totalitem=0;
 @OneToMany(mappedBy="cart")
 private List<CartItems> cartItems;
 
 
 
 
 
public String getCartId() {
	return cartId;
}
public void setCartId(String cartId) {
	this.cartId = cartId;
}
public Double getGrandtotal() {
	return grandtotal;
}
public void setGrandtotal(Double grandtotal) {
	this.grandtotal = grandtotal;
}
public int getTotalitem() {
	return totalitem;
}
public void setTotalitem(int totalitem) {
	this.totalitem = totalitem;
}
}

