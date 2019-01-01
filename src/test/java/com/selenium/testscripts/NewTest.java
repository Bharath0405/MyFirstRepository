package com.selenium.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  driver.findElement(By.id("username")).sendKeys("seleniumtesting");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		
  }

  @AfterTest
  public void afterTest() {
	  
  }

}

//Maven is build tool
//.java files will build/compiled -- 
//mvn clean
//mvn compile
//mvn test/mvn package
//pom.xml for giving the jars path
//mvnrepository - dependecies related to selenium,poi,testng--even downoad the jars from mvnreporsitory
//Test script name should have Test at the end or beging of the file.
//mvn surefire-report:report
//