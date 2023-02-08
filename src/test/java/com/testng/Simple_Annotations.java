package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	@BeforeSuite
	public void propertySetting() {
System.out.println("Property Setting");
	}
	@BeforeTest
	public void browserLaunch() {
System.out.println("Browser Launch");
	}
	@BeforeClass
	public void urlLaunch() {
System.out.println("Url Launch");
	}
	
	@BeforeMethod
	public void login() {
System.out.println("login");
	}
	@Test(priority = -1)
	public void women() {
System.out.println("women");
	}
	@Test(priority = 0)
	public void men() {
System.out.println("men");
}
	@Test(priority = 1)
	public void kids() {
System.out.println("kids");
}
	@Test(invocationCount = 3)
	public void shirt() {
System.out.println("Shirt");
	}
	@AfterMethod
	public void logout() {
System.out.println("logout");
	}
	@AfterClass
	public void screenshot() {
System.out.println("screenshot");
	}
	@AfterTest
	public void closeWindow() {
System.out.println("Close");
	}
	@AfterSuite
	public void quitBrowser() {
System.out.println("Quit");
	}
	
}
