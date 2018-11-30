package com.qa.OrangeHR.Application;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Riaan/Documents/selenium-java-3/chromedriver");
	WebDriver	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	
	Thread.sleep(3000);
List<WebElement> titles = driver.findElements(By.tagName("title"));
ArrayList<String> ar= new ArrayList<String>();
ar.add(titles.toString());

for(int i=0; i<ar.size(); i++){
	System.out.println("@@@@@@@@@@  "+ ar.get(i));
}
Thread.sleep(3000);


driver.quit();
}

}
