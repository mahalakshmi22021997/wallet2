package com.capg.xyzwallet.service;

/*import java.time.LocalDate;
import java.time.LocalDateTime;*/
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.bean.WalletTransaction;
import com.capg.xyzwallet.dao.IWalletDAO;
import com.capg.xyzwallet.dao.WalletDAOImp;
import com.capg.xyzwallet.exception.ExceptionMessage;
import com.capg.xyzwallet.exception.WalletException;

public class WalletServiceImp implements IWalletService {

	IWalletDAO dao = new WalletDAOImp();
	WalletBean bean = new WalletBean();
	
	@Override
	public boolean createAccount(WalletBean w) throws WalletException {
		boolean isCreated = false;
		if (validations(w)) {
			isCreated = dao.createAccount(w);
		} else {
			isCreated = false;
		}
		return isCreated;
	}
	@Override
	public double showBalance() {
		// TODO Auto-generated method stub
		return dao.showBalance();
	}
	@Override
	public boolean fundTransfer(BigInteger targetMobileNum, double amount) throws WalletException {
		// TODO Auto-generated method stub
		return dao.withDraw(amount);
	}
	@Override
	public boolean fundTransfer(double amount) {
		// TODO Auto-generated method stub
		return dao.fundTransfer(amount);
	}
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		return dao.deposit(amount);
	}
	
	
	
	@Override
	public boolean validations(WalletBean  bean ) throws WalletException {
		
		boolean isValid = false;
		if (bean.getfName().trim().length() < 4) {
			throw new WalletException(ExceptionMessage.ERRORNAME);
		} else if (bean.getlName().trim().length() < 4) {
			throw new WalletException(ExceptionMessage.ERRORNAME);
		} else if (!(String.valueOf(bean.getPhoneNumber())
				.matches("(0)?[6-9][0-9]{9}"))) {
			throw new WalletException(ExceptionMessage.ERRORPHONE);
		} else if (!(String.valueOf(bean.gettargetMobileNum())
				.matches("(0)?[6-9][0-9]{9}"))) {
			throw new WalletException(ExceptionMessage.ERRORPHONE);
		} else if (bean.getAddress().length() == 0) {
			throw new WalletException(ExceptionMessage.ERRORADDRESS);
		} else if (!(bean.getEmail()
				.matches("^[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$"))) {
			throw new WalletException(ExceptionMessage.ERROREMAIL);
		}
		else if(!(bean.getPan().matches("^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$)")))
				{
			throw new WalletException(ExceptionMessage.ERRORPAN);
		}
		else {
			isValid = true;
		}
		return isValid;
	}
	@Override
	public boolean validTargetPhoneNumber(BigInteger targetPhoneNumber)
	{
		boolean isValid;
		if(bean.gettargetMobileNum())
	
		return false;
	}
	@Override
	public boolean validAmount(int amount) throws WalletException {
	boolean isValid = true;
		if(amount<0)
		{
		 isValid=false;	
		}
		return isValid;
	
	
	}
	public boolean checkBalance() { 
		boolean isCreated = false;
		if (bean.getBalance()>= 0) {
			isCreated = dao.withDraw(bean.getAmount());
		} else {
			isCreated = false;
		}
		return isCreated;
	}

		
	}
	@Override
	public ArrayList<WalletTransaction> printTransaction(LocalDateTime fDate,
			LocalDateTime tDate) {
		// TODO Auto-generated method stub
		return dao.printTransaction(fDate, tDate);
	}
}

