package com.capg.xyzwallet.test;

import java.math.BigInteger;

import com.capg.xyzwallet.bean.WalletBean;
import com.capg.xyzwallet.exception.WalletException;
import com.capg.xyzwallet.service.IWalletService;
import com.capg.xyzwallet.service.WalletServiceImp;

public class TestWalletServiceImp {
 private static  IWalletService iWalletService=null;
 @BeforeClass
public static void createInstance(){
	 ArrayList<>
	iWalletService=new WalletServiceImp();
}
@Test(expected=WalletException.class)
public void testFnameForLength() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("ma");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test(expected=WalletException.class)
public void testFnameForAlphabet() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}
@Test(expected=WalletException.class)
public void testEmail1() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(" ");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}
@Test(expected=WalletException.class)
public void testEmail2() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}
@Test(expected=WalletException.class)
public void testpanvalid() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPan("CWT2QQ2680");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertTrue(result);
	
}
@Test(expected=WalletException.class)
public void testpanvalid1() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPan("CWT2QQ2680");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertTrue(result);
	
}
@Test(expected=WalletException.class)
public void testpanvalid2() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPan("CWT2PP260"); //invalid lenght
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}

@Test(expected=WalletException.class)
public void testpanvalid3() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPan(" ");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}
@Test(expected=WalletException.class)
public void testpanvalid4() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail(".com@acf");
	walletBean.setAddress("chennai");
	walletBean.setPan("$WT2QQ2680 ");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
	
}


@Test(expected=WalletException.class)
public void testFnameForAlphabet() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("8741");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("123maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertTrue(result);
	
}

@Test(expected=NullPointerException.class)
public void testFnameForNotNull() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName(null);
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test
public void testFnameForPositive() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum(new BigInteger("9876543210"));
	walletBean.setPhoneNumber(new BigInteger ("9876543210"));
	boolean result=iWalletService. createAccount(walletBean);
	assertTrue(result);
}
@Test(expected=WalletException.class)
public void testLnameForLength() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("abcd");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum(new BigInteger("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test(expected=WalletException.class)
public void testLnameForAlphabet() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("87638276e87");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum("9876543210");
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test(expected=NullPointerException.class)
public void testLnameForNotNull() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName(null);
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum(new BigInteger("9876543210"));
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test
public void testLnameForPositive() throws Exception {
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha434@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum("9876543210");
	walletBean.setPhoneNumber("7416368112");
	boolean result=iWalletService. createAccount(walletBean);
	assertTrue(result);
}
@Test(expected=WalletException.class)
public void testPhoneNumberForNumber() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("mahalakshmi");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha87898@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum("9876543210");
	
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test(expected=WalletException.class)
public void testPhoneNumberForLength() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum("9876543210");
	boolean result=iWalletService.validations(walletBean);
	assertFalse(result);
}
@Test
public void testcheckBalancevalid() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setBalance(2000);
	walletBean.settargetMobileNum("9876543210");
	boolean result=iWalletService.validations(walletBean);
	assertTrue(result);
}
@Test(expected=WalletException.class)
public void testcheckBalanceForNegative() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.setBalance(-2000);
	walletBean.settargetMobileNum("9876543210");
	boolean result=iWalletService.validations(walletBean);
	assertTrue(result);
}



@Test(expected=WalletException.class)
public void testAmountForPositiveValue() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum("9867123456");
	walletBean.setAmount(-45646);
	double amount;
	walletBean.setBalance(-90000.00);
	boolean result=iWalletService.deposit(amount);
	assertFalse(result);
}
@Test
public void testAmountForPositiveCase() throws WalletException{
	WalletBean walletBean=new WalletBean();
	walletBean.setfName("maha");
	walletBean.setlName("pasumarthi");
	walletBean.setEmail("maha@gmail.com");
	walletBean.setAddress("chennai");
	walletBean.settargetMobileNum(9634879812);
	walletBean.setBalance(77979.98);
	walletBean.setAmount(45646);
	boolean result=iWalletService.deposit(walletBean.getAmount());
	assertTrue(result);
}

	@Test(expected=WalletException.class)
	public void testAddressNotNull() throws WalletException{
		WalletBean walletBean=new WalletBean();
		walletBean.setfName("maha");
		walletBean.setlName("pasumarthi");
		walletBean.setEmail("maha@gmail.com");
		walletBean.setAddress("chennai");
		walletBean.settargetMobileNum("9634879812");
		walletBean.setBalance(77979.98);
		walletBean.setAmount(45646);
		walletBean.setAddress(" ");
		boolean result=iWalletService.deposit(walletBean.getAmount());
		assertFalse(result);
		
	}
	@Test(expected=WalletException.class)
	public void testAddressPositive() throws WalletException{
		WalletBean walletBean=new WalletBean();
		walletBean.setfName("maha");
		walletBean.setlName("pasumarthi");
		walletBean.setEmail("maha@gmail.com");
		walletBean.setAddress("chennai");
		walletBean.settargetMobileNum("9634879812");
		walletBean.setBalance(77979.98);
		walletBean.setAmount(45646);
		walletBean.setAddress("chennai");
		boolean result=iWalletService.deposit(walletBean.getAmount());
		assertFalse(result);
		
	}
	@Test(expected=WalletException.class)
	public void testFundTransfer1() throws WalletException{
		WalletBean walletBean=new WalletBean();
		walletBean.setfName("8741");
		walletBean.setlName("pasumarthi");
		walletBean.setEmail(".com@acf");
		walletBean.setAddress("chennai");
		walletBean.setPan(" ");
		walletBean.setPhoneNumber(new BigInteger ("9876543210"));
		walletBean.settargetMobileNum(new BigIntegr("987624310"));//validating target phone number for fund transfer
		boolean result=iWalletService.validations(walletBean);
		assertTrue(result);
		
	}
	@Test(expected=WalletException.class)
	public void testFundTransfer2() throws WalletException{
		WalletBean walletBean=new WalletBean();
		walletBean.setfName("8741");
		walletBean.setlName("pasumarthi");
		walletBean.setEmail(".com@acf");
		walletBean.setAddress("chennai");
		walletBean.setPan(" ");
		walletBean.setPhoneNumber(new BigInteger ("9876543210"));
		walletBean.settargetMobileNum(new BigIntegr("98762431"));//validating target phone number for fund transfer
		boolean result=iWalletService.validations(walletBean);
		assertFalse(result);
		
	}
	

}


