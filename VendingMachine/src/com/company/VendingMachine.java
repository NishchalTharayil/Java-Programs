package com.company;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String productCode = scan.next();
		getProduct(productCode);
		scan.close();
	}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "PO1": System.out.println("CocaCola");
		break;
		case "PO2": System.out.println("Pepsi");
		break;
		case "PO3": System.out.println("Fanta");
		break;
		case "PO4": System.out.println("Jaljeera");
		break;
		case "PO5": System.out.println("MountainDew");
		break;
		default : System.out.println("BoatGuava");
		
		}
	}

}
