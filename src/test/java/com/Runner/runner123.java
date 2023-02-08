package com.Runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\Users\\HP\\eclipse-workspace\\Mavenpro\\src\\test\\java\\com\\feature1\\adactin.feature",
glue = "com.Stepdefinition1",plugin = { "pretty",
		"html:Reports1/Html_Report",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports1/ExtentReport.html",
		"json:Reports1/Json_Report.json"})
public class runner123 {

public static WebDriver driver;
@BeforeClass
public static void methode() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();

}

}
