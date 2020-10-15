package com.crm.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.j2objc.annotations.ObjectiveCName;
import com.qa.base.testbase;
public class Login_page extends testbase 
{
	
//pagefactory
	
	 @FindBy(xpath="//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	 public WebElement Mainlgn;
	
	@FindBy(xpath ="//*[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"okta-signin-submit\"]")
	WebElement signin;
	
	@FindBy(xpath="//button[@class=\"button btn-dark\" and @type=\"button\"]")
	WebElement signupbtn;
	
	@FindBy(xpath="//i[contains(@class,'header__icon')  and ancestor::div[contains(@class,'header__container container container')]]")
	WebElement titlelogo;
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement createaccountlnk;
	@FindBy(xpath="//*[@id='FirstName']")
	WebElement fname;
	@FindBy(xpath="//*[@id='LastName']")
	WebElement lname;
	@FindBy(xpath="//*[@id='Email']")
	WebElement email;
	@FindBy(xpath="//*[@id='Password']")
	WebElement pass;
	@FindBy(xpath="//*[@id='PasswordCheck']")
	WebElement resetpass;
	@FindBy(xpath="//input[@value='Create']")
	WebElement create;
	@FindBy(xpath="//*[@id='customerEmail']")
	WebElement custemail;
	@FindBy(xpath="//*[@id='customerPassword']")
	WebElement pass1;
	@FindBy(xpath="//button[@class='btn btn--full' and contains(text(),'Sign In')]")
	WebElement signing;
	

	@FindBy(xpath="//button[@class='btn-icon js-search-toggle' and ancestor::div[@class='header__container container container--small container--full-bleed']]")
	WebElement mainsearch;
	
	public Login_page()  //constructor
	{
		PageFactory.initElements(driver,this);//how will you initialize pagefactory by using initElements
		//this is pointing to current page object
		
	}
	
	
	public String validateloginpagetitle() {
		
		return	driver.getTitle();
	}
	
	public boolean validatelogo()
	{
		return titlelogo.isDisplayed();
	}
	
	
	public void login() throws InterruptedException
	{
		//Mainlgn.click();
		driver.navigate().to("https://peets-coffee-staging.myshopify.com/account/login?return_url=%2Faccount#/");
		String email="johntammy@gmail.com";
		String pwd1="Dolphin@123";
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[1].value = arguments[0]; ", email, custemail); 
		js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[1].value = arguments[0]; ", pwd1, pass1);
		signing.click();
		Thread.sleep(2000);
		//driver.navigate().to("https://peets-coffee-staging.myshopify.com/account#/");
		//Thread.sleep(2000);
		mainsearch.click();		
	}
	
	public Homepage createaccount(String firname, String Lstname, String emi,String pwd, String repwd)
	{
		Mainlgn.click();
		try
		{ 
			createaccountlnk.click();
			fname.sendKeys(firname);
			lname.sendKeys(Lstname);
			email.sendKeys(emi);
			pass.sendKeys(pwd);
			resetpass.sendKeys(repwd);
			create.click();
		 }
		catch (Exception e) {
			e.printStackTrace();
		}	
		return new Homepage();
	}
}
