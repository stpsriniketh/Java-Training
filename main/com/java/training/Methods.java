package com.java.training;

public class Methods {

	public static void PrimeNumber(int Prime){
		final int NO_OF_PRIME_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		while(count < Prime){
			if(isPrime(number)){
				count++;
			}
			if(count % NO_OF_PRIME_PER_LINE == 0){
				System.out.printf("%-5s\n", number);
			}
			else
				System.out.printf("%-5s\n", number);	
		}
		number++;
	}
	
	public static boolean isPrime(int number){
		for(int divisor = 2; divisor <= number/2; divisor++){
			if(number % divisor == 0){
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String [] args){
		
		System.out.println("max between two numbers is : " );
		
		MethodsDemo obj1 = new MethodsDemo();
		obj1.max(2,3);
	}
}
