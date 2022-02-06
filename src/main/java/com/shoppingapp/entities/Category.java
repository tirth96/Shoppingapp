package com.shoppingapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	private String categoryname;
	private String categorydescription;
	@OneToMany(mappedBy = "category")
	private List<Product> products  = new ArrayList<Product>();
	
	public Category(int categoryid, String categoryname, String categorydescription) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.categorydescription = categorydescription;
	}

	public Category(String categoryname, String categorydescription,List<Product> products) {
		super();
		this.categoryname = categoryname;
		this.categorydescription = categorydescription;
		this.products = products;
	}

	/**
	 * @return the categoryid
	 */
	public int getCategoryid() {
		return categoryid;
	}

	/**
	 * @param categoryid the categoryid to set
	 */
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	/**
	 * @return the categoryname
	 */
	public String getCategoryname() {
		return categoryname;
	}

	/**
	 * @param categoryname the categoryname to set
	 */
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	/**
	 * @return the categorydescription
	 */
	public String getCategorydescription() {
		return categorydescription;
	}

	/**
	 * @param categorydescription the categorydescription to set
	 */
	public void setCategorydescription(String categorydescription) {
		this.categorydescription = categorydescription;
	}
	
	

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryname=" + categoryname + ", categorydescription="
				+ categorydescription + ", getCategoryid()=" + getCategoryid() + ", getCategoryname()="
				+ getCategoryname() + ", getCategorydescription()=" + getCategorydescription() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
