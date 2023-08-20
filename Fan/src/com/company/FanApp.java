package com.company;

public class FanApp {
	public static void main(String[] args)
	{
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		Fan fan3 = new Fan();
		
		fan1.brand = "Havels";
		fan1.color = "Blue";
		fan1.cost = 4000;
		fan1.no_of_wings=4;
		fan1.rotate();
		fan1.blowAir();
		
		
		fan2.brand = "Crompton";
		fan2.color = "Yellow";
		fan2.cost = 3500;
		fan2.no_of_wings=4;
		fan2.rotate();
		fan2.blowAir();
		
		fan3.brand = "USHA";
		fan3.color = "White";
		fan3.cost = 3000;
		fan3.no_of_wings=3;
		fan3.rotate();
		fan3.blowAir();
		
		
		
	}

}
