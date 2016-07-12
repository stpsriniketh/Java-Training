package com.java.training;

public class CircleWithStaticVariable {

	double radius;
	static int numofobjects = 0;
	
	CircleWithStaticVariable(){
		radius = 1;
		numofobjects++;
	}
	
	CircleWithStaticVariable(double newRadius){
		radius = newRadius; 
		numofobjects++;
	}
	
	static int getnumofobjects(){
		return numofobjects;
	}
	
	double gerArea(){
		return radius * radius * Math.PI;
	}
}
