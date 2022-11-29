package com.kiranacademy.methodcalling;

public class A 
{
	static void m1(String s)
	{
		System.out.println(s.length());
	}
	
	public static void main(String[] args) {
		
		// 1. by passing reference
		
		String s=new String("JBK");
		
		A.m1(s);
		
		// 2. by passing object
		
		A.m1(new String("JBK"));
		
		A.m1("JBK");
		
		
	}

}
