package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test
	public void shawarma() {
System.out.println("shawarma");
	}
	@Ignore
	@Test
	public void Biryani() {
System.out.println("Biryani");
	}
	@Test (enabled = false)
	public void curdrice() {
System.out.println("curdrice");
	}
	@Test
	public void vegmeals() {
System.out.println("vegmeals");
	}
	@Test
	
	public void chickenBurger() {
System.out.println("chickenBurger");
	}

}
