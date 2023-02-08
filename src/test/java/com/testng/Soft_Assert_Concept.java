package com.testng;

import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
private void demo() {
	String exp = "Sanjay";
	String act = "Sanjay";
	SoftAssert s = new SoftAssert();
	s.assertEquals(act, exp);
	System.out.println("Verfication");
}
}
