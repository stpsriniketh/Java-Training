package com.java.training;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	
	
	
	public class Test {
	 public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		WebElement element = driver.findElement(By.id("lst-ib")); 
		element.sendKeys("hello selenium"); 
		element.submit(); }

	}


