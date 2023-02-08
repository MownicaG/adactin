package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {
	@Ignore
	@Test
	public void Credentials() {
System.out.println("Credentials");
	}
	@Test
	(dependsOnMethods = "credentials")
	public void Login() {
System.out.println("Login");
	}

}
