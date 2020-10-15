package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.pages.Login_page;
import com.crm.qa.pages.Sign_up_page;
import com.qa.Util.testutil;
import com.qa.base.testbase;

public class Sign_up_page_test extends testbase
{
	Sign_up_page signup;
	testutil tuil;
	String sheetname="peets_reg";
	
@BeforeMethod
	
	public void setup()
	{
		initialization();
		signup=new Sign_up_page();
	} 

@Test(priority=1)
public void addcontactpresent()
{
	signup.checkcreatecontactdisplayed();
}
@DataProvider
public Object[][] getdata()
{
	Object data [][]= tuil.getTestData(sheetname);
	return data;
	
}

@Test(priority=2,dataProvider="getdata")
public void addcntact(String firstname,String lastname,String email_address,String confirm_email_address,String password,
		String confirm_password) throws InterruptedException

{
	//contactpage.addcontact("james","tammy" , "peets");	
	signup.add_customer(firstname, lastname, email_address, confirm_email_address, password, confirm_password);
}
@AfterMethod
public void teardown()
{
	driver.quit();
}
}
