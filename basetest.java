package com_trivango_generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest implements autoconstant

{

	WebDriver driver;
	@BeforeMethod
	public void precondition() 
	{
		System.setProperty(chrome_key, chrome_value);
		driver = new ChromeDriver();
		
		driver.get("https://www.trivago.in/");
		

	}
	@AfterMethod
	public void Postcondition()
	{
		
	}

}
