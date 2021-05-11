package com.TestNg1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	
	@Test
	@Parameters({"username", "password"})
			private void credentials(@Optional("karthi")String username,int password) {
		System.out.println("Username: "+username);
		System.out.println("password: "+password);
				

			}
			
			

}
