package com.java.training;

import java.util.Scanner;

public class Quiz {
 public static void main(String []args){
	 final int NUMBER_OF_QUESTIONS = 5;
	 int CorrectCount=0;
	 int Count=0;
	 long startTime= System.currentTimeMillis();
	 String output="";
	 
	 Scanner input = new Scanner(System.in);
	 
	 while(Count < NUMBER_OF_QUESTIONS){
		 int num1 = (int)(Math.random()* 10);
	     int num2 = (int)(Math.random()* 10);
	     
	     if(num1 < num2){
	    	 int temp = num1;
	    	 num1= num2;
	    	 num2= temp;
	     }
	 System.out.println("what is " + num1 + " - " + num2+ " ? " );
	 int answer = input.nextInt();
	  
	 if( num1 - num2 == answer){
		 
		 System.out.println("You are correct\n");
		 CorrectCount++;
		 Count++;
	 }
	 else {
		 System.out.println("Wrong answer" + "Correct answer is: " + (num1-num2));
		 Count++;
	 }
	output += "\n" + num1 + " - "+ num2 + " = "+ answer +((num1-num2 ==answer));
	 }
	 
	 long endtime= System.currentTimeMillis();
	 long testtime = endtime - startTime;
	 
	 System.out.println("Correct answers " + CorrectCount + "\ntest time is "+ testtime/1000 + " seconds\n"+ output);
	 
 }
}
