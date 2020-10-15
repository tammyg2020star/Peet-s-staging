package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Checkout_page;
import com.crm.qa.pages.Homepage;
import com.qa.base.testbase;

public class checckout_page_test extends testbase
{
	Checkout_page chkpage;
	public checckout_page_test()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		chkpage=new Checkout_page();
	} 
	
	@Test(priority=1)
	public void checkout_check() throws InterruptedException
	{
	
		chkpage.checkout();
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}
