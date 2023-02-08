package com.testng;

import org.testng.annotations.Test;

public class Timeout_Concept {
	@Test
	public void login() throws InterruptedException {
    Thread.sleep(2000);
    System.out.println("Browser launch");
    Thread.sleep(1000);
    System.out.println("Url launch");
    Thread.sleep(2000);
    System.out.println("Login");
	}

}
