package com.jenkins.testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {

	@Test
	@BeforeClass
	public void run1()
	{
	System.out.println("run1 is running ");	
	}

	@BeforeMethod
	public void run2()
	{
		System.out.println("run 2 is running ");
	}
	@AfterMethod
	@Test(dependsOnMethods="run1")
	public void run3()
	{
		//Assert.fail();
		
		System.out.println("run 3 is  running ");
	}
	
	}


