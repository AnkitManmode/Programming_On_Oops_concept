package com.kiranacademy.hasaex;
import com.kiranacademy.accessspecifiers.A;

public class C extends A {
public static void main(String[] args) throws Exception {
	//new A().m1();
	new C().m1();
	new C().clone();
	//new Object().clone();
	// protected member is visible
	//1. inside all classes from same package
	//2. outside of package only within child 
	//    class and that too using object of child class 
}
}