package com.example.demo.Entity;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Donor_Details")
public class DonationEntity 
{
	@Id
	@Column(name="Donor ID")
	private int donid;
	@Column(name="Donor Name")
	private String doname;
//	@Column(name="User Name")
//	private String uname;
//	@Column(name="First Name")
//	private String fname;
//	@Column(name="Last Name")
//	private String lname;
	@Column(name="Gender")
	private String gender;
	@Column(name="Age")
	private int age;
	@Column(name="Email")
	private String email;
//	@Column(name="User Password")
//	private String upassword;
	@Column(name="Mobile Number")
	private int mobno;
	@Column(name="Blood Group")
	private String bgrp;
	@Column(name="Address")
	private String address;
//	@Column(name="Password")
//	private String password;
//	@Column(name="Confirm Password")
//	private String cpassword;
	@Column(name="Units [ in ml ]")
	private int units;
	@Column(name="Diseases [ If Any ]")
	private String disease;
	public int getDonid() {
		return donid;
	}
	public void setDonid(int donid) {
		this.donid = donid;
	}
//	public int getSno() {
//		return sno;
//	}
//	public void setSno(int sno) {
//		this.sno = sno;
//	}
	public String getDoname() {
		return doname;
	}
	public void setDoname(String doname) {
		this.doname = doname;
	}
//	public String getUname() {
//		return uname;
//	}
//	public void setUname(String uname) {
//		this.uname = uname;
//	}
//	public String getFname() {
//		return fname;
//	}
//	public void setFname(String fname) {
//		this.fname = fname;
//	}
//	public String getLname() {
//		return lname;
//	}
//	public void setLname(String lname) {
//		this.lname = lname;
//	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public String getUpassword() {
//		return upassword;
//	}
//	public void setUpassword(String upassword) {
//		this.upassword = upassword;
//	}
//	
//	public String getCpassword() {
//		return cpassword;
//	}
//	public void setCpassword(String cpassword) {
//		this.cpassword = cpassword;
//	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getBgrp() {
		return bgrp;
	}
	public void setBgrp(String bgrp) {
		this.bgrp = bgrp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public DonationEntity(int donid, String doname, String gender,
			int age, String email, int mobno, String bgrp, String address, int units, String disease) {
		super();
		this.donid = donid;
//		this.sno = sno;
		this.doname = doname;
//		this.uname = uname;
//		this.fname = fname;
//		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.email = email;
//		this.upassword = upassword;
//		this.cpassword=cpassword;
		this.mobno = mobno;
		this.bgrp = bgrp;
		this.address = address;
//		this.password = password;
		this.units = units;
		this.disease = disease;
	}
	public DonationEntity()
	{
		
	}
}
