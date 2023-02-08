package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Mavenpro.BaseClass;


@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Mavenpro\\src\\test\\java\\com\\feature\\Adactin1.feature",
monochrome = true, dryRun = false, tags = ("@SmokeTest"), glue = "step_Definition", plugin = {
		"html:Report/Repo123.html", "pretty", "json:Report/Adactin.json" })

public class runnertest1 {
	public static WebDriver driver;

	@BeforeClass
	public static void webLauncher() {
		driver = BaseClass.launchBrowser("chrome");
	}
//
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//
//	}

}
