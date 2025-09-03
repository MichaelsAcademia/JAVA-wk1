package com.ms.week1.conversion;

import java.util.Scanner;

/**
 * @author Michael
 * Values of Farhenheit to Celsius, Miles to Kilometers, and Litres to Gallons
 */

public class Conversion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Farhenheit to Celsius
		
		System.out.println("Please enter the current temperature in Farhenheit: ");
		
		double far = sc.nextDouble();
		
		double cel = (far - 32) * 5.0 / 9.0;
		
		System.out.printf("%fF is %fC%n", far, cel);
		
		// Miles to Kilometers
		
		System.out.println("Please enter a number of Miles: ");
		
		double mile = sc.nextDouble();
		
		double kilo = mile * 1.60934;
		
		System.out.printf("%f miles is %f kilometers%n", mile, kilo);
		
		// Litres to Gallons
		
		System.out.println("Please enter an amount of Litres: ");
		
		double litre = sc.nextDouble();
		
		double gallon = litre * 0.264172;
		
		System.out.printf("%f litres is %f gallons%n", litre, gallon);
		
		sc.close();
	}
	
}
