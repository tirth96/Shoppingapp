package com.shoppingapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 10,name = "user_id")
	private int id;
	@Column(length = 100,name = "user_name")
	private String username;
	@Column(length = 100,name = "user_email")
	private String email;
	@Column(length = 100,name = "user_password")
	private String password;
	@Column(length = 12,name = "user_contactno")
	private String contactno;
	@Column(length = 1500,name = "user_address")
	private String address;
	@Column(length = 20,name = "user_type")
	private String usertype;
	/**
	 * @param id
	 * @param username
	 * @param email
	 * @param password
	 * @param contactno
	 * @param address
	 */
	public User(int id, String username, String email, String password, String contactno, String address,String usertype) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
		this.address = address;
		this.usertype = usertype;
	}
	/**
	 * @param username
	 * @param email
	 * @param password
	 * @param contactno
	 * @param address
	 */
	public User(String username, String email, String password, String contactno, String address,String usertype) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.contactno = contactno;
		this.address = address;
		this.usertype = usertype;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the usertype
	 */
	public String getUsertype() {
		return usertype;
	}
	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", contactno=" + contactno + ", address=" + address + ", getId()=" + getId() + ", getUsername()="
				+ getUsername() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getContactno()=" + getContactno() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}

