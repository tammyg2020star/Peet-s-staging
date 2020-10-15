package com.crm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.testbase;

public class Footer_page extends testbase
{
	public Actions action;
	public Select select;
	WebDriverWait wait=new WebDriverWait(driver,15);
	
	@FindBy(xpath="//a[contains(text(),'Help Center')]")
	WebElement Help_Center;
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	WebElement my_Account;
	
	@FindBy(xpath="//a[contains(text(),\"Peet's Cards\")]")
	WebElement Peet_Card;
	
	@FindBy(xpath="//a[contains(text(),\"Peetnik Rewards\")]")
	WebElement Peetnik;
	
	@FindBy(xpath="//a[contains(text(),\"Shipping and Returns\")]")
	WebElement Shipping;
	
	@FindBy(xpath="//a[contains(text(),\"Current Offers\")]")
	WebElement Offers;
	
	@FindBy(xpath="//a[contains(text(),\"Grocery Stores\")]")
	WebElement Grocery;
	
	@FindBy(xpath="//a[contains(text(),\"Code of Ethics\")]")
	WebElement Ethics;
	
	@FindBy(xpath="//a[contains(text(),\"Responsible Sourcing\")]")
	WebElement Sourcing;
	
	@FindBy(xpath="//a[contains(text(),\"Supply Chain Transparency\")]")
	WebElement Transparency;
	
	@FindBy(xpath="//a[contains(text(),\"Submit A Site\")]")
	WebElement Site;
	
	@FindBy(xpath="//a[contains(text(),\"Affiliate Program\")]")
	WebElement Affiliate;
	
	@FindBy(xpath="//a[contains(text(),\"Licensed Partners\")]")
	WebElement Licensed;
	
	@FindBy(xpath="//a[contains(text(),\"Proudly Pouring\")]")
	WebElement Pouring;
	
	@FindBy(xpath="//a[contains(text(),\"Office Coffee\")]")
	WebElement Office_cfee;
	
	@FindBy(xpath="//a[contains(text(),\"Mighty Leaf Tea\")]")
	WebElement Mighty;
	
	@FindBy(xpath="//a[contains(text(),\"Join Peet's\")]")
	WebElement Join;
	
	@FindBy(xpath="//a[contains(text(),\"Social Responsibility\")]")
	WebElement Social_res;
	
	@FindBy(xpath="//a[contains(text(),\"Our People\")]")
	WebElement Our_people;

	@FindBy(xpath="//a[contains(text(),\"Newsroom\")]")
	WebElement Newsroom;
	
	@FindBy(xpath="//a[contains(text(),\"Refer A Friend\")]")
	WebElement Refer_friend;
	
	public Footer_page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean checkhelpfooterlink()
	{
		return Help_Center.isDisplayed();
		
	}
	public boolean checkmy_Accountlink()
	{
		return my_Account.isDisplayed();
		
	}
	public boolean checkPeet_Cardlink()
	{
		return Peet_Card.isDisplayed();
		
	}
	
	public boolean checkPeetniklnk()
	{
		return Peetnik.isDisplayed();
		
	}
	public boolean checkShippinglnk()
	{
		return Shipping.isDisplayed();
		
	}
	public boolean checkOfferslnk()
	{
		return Offers.isDisplayed();
		
	}
	public boolean checkGrocerylnk()
	{
		return Grocery.isDisplayed();
		
	}
	public boolean checkEthicslnk()
	{
		return Ethics.isDisplayed();
		
	}
	public boolean checkSourcinglnk()
	{
		return Sourcing.isDisplayed();
		
	}
	public boolean checkTransparencylnk()
	{
		return Transparency.isDisplayed();
		
	}
	public boolean checkSitelnk()
	{
		return Site.isDisplayed();
		
	}
	public boolean checkAffiliatelnk()
	{
		return Affiliate.isDisplayed();
		
	}
	public boolean checkLicensedlnk()
	{
		return Licensed.isDisplayed();
		
	}
	public boolean checkPouringlnk()
	{
		return Pouring.isDisplayed();
		
	}
	public boolean checkMightylnk()
	{
		return Mighty.isDisplayed();
		
	}
	public boolean checkJoinlnk()
	{
		return Join.isDisplayed();
		
	}
	public boolean checkSocial_reslnk()
	{
		return Social_res.isDisplayed();
		
	}
	public boolean checkOur_peoplelnk()
	{
		return Our_people.isDisplayed();
		
	}
	public boolean checkNewsroomlnk()
	{
		return Newsroom.isDisplayed();
		
	}
	public boolean checkRefer_friendlnk()
	{
		return Refer_friend.isDisplayed();
		
	}
	

}
