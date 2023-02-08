package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalser_Concept {
	@Test
private void username() {
	String exp = "Sanjay";
	String act = "Sanjay";
	Assert.assertEquals(act, exp);
}
	@Test(retryAnalyzer = Rerun.class)
public void password() {
	String exp = "123";
	String act = "1234";
	Assert.assertEquals(act, exp);
	
}
}
