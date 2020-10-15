package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.testbase;

public class Checkout_page extends testbase
{

	public Actions action;
	public Select select;
	WebDriverWait wait=new WebDriverWait(driver,15);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']")));
	
	@FindBy(id="shop-header-link")
	WebElement shophover;
	
	@FindBy(xpath="//a[contains(text(),'Shop Coffee')]")
	WebElement shpcoffelnk;
	
	@FindBy (xpath="//span[@class=\"link-text\" and contains(text(),\"Coffee\")]")
	WebElement coffeeitem;
	
	@FindBy (xpath="//a[@title=\"Organic French Roast\" and @tabindex=\"0\"]")
	WebElement itemtocart;
	
	@FindBy(xpath="//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")
	WebElement clickoncart;

	@FindBy(xpath="//a[@class=\"cart-link underlined-link\" and contains(text(),'View Cart')]")
	WebElement verifycart;
	
	@FindBy(xpath="//a[@class='button checkout-button btn-dark' and contains(text(),'Checkout')]")
	WebElement checkout;
	
	@FindBy(xpath="//span[contains(text(),'Continue as Guest')]")
	WebElement guest;
	
	@FindBy(xpath="//*[@id=\"shipping:firstname\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"shipping:lastname\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"shipping:telephone\"]")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"shipping:street1\"]")
	WebElement street1;
	
	@FindBy(xpath="//*[@id=\"shipping:postcode\"]")
	WebElement postcode;
	
	@FindBy(xpath="//*[@id=\"shipping:city\"]")
	WebElement city;
	
	@FindBy(xpath="//select[@id='shipping:region_id']")
	WebElement shipping_region;
	
	@FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement continue1;
	
	public Checkout_page()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void checkout() throws InterruptedException
	{
		shophover.click();
		shpcoffelnk.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@title=\"Organic French Roast\" and @tabindex=\"0\"]"))));
		Thread.sleep(3000);
		//driver.manage().wait(2000);
		 select = new Select(driver.findElement(By.id("attribute198")));
		select.selectByVisibleText("Drip");
		Thread.sleep(2000);
		clickoncart.click();
		//driver.manage().wait(3000);
		//verifycart.click();
		Thread.sleep(2000);
		checkout.click();
		Thread.sleep(2000);
		guest.click();
		Thread.sleep(2000);
		fname.sendKeys("tammy");
		Thread.sleep(2000);
		lname.sendKeys("james");
		Thread.sleep(2000);
		telephone.sendKeys("9844595891");
		Thread.sleep(2000);
		street1.sendKeys("123 main");
		Thread.sleep(2000);
		postcode.sendKeys("95825");
		Thread.sleep(2000);
		city.sendKeys("Sacramento");
		 select = new Select(driver.findElement(By.id("shipping:region_id")));
		 select.selectByVisibleText("California");
		 Thread.sleep(2000);
		 continue1.click();
	}
}
