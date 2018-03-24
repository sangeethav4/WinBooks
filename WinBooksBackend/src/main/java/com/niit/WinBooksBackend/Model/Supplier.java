package com.niit.WinBooksBackend.Model; 
	
	import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

	import org.springframework.stereotype.Component;

	@Entity
	@Table
	@Component

	public class Supplier {

		@Id
		private String suppId;
		private String suppName;
		private  String address;
		private String phoneno;
		private String email;
		
		@OneToMany()
		private List<Product> product;
		public Supplier()
		{
			this.suppId="SUP"+UUID.randomUUID().toString().substring(30).toUpperCase();
		}
		
		public String getSuppId() {
			return suppId;
		}
		public void setSuppId(String suppId) {
			this.suppId = suppId;
		}
		public String getSuppName() {
			return suppName;
		}
		public void setSuppName(String suppName) {
			this.suppName = suppName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<Product> getProduct() {
			return product;
		}
		public void setProduct(List<Product> product) {
			this.product = product;
		}
	}