package com.java.training;

public class Employee {
	private String name;
	private int age;
	private String position;
	private double salary;
	private String sex;
	
	
	public Employee(String name, int empage, String empposition, double empsalary,String sex){
		this.name= name;
		this.age= empage;
		this.position = empposition;
		this.salary= empsalary;
		this.sex=sex;
	}
	
	public void printEmployee(){
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		System.out.println("Position :"+position);
		System.out.println("Salary :"+ salary);
		System.out.println("sex :"+ sex);
	}
	
	public static void main (String[]args){
		Employee E1= new Employee("Musheer Akbar", 25, "Software Engineer",70.000, "Male");
		
		E1.printEmployee();
		
	}

}
