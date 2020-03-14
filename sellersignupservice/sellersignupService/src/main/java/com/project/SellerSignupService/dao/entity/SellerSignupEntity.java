package com.project.SellerSignupService.dao.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "seller_signup_table")
public class SellerSignupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="seller_id")
	 int id;
	 
	@Column(name="seller_username")
	 String username;
	 
	@Column(name="seller_password")
	 String password;
	 
	@Column(name="seller_company")
	 String company;
	
	@Column(name="seller_brief")
	 String brief;
	 
	@Column(name="seller_gst")
	 int gst;
	 
	@Column(name="seller_address")
	 String address;
	
	@Column(name="seller_email")
	 String email;
	
	@Column(name="seller_contact")
	 int contact;
	
	@Column(name="seller_website")
	 String website;

	@OneToMany(mappedBy = "seller")
	Set<ItemEntity> allItems;

	public SellerSignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SellerSignupEntity(int id, String username, String password, String company, String brief, int gst,
			String address, String email, int contact, String website, Set<ItemEntity> allItems) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.company = company;
		this.brief = brief;
		this.gst = gst;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.website = website;
		this.allItems = allItems;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public int getGst() {
		return gst;
	}

	public void setGst(int gst) {
		this.gst = gst;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Set<ItemEntity> getAllItems() {
		return allItems;
	}

	public void setAllItems(Set<ItemEntity> allItems) {
		this.allItems = allItems;
	}

	@Override
	public String toString() {
		return "SellerSignupEntity [id=" + id + ", username=" + username + ", password=" + password + ", company="
				+ company + ", brief=" + brief + ", gst=" + gst + ", address=" + address + ", email=" + email
				+ ", contact=" + contact + ", website=" + website + ", allItems=" + allItems + "]";
	}
	
	
}
	
