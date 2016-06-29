package com.java.training;

public class PassByValue {
	
	public static void  swap(int n1, int n2){
		System.out.println("\t\tInside the swap method");
		System.out.println("\t\tBefore swapping n1 is : "+ n1 + " n2 is " + n2);
		
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("\t\tAfter Swapping n1 is " + n1 + " n2 is " + n2 );
	}
	
	
	public static void main(String [] args){
		int num1=123;
		int num2=789;
		
		System.out.println("Before invoking the sawp method, Num1 is "+ num1 + " num2 is "+ num2);
		
		swap(num1,num2);
		
		System.out.println("After invoking the sawp method, Num1 is "+ num1 + " num2 is "+ num2);
	}

}
