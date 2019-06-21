package com.template;

import java.util.Scanner;

public class Train extends Booking{
	public String mobile;
	public int reqtickets;
	public String date;
	Scanner scan=new Scanner(System.in);
	
	@Override
	void initialize() {
		System.out.println("Welcome to Train Bookings");
	}
	@Override
	void getDetails() {
		String names[]=new String[this.reqtickets];
		int ages[]=new int[this.reqtickets];
		for(int i=0;i<this.reqtickets;i++)
		{
			System.out.println("Enter the name of Person "+(i+1)+ " :");
			names[i]=scan.next();
			System.out.println("Enter the age of "+names[i]+ " :");
			ages[i]=scan.nextInt();
		}
		System.out.println("Booking Details:");
		System.out.println("Total number of tickets booked :"+  this.reqtickets);		
		for(int i=0;i<this.reqtickets;i++)
		{
			System.out.println("Person "+ (i+1)+ ": "+ names[i]);
			System.out.println("Age :"+ ages[i]);
		}
		System.out.println("Travel date :"+ this.date);
		System.out.println("Contact :"+ this.mobile);
	}
	@Override
	void bookTickets() {
		System.out.println("Enter the number of ticekts: ");
		this.reqtickets=scan.nextInt();
		System.out.println("Enter the mobile number: ");
		this.mobile=scan.next();
		System.out.println("Enter the date of travel");
		this.date=scan.next();				
	}

	@Override
	void end() {
		System.out.println("Successfully booked");
	}


}
