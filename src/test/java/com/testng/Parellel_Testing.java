package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Mavenpro.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parellel_Testing extends BaseClass {
	public static WebDriver driver;
	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test
	public void facebook() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
      System.out.println("facebook");
	}
	@Test
	public void instagram() {
		driver = new ChromeDriver();
		  driver.get("https://www.instagram.com/");
		System.out.println("instagram");

	}

}
