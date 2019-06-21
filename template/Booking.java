package com.template;

public abstract class Booking {
		abstract void initialize();
		abstract void getDetails();
		abstract void bookTickets();
		abstract void end();

		//template method
	   public final void book(){

	      initialize();
	      bookTickets();	      
	      getDetails();
	      end();
	   }
	}