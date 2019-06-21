package com.singleton;

public class Test {

	public static void main(String[] args)
	{
	Logger log1=Logger.getInstance();
	log1.logDeposit("100",500);
	log1.logWithdraw("100", 100);
}
}
