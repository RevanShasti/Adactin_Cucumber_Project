package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base;
import com.adactin.properties.Instance_Creation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/adactin/feature", 
glue="com.adactin.stepdef",
tags="@home",
monochrome = true,
strict = false,
plugin = {
		"html:Reports/cucumber_HTML",
		"pretty",
		"json:Reports/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Folder/File.html"
})
public class Runner_Class {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		
		String browser = Instance_Creation.getInstance().getInstanceCR().getBrowser();
		
		
		driver=Base.getBrowser(browser);
	 
	}
	
//	@AfterClass
//	public static void end() {
//		
//		driver=Base.close();
//	}
	
}
