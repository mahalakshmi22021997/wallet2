package com.capg.xyzwallet.service;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;
import com.capg.xyzwallet.exception.WalletException;

public interface IWalletService {
	public boolean createAccount(WalletBean w) throws WalletException;
	public double showBalance();
	public boolean withDraw(double amount) throws WalletException;
	public boolean fundTransfer(double amount);
	public boolean deposit(double amount);
	public ArrayList<WalletTransaction> printTransaction(LocalDateTime fDate,LocalDateTime tDate);
	public boolean validations(WalletBean w) throws WalletException;
	/*public boolean validPhoneNumber(long phone);
	public boolean validAmount(int amount) throws WalletException;*/
	boolean fundTransfer(BigInteger targetMobileNum, double amount)
			throws WalletException;
	public boolean validPhoneNumber(BigInteger targetMobileNum);
	boolean validTargetPhoneNumber(BigInteger targetPhoneNumber);
	boolean validAmount(int amount) throws WalletException;
}