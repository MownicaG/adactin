package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrized {

	@Test
	@Parameters({"username","password"})
	public void credentials(@Optional("xyz")String username,String password) {
  
System.out.println("Username is:" +username );

System.out.println("Password is:" +password);

}

}
