package com.TestNg1;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	public class Simple_Annotation1 {
		
		@BeforeSuite
		private void setproperty() {
			System.out.println("set property");
		}
		
		@BeforeTest
		private void browserlaunch() {
			System.out.println("browserlaunch");
		}
		@BeforeClass
		private void url() {
			System.out.println("url");
		}
		@BeforeMethod
		private void login() {
			System.out.println("login");
		}
		@Test(enabled=false)
		private void laptop() {
			System.out.println("laptop search");

		}
		
		@Ignore
		@Test
		private void mobile() {
			System.out.println("mobile search");
		}
		@Test
		private void earphone() {
			System.out.println("earphones search");
			
			}
		@AfterMethod
		private void logout() {
			System.out.println("logout");
		}
		@AfterClass
		private void verifyhomepage() {
			System.out.println("home");

		}
		@AfterTest
		private void close() {
			System.out.println("close");
		}
		@AfterSuite
		private void deleteAllCookies() {
			System.out.println("Delete all cookies");
		}
		
		
	}



