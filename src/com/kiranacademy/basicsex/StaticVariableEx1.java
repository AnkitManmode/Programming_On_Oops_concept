package com.kiranacademy.basicsex;

public class  StaticVariableEx1 {
	static int a;

	StaticVariableEx1(int b){
		a=b;
	}
	public static void main(String[] args) {
		
		StaticVariableEx1 obj1 = new StaticVariableEx1(10);
		System.out.println(a);

		StaticVariableEx1 obj2 = new StaticVariableEx1(20);
		System.out.println(a);

		obj1.a = 50;// a variable is common between all object

		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(StaticVariableEx1.a);
	}
}
