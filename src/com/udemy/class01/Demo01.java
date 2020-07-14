package com.udemy.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/andrii/eclipse-workspace/Mars/drivers1/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");// hit url on the browser
		System.out.println(driver.getTitle());// validate if your Page title is correct
		
		System.out.println(driver.getCurrentUrl());//validate if you are landed on correct url
		
		//System.out.println(driver.getPageSource());//print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.close();// closes current browser
		//driver.quit();//closes all the browsers open by selenium
		
	}

}
