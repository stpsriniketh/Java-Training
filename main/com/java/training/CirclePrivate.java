package com.java.training;

public class CirclePrivate {

	private double radius = 1; 
	private static int noofobjects =0;
	
	public CirclePrivate(){
		noofobjects++;
	}
	
	public CirclePrivate(double newRadius){
		radius = newRadius;
		noofobjects++;
	}
	public double getRadius(){
		return radius;
	}
	
	public int  setRadius(double newRadius){
		radius = (newRadius >=0)? newRadius: 0;
		return noofobjects;
				}
	public static int getnoofobjects(){
	 return noofobjects;	
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
}
