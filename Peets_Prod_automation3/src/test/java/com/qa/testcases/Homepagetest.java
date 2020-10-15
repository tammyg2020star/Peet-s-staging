package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Login_page;
import com.qa.base.testbase;

public class Homepagetest extends testbase
{
	Login_page loginpage;
	Homepage homepage;
	
	public Homepagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 homepage=new Homepage();
	} 
	@Test(priority=1)
	public void coffeelinktest() 
	{
	 homepage.coffeelinkvalidation();
	 Assert.assertTrue(true);
	}

	@Test(priority=2)
	public void Hoveronsubscriptionsheaderlinkclick() throws InterruptedException
	{
	 homepage.shopheaderlinkhover();	
	 Assert.assertTrue(true);
	}
	@Test(priority=3)
	public void bestsllerlinkvalidation() throws InterruptedException
	{
		homepage.coffeehome();
	}
	@Test(priority=4)
	public void validatecoffeelinks() throws InterruptedException
	{
		homepage.verifycoffee_links_present();
	}
	@Test(priority=5)
	public void validatetealinks()
	{
		homepage.verifytea_links_present();
	}
	@Test(priority=6)
	public void validatevisituslinks()
	{
		homepage.visituslinks();
	}
	@Test(priority=7)
	public void validatelearnmorelinks() 
	{
		homepage.learnmorelinks();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
