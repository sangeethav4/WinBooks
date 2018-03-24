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
public class CartItems {
	@Id
	private String cartItemsId;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	public String getCartItemsId() {
		return cartItemsId;
	}
	public void setCartItemsId(String cartItemsId) {
		this.cartItemsId = cartItemsId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
