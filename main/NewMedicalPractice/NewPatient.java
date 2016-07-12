package NewMedicalPractice;

import java.text.SimpleDateFormat;
import java.util.Date;


public class NewPatient {
	private String name;
	private int age;
	private String address;
	private String address2;
	private int phonenum;
	private int homephone;
	private String sex;
	private String prefix;
	private String result;
	 java.util.Date date = new Date();
	
	public String getName(){
		return name;
	}
	
	public void setName(String name, String Prefix){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age ){
		this.age=age;
	}
	
	public long getPhoneNo(){
		return phonenum;
	}
	
	public void setPhoneNo(int phonenum, int homephone){
		this.phonenum=phonenum;
		this.homephone=homephone;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address, String address2  ){
		this.address =address;
		this.address2 = address2; 
	}
	
	public String getSex(){
		return sex;
	}
	
	public void setSex(String sex){
		this.sex=sex;
	}
	
	public java.util.Date getDate(){
		

		return date;
	}
	
	
	
	public void printpatient(){
		System.out.println("Patient Name : " +name);
		System.out.println("Sex : " +sex);
		System.out.println("Age : " +age);
		System.out.println("Phone Number : " + phonenum + "\n Second phone: " + homephone);
		System.out.println("Address : " + address + "\n Second address :" + address2);
		System.out.println("Date admitted :" + date);
	}

	

	
	
	
}
