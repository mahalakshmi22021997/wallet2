package com.capg.xyzwallet.bean;

/*import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;*/

public class WalletTransaction {

//	private LocalDateTime tDate;
	private String tType;
	private String receipentNumber;
	private double amount;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/*public LocalDateTime gettDate() {
		return tDate;
	}
	public void settDate(LocalDateTime date) {
		this.tDate = date;
	}*/
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String getReceipentNumber() {
		return receipentNumber;
	}
	public void setReceipentNumber(String receipentNumber) {
		this.receipentNumber = receipentNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
