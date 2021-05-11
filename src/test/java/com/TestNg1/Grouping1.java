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

public class Grouping1 {
	
	
	@Test(groups="Electronics")
	private void mobile() {
		System.out.println("mobile search");
	}
	@Test(groups="Electronics")
	private void earphone() {
		System.out.println("earphones search");
		
		}
	@Test(groups="Electronics")
	private void laptop() {
		System.out.println("laptop search");

	}
	@Test(groups="social media")
	private void whatsapp() {
		System.out.println("watsapp search");

	}
	@Test(groups="social media")
	private void facebook() {
		System.out.println("facebook search");

	}
	@Test(groups="education")
	private void books() {
		System.out.println("books");

	}
	
	

}
