package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testbase;

public class Sign_up_page extends testbase
{

	@FindBy(xpath="//div[@class=\"account-holder\"]/a[contains(text(),'Sign In')]")
	WebElement mainlgn;
	
	
	@FindBy(xpath="//span[text()='Create An Account']")
	WebElement create_account;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement first_name;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"email_address\"]")
	WebElement email_address;
	
	@FindBy(xpath="//*[@id=\"confirm_email\"]")
	WebElement confirm_email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"confirmation\"]")
	WebElement confirmation;
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	WebElement submit;
	
	public Sign_up_page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkcreatecontactdisplayed()
	{
		mainlgn.click();
		create_account.click();
		return create_account.isDisplayed();
	}
	
	public void add_customer(String fname,String lname, String em,String con_em,String pass,String conf_pass) throws InterruptedException
	{
		
		mainlgn.click();
		create_account.click();
		first_name.sendKeys(fname);
		Thread.sleep(2000);
		lastname.sendKeys(lname);
		Thread.sleep(2000);
		email_address.sendKeys(em);
		Thread.sleep(2000);
		confirm_email.sendKeys(con_em);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		confirmation.sendKeys(conf_pass);
		Thread.sleep(6000);
		submit.click();
	}
}
