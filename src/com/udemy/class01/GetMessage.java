package com.udemy.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMessage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/andrii/eclipse-workspace/Mars/drivers1/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");// URL in the browser
		driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("andrii@yahoo.com") ;
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
	}

}
