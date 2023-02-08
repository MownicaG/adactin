package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mavenpro.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelRun extends BaseClass {
	public static WebDriver driver;
	//@Test
	//public void setup() {
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();

	//}
	@Test
	private void test1() {
		System.out.println("facebook" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//System.out.println("facebook" + Thread.currentThread().getId());
driver.close();
	}
	@Test
	private void test2() {
		System.out.println("instagram" + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
     driver.get("https://www.instagram.com/");
     //System.out.println("instagram" + Thread.currentThread().getId());
     driver.close();
	}
	
	
}
