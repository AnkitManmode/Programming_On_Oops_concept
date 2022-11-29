package com.kiranacademy.basicsex2;

public class B 
{

		static B obj=new B();
	
		private B()
		{
			
		}
		
		void m1()
		 {
			 System.out.println("m1");
		 }
				 
		 void m2()
		 {
			 System.out.println("m2");
		 }
 
		 static B getObject()
		 {
			 return obj;
		 }
 
}
