package com.swiggy.testscripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;

import org.openqa.selenium.Platform;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {
	
	@BeforeMethod
	public void setUp(Scenario scenario) throws MalformedURLException {
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}


}
