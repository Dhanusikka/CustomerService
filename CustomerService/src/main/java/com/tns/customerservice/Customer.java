package com.tns.customerservice;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column(name="customerid")
	private int customerid;
	
	@Column(name="customername")
	private String customername;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="salary")
	private double salary;

	
	//Generate getter setter
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	//Generate Constructor -parameterized constructors
	public Customer(int customerid, String customername, String address, String email, String password, double salary) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Generate toString()
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customername=" + customername + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", salary=" + salary + "]";
	}
	
}

