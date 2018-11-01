package com.capg.xyzwallet.bean; 

import java.math.BigInteger;
  public class WalletBean { 
  	private BigInteger phoneNumber; 
  	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}
	
	private String fName; 
 	private String lName; 
  	private BigInteger targetMobileNum; 
  	private String email; 
 	private String address; 
 	private double balance; 
 	private double amount;
 	private String pan;
 	
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
  	   	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
		public double getBalance() { 
  		return balance; 
  	} 
  	public void setBalance(double balance) { 
 		this.balance = balance; 
  	} 
  	
  	public String getfName() { 
 		return fName; 
 	} 
 	public void setfName(String fName) { 
 		this.fName = fName; 
 	} 
 	public String getlName() { 
  		return lName; 
  	} 
  	public void setlName(String lName) { 
 		this.lName = lName; 
 	} 
	public BigInteger gettargetMobileNum() {
		return targetMobileNum;
	}
	public void settargetMobileNum(BigInteger targetMobileNum) {
		this.targetMobileNum = targetMobileNum;
	}
	public String getEmail() { 
  		return email; 
  	} 
  	public void setEmail(String email) { 
 		this.email = email; 
 	} 
  	public String getAddress() { 
  		return address; 
  	} 
  	public void setAddress(String address) { 
 		this.address = address; 
  	} 
  	@Override
	public String toString() {
		return "WalletBean [phoneNumber=" + phoneNumber + ", fName=" + fName
				+ ", lName=" + lName + ", targetMobileNum="
				+ targetMobileNum + ", email=" + email + ", address="
				+ address + ", balance=" + balance + ", amount=" + amount + "]";
	}
	public WalletBean(BigInteger phoneNumber, String fName, String lName,
			BigInteger targetMobileNum, String email, String address,
			double balance, double amount) {
		super();
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.lName = lName;
		this.targetMobileNum = targetMobileNum;
		this.email = email;
		this.address = address;
		this.balance = balance;
		this.amount = amount;
	} 
  	public WalletBean() {
  		super();
  	}
  
   } 
