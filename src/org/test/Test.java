package org.test;

import java.util.Scanner;
public class Test {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int age = s.nextInt();
	if(age>18) 
	  {
		System.out.println("Eligible for Voting"); 
	 }
	  else
	{
		System.out.println("Not eligible");
	}
}
}
