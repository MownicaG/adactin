package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssertCon {
	public void demo() {
		String exp = "Sanjay";
		String act = "Sanjay";
		Assert.assertEquals(act, exp);

		System.out.println("Validation");
	}
	
	
	

}
