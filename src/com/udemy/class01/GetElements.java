package com.udemy.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/andrii/eclipse-workspace/Mars/drivers1/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");// URL in the browser
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("andrii@yahoo.com") ;
		driver.findElement(By.name("pass")).sendKeys("1234567890"); 
		//driver.findElement(By.linkText("Forgot account?")).click();
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
	}

}
