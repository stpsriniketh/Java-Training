package com.java.training;

public class Testcircle {

	public static void main (String []args){
		CirclePrivate myc = new CirclePrivate(5.0);
		System.out.println("area of circle with radius " +myc.getRadius()+ "area is " + myc.getArea());
		
		myc.setRadius(myc.getRadius()* 1.1);
		
		System.out.println("area of circle with new radius is " + myc.getRadius()+ "area is " + myc.getArea());
		
		System.out.println("Number of objects "+ CirclePrivate.getnoofobjects());
	
	}
}
