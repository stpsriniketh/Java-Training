package com.java.training;

import java.util.Scanner;

public class MethodsDemo { 
	public static int max (int num1,int num2){
		int result;
		if (num1 < num2)
			result =num2;
		else
			result= num1;
			return result;		
	}
	
    public static double max(double num1, double num2){
    	
    	if(num1<num2)
    		return num2;
    	else
    		return num1;

    }
	public static void main(String [] args){
		
	Scanner input1 = new Scanner(System.in);
	System.out.println("enter any number1");
	
	Scanner input2 = new Scanner(System.in);
	System.out.println("enter any number2");
	double i = input1.nextDouble();
	double j= input2.nextDouble();
	double k= max(i,j);
	
	
			System.out.println("the max value is : "+ k);	
	}

}
