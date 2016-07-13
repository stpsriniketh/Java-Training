package com.java.training;

public class BMI {

	String name;
	int age;
	double weight;
	double height;
	
	public static final double KILOperpound= 0.45359237;
	public static final double MeterperInch= 0.0254;
	
	public BMI (String name, int age, double weight, double height){
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	public double getBMI(){
		double bmi= weight * KILOperpound/
		((height * MeterperInch)*(height*MeterperInch));
		return Math.round(bmi*100)/100.0;
	}
	
	public String getStatus(){
		double bmi= getBMI();
		if(bmi<18.5)
			return "UNDER WEIGHT";
		else if (bmi<25)
			return "NORMAL";
		else if (bmi<30)
			return "OVER WEIGHT";
		else 
		    return "OBESE";	
	}
	public String getName(){
	 return name;
}
	public int getAge(){
		return age;
	}
	public double getWeight(){
		return weight;
	}
	public double getHeight(){
		return height;
	}
	
	public static void main(String[] args) {
		BMI bmw = new BMI("Musheer Akbar", 25, 160.937,70.8);
		System.out.println("Name: " + bmw.getName());
		System.out.println("Age: " + bmw.getAge());
		System.out.println("Height : " + bmw.getHeight());
		System.out.println("Weight : " + bmw.getWeight());
		System.out.println("Your BMI is : " + bmw.getStatus());
	
	}
}
