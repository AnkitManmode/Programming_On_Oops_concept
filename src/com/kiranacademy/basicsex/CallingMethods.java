package com.kiranacademy.basicsex;

public class CallingMethods {
	
	public static void main(String[] args) 
	{
		
		// To call multiple methods , use reference .
		
		String s = new String("Java");
		
		s.length();
		
		System.out.println("Character at 0th index is=>"+ s.charAt(0));
		
		System.out.println("=====================");
		// To call single method , use object
		new String("Java is easy").length();
		
		System.out.println(new String("Java is easy").length());
		
	}// main ends
	

	
}
