package com.TestNg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
		@Test(retryAnalyzer = Retry_class.class)
		private void credentials() {
			
			String db_username="smith";
			String actual_username="starc";
			Assert.assertEquals(actual_username, db_username);
			
		}
		@Test(retryAnalyzer = Retry_class.class)
		private void credentials1() {
			
			
			String db_password="smith@123";
			String actual_password="smith@123";
			Assert.assertEquals(actual_password, db_password);
			
			
			}
					
					

}
