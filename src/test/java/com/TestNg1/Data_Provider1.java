package com.TestNg1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider1 {
	
	@Test(dataProvider="test_Data")
	private void credentials(String username,int password) {
		System.out.println("username: "+username);
		System.out.println("password: "+password);
				

			}
	
	//object[][]

	@DataProvider
	private Object[][] test_Data() {
		
		return new Object[][]{
			
			{"anu",123},
			{"jothi",456},
			{"yuvan",789}
			
		};

	}
}
