package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Searchpage;
import com.qa.Util.testutil;
import com.qa.base.testbase;

public class seachpagetest extends testbase
{
Searchpage search;
testutil util;


	public seachpagetest()
	{	
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		search=new Searchpage();
	} 
	
	@Test(priority=1)
	public void existingusercheckoutvalidation() throws InterruptedException
	{
		search.registerusercheckout();
	}
	@Test(priority=2)
	public void guestcheckoutvalidation() throws InterruptedException
	{
		search.guest_checkout();
	}

	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}