package com.singleton;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	private static Logger logger = null;
	
	private final String logFile = "demo_log.txt";
	private PrintWriter writer;
	
	private Logger() {
		try {
			FileWriter fw = new FileWriter(logFile);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public static synchronized Logger getInstance(){
		if(logger == null)
			logger = new Logger();
		return logger;
	}
	
	public void logWithdraw (String account, double amount) {
		writer.println("WITHDRAW (" + account + "): " + amount + "$");
	}
	
	public void logDeposit (String account, double amount) {
		writer.println("DEPOSIT (" + account + "): " + amount + "$");
	}
	

}