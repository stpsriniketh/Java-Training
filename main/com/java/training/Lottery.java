package com.java.training;

import java.util.Scanner;

public class Lottery {
	
	public static void main(String [] args){
		
		int lottery = (int) (Math.random()* 100); 
		 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your lottery pick (two digits)): ");
		int  guess = input.nextInt();
		
			 int lotteryDigit1 = lottery / 10;
			 int lotteryDigit2 = lottery % 10; 
			 
			 int guessDigit1 = guess /10;
			 int guessDigit2 = guess %10;
			 
		System.out.println("The Lottery number is: " + lottery);
		
		if(guess == lottery){
			System.out.println("Exact match: you win $10,000");
		}
			
			else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2){
				System.out.println("Match all digits: you win $3,000");
			}
			else if (guessDigit1 == lotteryDigit1 
					|| guessDigit2 ==lotteryDigit2
					|| guessDigit2 ==lotteryDigit1
					|| guessDigit2 == lotteryDigit1){
				System.out.println("Only One Digit match: You win $1");
			}
			else 
			    System.out.println("No match: Better Luck next time");
				
		}
	}


