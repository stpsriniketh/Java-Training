package com.java.training;

public class TestCircleArea {

	public static void main(String []args){
		
		System.out.println("Before creating objects");
		System.out.println("Nubmer of circle objects is " + CircleWithStaticVariable.numofobjects);
	
	CircleWithStaticVariable c1 = new CircleWithStaticVariable();
	
	System.out.println("\n After creating objects");
	System.out.println(" c1 radius  " + c1.radius + " num of objects "+c1.numofobjects);

	CircleWithStaticVariable c2 = new CircleWithStaticVariable(5);
	
	c1.radius=10;
	
	System.out.println("\n After creating objects");
	System.out.println(" c1 radius  " + c1.radius + " num of objects "+c1.numofobjects);

	System.out.println("\n After creating objects");
	System.out.println(" c2 radius  " + c2.radius + " num of objects "+c2.numofobjects);

	}
}
