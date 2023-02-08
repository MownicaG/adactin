package com.testng;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;

public class Grouping {
	@Test(groups = "Veg")
	public void shawarma() {
System.out.println("shawarma");
	}
	@Test(groups = "non veg")
	public void Biryani() {
System.out.println("Biryani");

	}
	@Test(groups = "Veg")
	public void curdrice() {
System.out.println("curdrice");
	}
	@Test(groups = "Veg")
	public void vegmeals() {
System.out.println("vegmeals");
	}
	@Test(groups = "non veg") 
	
	public void chickenBurger() {
System.out.println("chickenBurger");
	}
	
	@Test(groups = "Gadgets")
	public void laptop() {
System.out.println("hp");
	}
	@Test(groups = "Gadgets") 
	
	public void mobile() {
System.out.println("apple");
	}


}
