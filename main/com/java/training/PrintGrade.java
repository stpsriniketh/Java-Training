package com.java.training;

import java.util.Scanner;

public class PrintGrade {
	
	public static void main(String []args){
		System.out.println("To Check your Grade enter the your Percentage:");
		Scanner input = new Scanner(System.in);
		
		double result = input.nextDouble();
		System.out.println("your grade is: ");
		
		grade(result);
	}
	
	public static void grade(double score){
		
		if(score <=0 || score >100){
			System.out.println("Invalid Score \n Please Enter valid Score");
		}
		if(score >= 90.0){
			System.out.println("Your Grade is 'A' ");
		}
		else if (score >=80.0){
			System.out.println("Your Grade is 'B' ");
		}
		else if(score >=70.0){
			System.out.println("Your Grade is 'C' ");
		}
		else if(score >=60.0){
			System.out.println("Your Grade is 'D' ");
		}
		else{
			System.out.println("Your Grade is 'F' ");
		}
	}
	
	public static char getGrade(double score){
		if(score <=0 || score >100){
			System.out.println("Invalid Score");
			
		}
		if(score >= 90.0){
			return 'A';
		}
		else if (score >=80.0){
			return 'B';		}
		else if(score >=70.0){
			return 'C';
		}
		else if(score >=60.0){
			return 'D';
		}
		else{
			return 'F';
	}
		
	}
}