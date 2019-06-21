package com.template;

import java.util.Scanner;

public class TemplateDemo {
  public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Select the option: ");
	  System.out.println("1.Bus");
	  System.out.println("2.Train");
	  int n=s.nextInt();
	  if (n==1)
	  {
	      Booking book = new Bus();
	      book.book();		  
	  }
	  if (n==2)
	  {
		  Booking book=new Train();
		  book.book();
	  }

  }
}
