package com.kiranacademy.basicsex2;

public class TestA {
	
	public static void main(String[] args) {
		
		//A obj1=new A();
		
		A obj1=A.getObject();
		
		// obj1 ==> [m1() m2()] A class object
		
		obj1.m1();
		obj1.m2();
		
		A obj2=A.getObject();
		
		//obj2 ==> [m1() m2()] A class object
		
		System.out.println(obj1==obj2);
	}
}
