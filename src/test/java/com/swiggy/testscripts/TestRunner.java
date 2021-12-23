package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions

(features = "src/test/resources/features", 
glue = "com.swiggy.testscripts")

public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
