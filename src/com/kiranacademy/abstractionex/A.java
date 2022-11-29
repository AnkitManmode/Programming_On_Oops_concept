package com.kiranacademy.abstractionex;

/*  From child class constructor , default constructor of parent class is called automatically
 * 
 * */
public class A {

	A()
	{
		System.out.println("default constructor of parent class");
	}
	
	A(int a)
	{
		
		System.out.println("parameterized constructor of parent class");
	}

}// class A


class B extends A
{
	B()
	{
				super();
				System.out.println("child class constructor");

	}
	
}


