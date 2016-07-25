package Temperature;

import java.util.Scanner;

public class Fever {
	public static void main (String [] args) {
		
		double temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your temperature in Celsius");
		temp = input.nextDouble();

		if (temp < 39){
		System.out.println("You don't have fever!");
	} else {
		if (temp >= 39);
		System.out.println("You have fever :(");
	}
		

		}


}
