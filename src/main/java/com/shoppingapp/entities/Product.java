package com.shoppingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String productname;
	@Column(length = 3000)
	private String productdescription;
	private String productphoto;
	private int productprice;
	private int productdiscount;
	private int productquantity;
	@ManyToOne
	private Category category;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String productname, String productdescription, String productphoto, int productprice,
			int productdiscount, int productquantity,Category category) {
		super();
		this.productname = productname;
		this.productdescription = productdescription;
		this.productphoto = productphoto;
		this.productprice = productprice;
		this.productdiscount = productdiscount;
		this.productquantity = productquantity;
		this.category = category;
				
	}

	/**
	 * @return the productid
	 */
	public int getProductid() {
		return productid;
	}

	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		this.productid = productid;
	}

	/**
	 * @return the productname
	 */
	public String getProductname() {
		return productname;
	}

	/**
	 * @param productname the productname to set
	 */
	public void setProductname(String productname) {
		this.productname = productname;
	}

	/**
	 * @return the productdescription
	 */
	public String getProductdescription() {
		return productdescription;
	}

	/**
	 * @param productdescription the productdescription to set
	 */
	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	/**
	 * @return the productphoto
	 */
	public String getProductphoto() {
		return productphoto;
	}

	/**
	 * @param productphoto the productphoto to set
	 */
	public void setProductphoto(String productphoto) {
		this.productphoto = productphoto;
	}

	/**
	 * @return the productprice
	 */
	public int getProductprice() {
		return productprice;
	}

	/**
	 * @param productprice the productprice to set
	 */
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	/**
	 * @return the productdiscount
	 */
	public int getProductdiscount() {
		return productdiscount;
	}

	/**
	 * @param productdiscount the productdiscount to set
	 */
	public void setProductdiscount(int productdiscount) {
		this.productdiscount = productdiscount;
	}

	/**
	 * @return the productquantity
	 */
	public int getProductquantity() {
		return productquantity;
	}

	/**
	 * @param productquantity the productquantity to set
	 */
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productdescription="
				+ productdescription + ", productphoto=" + productphoto + ", productprice=" + productprice
				+ ", productdiscount=" + productdiscount + ", productquantity=" + productquantity + ", getProductid()="
				+ getProductid() + ", getProductname()=" + getProductname() + ", getProductdescription()="
				+ getProductdescription() + ", getProductphoto()=" + getProductphoto() + ", getProductprice()="
				+ getProductprice() + ", getProductdiscount()=" + getProductdiscount() + ", getProductquantity()="
				+ getProductquantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
