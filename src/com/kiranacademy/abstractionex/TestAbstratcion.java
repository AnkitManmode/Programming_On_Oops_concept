package com.kiranacademy.abstractionex;


public class TestAbstratcion {
public static void main(String[] args) {
	ElectricityPlan obj;
	
	obj= ElectricityPlan.getInstance("domestic");
	obj.setRate();
	obj.calculateBill(3);
	

	obj= ElectricityPlan.getInstance("commercial");
	obj.setRate();
	obj.calculateBill(3);
	
	obj= ElectricityPlan.getInstance("normal");
	if(obj!=null)
	obj.setRate();
	
	System.out.println("end of main");
}
}

