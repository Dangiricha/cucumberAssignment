package com.qa.OrangeHR.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/*
 * Login in OrangeHr application and validate the title of landing page (assignment no: 5)
 * validate the multiplication of three numbers (assignment no: 6)
 */

public class StepDefinition {
static	WebDriver driver;
static int mul;	
static List<Integer> numList;
	
	
	@Given("^I open my application$")
	public void i_open_my_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Riaan/Documents/selenium-java-3/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}

	@And("^I login with following credentials$")
	
	public void i_login_with_following_credentials(DataTable dt) throws Throwable {
		List<String> list = dt.asList(String.class);
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(list.get(0));

         driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(list.get(1));

         driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

@Then("^Validate the landing page$")
public void validate_the_landing_page(DataTable title) throws Throwable {
	List<String> pageList = title.asList(String.class);
	String pageTitle = pageList.get(0);
	System.out.println(pageTitle);
	Assert.assertEquals("True", driver.getTitle(), pageTitle);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.close();
}

@Given("^a list of numbers$")
public void a_list_of_numbers(DataTable num) throws Throwable {
	numList = num.asList(Integer.class);  
	
	System.out.println("First number: " + numList.get(0)); 
	System.out.println("Second number: " + numList.get(1)); 
	System.out.println("Third number: " + numList.get(2)); 
}

@When("^I multiply them$")
public void i_multiply_them() throws Throwable {
	 mul = numList.get(0) * numList.get(1) * numList.get(2);  
	 System.out.println("The Multiplication of all three numbers are:  "+mul); 
    
}

@Then("^I should get (\\d+)$")
public void i_should_get(int result) throws Throwable {
  Assert.assertEquals(result, mul); 

    
}

	    
}
