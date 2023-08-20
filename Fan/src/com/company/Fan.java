package com.company;

public class Fan {
	String brand;
	String color;
	int cost;
	int no_of_wings;
	
	void rotate()
	{
		System.out.println("A "+color+" color fan is rotating with "+no_of_wings+" Wings which costs around "+cost+" rupees made by "+brand+" brand ");
		System.out.println("brand: "+brand+" color: "+color+" cost: "+ cost + " number of wings: "+no_of_wings);
	}
	
	void blowAir()
	{
		System.out.println("A "+color+ " colored fan is rotating:");
		System.out.println("=======================================================================================");
	}

}
