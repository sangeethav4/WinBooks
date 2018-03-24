package com.niit.WinBooksBackend.Dao;

import java.util.List;
import com.niit.WinBooksBackend.Model.CartItems;


public interface CartItemsDao
{
   public boolean saveorupdate(CartItems cartitem);
	
	public boolean delete(CartItems cartitems);
	
	public CartItems getCartItems(String cartitemsId);
	
	public List<CartItems> list();




}
