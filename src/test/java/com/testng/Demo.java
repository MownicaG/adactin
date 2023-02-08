package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
private void username() {
String exp = "SGhgi";
String act = "SGhgi";
Assert.assertEquals(act, exp);

}
	@Test(retryAnalyzer = Rerun.class)
public void password() {
	String exp = "123";
	String act = "12345";
	Assert.assertEquals(act, exp);
}
}
