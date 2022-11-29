package com.kiranacademy.abstractionex;

public class CommercialPlan extends ElectricityPlan{

	@Override
	void setRate() {
		rate=10;
}
}

class DomesticPlan extends ElectricityPlan{

	@Override
	void setRate() {
		rate=5;
}
}
