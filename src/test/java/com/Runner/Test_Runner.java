package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Mavenpro.BaseClass;


@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features = "D:\\Users\\HP\\eclipse-workspace\\Mavenpro\\src\\test\\java\\com\\feature1\\adactin.feature", 
glue = "com.stepdefinition", plugin = {
		"html:Report/Repo.html" })
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = BaseClass.launchBrowser("chrome");

	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
