package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Login_page;
import com.crm.qa.pages.Teahomepage;
import com.qa.base.testbase;

public class Teapgaetest extends testbase
{

	Teahomepage teapage;
	public Teapgaetest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		teapage=new Teahomepage();
	} 

	@Test(priority=1)
	public void checkpdppage() throws InterruptedException
	{
		teapage.checkteapdppage();
		
	}
	
	@Test(priority=2)
	public void verifyincreaseanddescreaseqty() throws InterruptedException
	{
		teapage.increaseanddecreaseqty();
		
	}
	@Test(priority=3)
	public void verifyteaitemaddtocart() throws InterruptedException
	{
		teapage.addtocart();
		
	}
	
	@Test(priority=4)
	public void verifyremovecart() throws InterruptedException
	{
		teapage.removecart();	
	}
	
	@Test(priority=5)
	public void verifycheckout() throws InterruptedException
	{
		teapage.checkout();
		
	}
	
	@Test(priority=6)
	public void verifyguestcheckout() throws InterruptedException
	{
		teapage.guestcheckout();
	}
	
	@Test(priority=7)
	public void verifypagmentpage() throws InterruptedException
	{
		teapage.paymentpagedetails();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
