package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	@Test(dataProvider = "data")
	public void credentials(String username,String password) {
		System.out.println("Username is:" +username );
		
		System.out.println("Password is:" +password);
	}
		@DataProvider
		public Object[][] data(){
			return new Object[][] {
				{"dgf","568"},{"rty","334"},{"gys","876"}
			};
			
		}
	}



