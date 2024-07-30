package com.tka.DataBaseDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Person {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(unique = true)
	int id;
	String fname;
	String emailid;
	String mobileno;
	String adharno;
	String password;
	public Person() {
		
	}
	
	public Person(String fname, String emailid, String mobileno	,String adharno,
	String password) {
		super();
		this.fname = fname;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.adharno = adharno;
		this.password = password;
	}
	
		public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		@Override
		public String toString() {
			return "Person [id=" + id + ", fname=" + fname + ", emailid=" + emailid + ", mobileno=" + mobileno
					+ ", adharno=" + adharno + ", password=" + password + "]";
		}
	
	
	
}
