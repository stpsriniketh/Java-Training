package Temperature;

import java.util.Scanner;

public class TemperatureTest {
	public static void main(String[] args) {
		 
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter Fahrenheit temperature: ");
	    double ftemp = sc.nextDouble(); 
	 
	    Temperature temp = new Temperature(ftemp);
	    System.out.println("The temperature in Fahrenheit is " + temp.getFahrenheit());
	    System.out.println("The temperature in Celsius is " + temp.getCelsius());
	    System.out.println("The temperature in Kelvin is " + temp.getKelvin());
	  }
}
