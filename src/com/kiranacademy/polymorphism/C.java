package com.kiranacademy.polymorphism;

public class C extends A
{

	Account m1()
	{
		return new Account(101, 10000);// object is returned
	}
	
	Account m2()
	{
		Account account = new Account(102, 20000);
		return account; // object reference is returned
	}
		
	public static void main(String[] args) 
	{
		
		// To call single method , no need to create reference
		// concat() give String class object which contains multiple methods , but if we want
		// to call single method , then we can call it directly , no need of reference .
		
		String s=new String("Java ");
		s.concat(" is easy").length();
		
		
		
		// To call multiple methods , need to create reference
		
		String s1=s.concat("kiranacademy");
		
		// s1==>[java kiranacademy length(),charAt()] String class object
		
		s1.length();
		s1.charAt(1);
		s1.equals("java");
		
		
		// To call single method , no need to create reference
		
		C c = new C();
		c.m2().deposit(1000); //  [deposit() , withdraw()] Account class object
			
		
		C c3 = new C();
		Account p=c3.m2(); // p==> [deposit() , withdraw()] Account class object
		p.deposit(20000);
		
		// To call multiple methods , need to create reference
		
		C c1 = new C();
		Account ac=c1.m2(); // ac==> [deposit() , withdraw()] Account class object
		ac.deposit(10000);
		ac.withdraw(300);
		
		
		A obj = new C();
		
		Account o=(Account)obj.m1();
		
		o.deposit(1000);
				
		Account account1=new Account(1, 1000);
		Account account2=new Account(2, 2000);
		
		// static void transfer(Account account1 , Account account2 , int amount)
		
		
		// pass reference as a argument
		
		Account.transfer(account1, account2,500);
		
		// pass object as a argument
		
		Account.transfer(new Account(3, 3000),new Account(4, 4000),1000);
		
		
	}
}
