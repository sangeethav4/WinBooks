package com.niit.WinBooksBackend.Model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component

public class Product {
@Id
private String productId;
private String productname;
private Double price;
private int quantity;
@Transient
private MultipartFile pimg;

public MultipartFile getPimg() {
	return pimg;
}

public void setPimg(MultipartFile pimg) {
	this.pimg = pimg;
}
private String description;
@ManyToOne
@JoinColumn(name="catId")
private Category category;
@ManyToOne
@JoinColumn(name="suppId")
private Supplier supplier;
 public Product()
 {
 this.productId="PROD"+UUID.randomUUID().toString().substring(30).toUpperCase();
 }

public String getProductId() {
	return productId;
}
public void setProductId(String productId) {
	this.productId = productId;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public Supplier getSupplier() {
	return supplier;
}
public void setSupplier(Supplier supplier) {
	this.supplier = supplier;
}

}


