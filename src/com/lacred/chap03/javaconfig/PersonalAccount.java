package com.lacred.chap03.javaconfig;

public class PersonalAccount implements Account{
	
	private int backcode;
	private String accNo;
	private String accPwd;
	private int balance;
	
	public PersonalAccount(int backcode, String accNo, String accPwd) {
		this.backcode = backcode;
		this.accNo = accNo;
		this.accPwd = accPwd;
		
	}
	
	public PersonalAccount(int backcode, String accNo, String accPwd,int balance) {
		this(backcode, accNo, accPwd);
		
		this.backcode = balance;
	}
	

	@Override
	public String getBalance() {
		return this.accNo+" 계좌의 현 잔액은 " + this.balance+ "  원 입니다.";
	}

	@Override
	public String deposit(int money) {
		String str = "";
		
		if(money >= 0) {
			this.balance += money;
			str = money +"원이 입금되었습니다.";
		}
		str = "금액을 잘못 입력하였습니다.";
		return str;
	}

	@Override
	public String withdraw(int money) {
		
		String str = "";
		
		if(this.balance >= money) {
			this.balance -= money;
			str = money+"원이 출금 되었습니다.";
			return str;
		}
		str = "잔액이 부족합니다. 잔액을 확인해주세요.";
		return str;
	}
	
	

}
