package kr.ac.mju.dislab.java.accounttest;

import static org.junit.Assert.*;
import kr.ac.mju.dislab.java.account.Account;

import org.junit.Test;

public class AccountTest {
	private Account account;
	
	@Test
	public void testConstructor(){
		account = new Account("1234567890", "hong", 1000);
		
		assertEquals("1234567890", account.getAccountNumber());
		assertEquals("hong", account.getName());
		assertEquals(1000, account.getBalance(), 0.00000001);
	}
	
	@Test
	public void testWithdraw(){
		account = new Account("1234567890", "hong", 1000);
		
		account.withdraw(100);
		assertEquals(900, account.getBalance(), 0.00000001);
	}
	
	@Test
	public void testNegativeWithdraw(){
		account = new Account("1234567890", "hong", 1000);
		
		assertFalse(account.withdraw(-100));
	}
	
	@Test
	public void testWithdrawForNotEnoughBalance(){
		account = new Account("1234567890", "hong", 1000);
		
		assertFalse(account.withdraw(1100));
	}
	
	@Test
	public void testDeposit(){
		account = new Account("1234567890", "hong", 1000);
		
		account.deposit(100);
		assertEquals(1100, account.getBalance(), 0.00000001);
	}
	
	@Test
	public void testNegativeDeposit(){
		account = new Account("1234567890", "hong", 1000);
		
		assertFalse(account.deposit(-100));
	}
	
}
