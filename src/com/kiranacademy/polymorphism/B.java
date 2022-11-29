package com.kiranacademy.polymorphism;

public class B extends A
{

	String m1()
	{
		return new String("Java");
	}
	
	public static void main(String[] args) 
	{
		
		A obj = new B();
		
		String s = (String) obj.m1();
		
		int len = s.length();
		
		System.out.println(len);
		
//The method length() is undefined for the type Object
		
	}
}
