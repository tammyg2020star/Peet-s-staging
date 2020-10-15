package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.testbase;

public class Homepage extends testbase
{
	public Actions action;
	
	@FindBy(xpath="//a[@data-id='coffee-nav' and contains(text(),'Coffee')]")
	WebElement coffeelink;
	
	@FindBy(xpath="//a[@data-id='tea-nav' and contains(text(),'Tea')]")
	WebElement tealink;

	@FindBy(xpath="//a[@data-id='subscriptions-nav' and contains(text(),'Subscriptions')]")
	WebElement subscriptionlink;

	@FindBy(xpath="//a[@data-id='visit-us-nav' and contains(text(),'Visit Us')]")
	WebElement visituslink;
	
	@FindBy(xpath="//a[@data-id='learn-nav' and contains(text(),'Learn')]")
	WebElement learnlink;
	
	@FindBy(xpath="//a[@href='/collections/coffee-best-sellers' and contains(text(),'Best Sellers') and ancestor::li[@class='nav__column-item']]")
	WebElement bestsellers;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Limited Releases') and ancestor::li[@class='nav__column-item']]")
	WebElement liited_release;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Reserve Collection') and ancestor::li[@class='nav__column-item']]")
	WebElement reserve_collection;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Dark Roast') and ancestor::li[@class='nav__column-item']]")
	WebElement darkroast;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Medium Roast') and ancestor::li[@class='nav__column-item']]")
	WebElement mediumroast;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Light Roast') and ancestor::li[@class='nav__column-item']]")
	WebElement lightroast;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Coffee Beans') and ancestor::li[@class='nav__column-item']]")
	WebElement coffeebeans;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'K-Cup Pods') and ancestor::li[@class='nav__column-item']]")
	WebElement kcuppods;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Espresso Capsules') and ancestor::li[@class='nav__column-item']]")
	WebElement espressocapsules;
	
	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Bottled Beverages') and ancestor::li[@class='nav__column-item']]")
	WebElement bottlebeverages;
	
	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Online Exclusives') and  ancestor:: nav[@id='coffee-nav']]")
	WebElement onlinexclusive;
	
	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Gift Sets') and  ancestor:: nav[@id='coffee-nav']]")
	WebElement giftsets;
	
	@FindBy(xpath="//a[@href='/collections/tea-best-sellers' and contains(text(),'Best Sellers') and ancestor::li[@class='nav__column-item']]")
	WebElement teabestsellers;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Limited Release Tea') and ancestor::li[@class='nav__column-item']]")
	WebElement limitedrelesetea;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Signature Tea Blends') and ancestor::li[@class='nav__column-item']]")
	WebElement signatureblend;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Black') and ancestor::li[@class='nav__column-item']]")
	WebElement black;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Green') and ancestor::li[@class='nav__column-item']]")
	WebElement green;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'White') and ancestor::li[@class='nav__column-item']]")
	WebElement white;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Herbal') and ancestor::li[@class='nav__column-item']]")
	WebElement herbal;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Oolong') and ancestor::li[@class='nav__column-item']]")
	WebElement oolong;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Matcha') and ancestor::li[@class='nav__column-item']]")
	WebElement matcha;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Pu'er') and ancestor::li[@class='nav__column-item']]")
	WebElement peur;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Loose Leaf') and ancestor::li[@class='nav__column-item']]")
	WebElement looseleaf;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Tea Bags') and ancestor::li[@class='nav__column-item']]")
	WebElement teabags ;

	@FindBy(xpath="//a[@class='nav__link' and contains(text(),'Iced Tea') and ancestor::li[@class='nav__column-item']]")
	WebElement icedtea;


	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Find a Coffeebar') and  ancestor:: nav[@id='visit-us-nav']]")
	WebElement findacoffeebar;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Find a Product') and  ancestor:: nav[@id='visit-us-nav']]")
	WebElement findaproduct;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Coffeebar Menu') and  ancestor:: nav[@id='visit-us-nav']]")
	WebElement coffeebarmenu;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),' Peetnik Rewards') and  ancestor:: nav[@id='visit-us-nav']]")
	WebElement peetnikrewards;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Our Coffee Revolution') and  ancestor:: nav[@id='learn-nav']]")
	WebElement coffeerevolution;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Commitment to Craft') and  ancestor:: nav[@id='learn-nav']]")
	WebElement commitmenttocarft;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Social Responsibility') and  ancestor:: nav[@id='learn-nav']]")
	WebElement socialresponsibility;

	@FindBy(xpath="//p[@class='nav__tout-text' and contains(text(),'Brew Guides') and  ancestor:: nav[@id='learn-nav']]")
	WebElement brewguides ;


	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}

	public void coffeelinkvalidation()
	{
		coffeelink.isDisplayed();
		tealink.isDisplayed();
		subscriptionlink.isDisplayed();
		visituslink.isDisplayed();
		learnlink.isDisplayed();		
		return;
	
	}
	
		public void shopheaderlinkhover() throws InterruptedException
	{
		action=new Actions(driver);
		action.moveToElement(coffeelink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(tealink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(subscriptionlink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(visituslink).build().perform();
		Thread.sleep(2000);
		action.moveToElement(learnlink).build().perform();
	}
		public  Bestsellerspage coffeehome() throws InterruptedException
		{
			//closebtn.click();
			action=new Actions(driver);
			action.moveToElement(coffeelink).build().perform();
			bestsellers.click();
			//driver.navigate().back();
			Thread.sleep(2000);
			return new Bestsellerspage(); 
		}
		
		public void verifycoffee_links_present()
		{
			bestsellers.isDisplayed();
			liited_release.isDisplayed();
			reserve_collection.isDisplayed();
			darkroast.isDisplayed();
			mediumroast.isDisplayed();
			lightroast.isDisplayed();
			coffeebeans.isDisplayed();
			kcuppods.isDisplayed();
			espressocapsules.isDisplayed();
			bottlebeverages.isDisplayed();
			onlinexclusive.isDisplayed();
			giftsets.isDisplayed();
			return;
		}
		
		public void verifytea_links_present()
		{
			teabestsellers.isDisplayed();
			limitedrelesetea.isDisplayed();
			signatureblend.isDisplayed();
			black.isDisplayed();
			green.isDisplayed();
			white.isDisplayed();
			herbal.isDisplayed();
			oolong.isDisplayed();
			matcha.isDisplayed();
			peur.isDisplayed();
			looseleaf.isDisplayed();
			teabags.isDisplayed();
			icedtea.isDisplayed();					
		}
		
		public void visituslinks() 
		{
			findacoffeebar.isDisplayed();
			findaproduct.isDisplayed();
			coffeebarmenu.isDisplayed();
			peetnikrewards.isDisplayed();
		}
		
		public void learnmorelinks()
		{
			coffeerevolution.isDisplayed();
			commitmenttocarft.isDisplayed();
			socialresponsibility.isDisplayed();
			brewguides.isDisplayed();
		}
	
}
