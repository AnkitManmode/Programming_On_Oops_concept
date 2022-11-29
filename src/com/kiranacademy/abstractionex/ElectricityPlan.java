package com.kiranacademy.abstractionex;

import java.util.Calendar;

import com.kiranacademy.hasaex.C;

public abstract class ElectricityPlan {
	
 int rate;
abstract void setRate();

 void calculateBill(int noOfUnit){
	System.out.println("Electricity bill==>"+ noOfUnit*rate);
}
 static ElectricityPlan getInstance(String plan){
	 if(plan.equals("domestic"))
		 return new DomesticPlan();
	 else if (plan.equals("commercial"))
		 return new CommercialPlan();
	 else 
		 return null;
 }
 
 
 
	public static void main(String[] args) {
		ElectricityPlan obj;
	
		obj=new CommercialPlan();
		obj.setRate();
		obj.calculateBill(10);

		obj=new DomesticPlan();
		obj.setRate();
		obj.calculateBill(10);
	
	Calendar c=Calendar.getInstance();
	c.set(2022, 8, 10);
	System.out.println(c.getTime());
	}
}
