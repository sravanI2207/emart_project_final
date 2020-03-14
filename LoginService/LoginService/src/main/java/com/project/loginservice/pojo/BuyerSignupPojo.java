package com.project.loginservice.pojo;

import java.util.Date;
import java.util.Set;

public class BuyerSignupPojo {
	private int id;
	Set<BillPojo> allBills;
	private String username;
	private String password;
	private String email;
	private int mobile;
	private Date date;
	public BuyerSignupPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyerSignupPojo(int id, Set<BillPojo> allBills, String username, String password, String email, int mobile,
			Date date) {
		super();
		this.id = id;
		this.allBills = allBills;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Set<BillPojo> getAllBills() {
		return allBills;
	}
	public void setAllBills(Set<BillPojo> allBills) {
		this.allBills = allBills;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BuyerSignupPojo [id=" + id + ", allBills=" + allBills + ", username=" + username + ", password="
				+ password + ", email=" + email + ", mobile=" + mobile + ", date=" + date + "]";
	}

	
	
}