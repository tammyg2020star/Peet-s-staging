package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Login_page;
import com.crm.qa.pages.Myaccountpage;
import com.qa.base.testbase;


public class LoginPageTest extends testbase
{
	Login_page loginpage;
	Myaccountpage myaccount;
	Homepage home;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new Login_page();
	} 
	
	@Test(priority=1)
	public void loginpagetitletest() 
	{
		String title = loginpage.validateloginpagetitle();
		//Assert.assertEquals(title, "The Original Craft Coffee | Peet's Coffee");
	}
	
	@Test(priority=2)
	public void crmlogotest()
	{
		boolean logo = loginpage.validatelogo();
		Assert.assertTrue(logo);
	}
	@Test(priority=3)
	public void logintest() throws InterruptedException
	{
		//loginpage.login(prop.getProperty("uname"), prop.getProperty("pwd"));
		loginpage.login();
		
	}
	@Test(priority=3)
	public void createaccountcheck()
	{
		home=loginpage.createaccount(prop.getProperty("firstname"),
				prop.getProperty("lastname"),prop.getProperty("email"),
				prop.getProperty("password"),prop.getProperty("confirmpassword"));
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
