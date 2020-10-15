package com.crm.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.testbase;

public class Teahomepage extends testbase
{
	public Actions action;
	public Select select;
	public JavascriptExecutor js;
	Alert alert;
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	
	@FindBy(id="shop-header-link")
	WebElement shophover;
	
	@FindBy(xpath="//a[contains(text(),'Shop Tea')]")
	WebElement shoptea;
	
	@FindBy(xpath="//a[contains(text(),'Organic African Nectar Tea Bags')]")
	WebElement teaitem;
	
	@FindBy(id="qinputplus-12685")
	WebElement pluslink;
	
	@FindBy(id="qinputminus-12685")
	WebElement minuslink;
	
	@FindBy(xpath="//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@class='cart-link underlined-link' and contains(text(),'View Cart')]")
	WebElement viewcart;
	
	@FindBy(xpath="//a[@class='button checkout-button btn-dark' and contains(text(),'Checkout')]")
	WebElement Checkout;
	
	@FindBy(xpath="//a[@class='remove' and contains(text(),'remove')]")
	WebElement remove;
	
	@FindBy(xpath="//span[contains(text(),'Continue as Guest')]")
	WebElement Guest;
	
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
	
	@FindBy(xpath="//span[contains(text(),'Use Address As Entered *')]")
	WebElement clickasentered;
	
	public Teahomepage()
	{
		PageFactory.initElements(driver,this);
		try
		{
				
	prop=new Properties();
		
		FileInputStream fip=new FileInputStream("C:\\Users\\Thimmegowda\\Desktop\\Eclipse_work\\Peets_Prod_automation3\\src\\main\\java\\com\\qa\\config\\config.properties");
		
		prop.load(fip);
		}
		catch(FileNotFoundException e1)
		{
			e1.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void checkteapdppage() throws InterruptedException
	{
		shoptea.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		
	}
	
	public void increaseanddecreaseqty() throws InterruptedException
	{
		shoptea.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		pluslink.click();
		Thread.sleep(2000);
		minuslink.click();
		Thread.sleep(2000);	
	}
	
	public void addtocart() throws InterruptedException
	{
		shoptea.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		Thread.sleep(2000);
		WebElement cartitem = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")));
		cartitem.click();
	}
	public void removecart() throws InterruptedException
	{
		try
		{
		shoptea.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		WebElement cartitem = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")));
		cartitem.click();
		Thread.sleep(2000);
		remove.click();
		alert = driver.switchTo().alert();
		alert.getText();  //getting text
		alert.accept();
		}//click on Ok	
		catch(StaleElementReferenceException e) {
        }
	}
	
	public void checkout() throws InterruptedException
	{
		try
		{
		shoptea.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		WebElement cartitem = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")));
		cartitem.click();
		Thread.sleep(2000);
		WebElement fd = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@class='button checkout-button btn-dark' and contains(text(),'Checkout')]")));
				fd.click();
		}	
		catch(StaleElementReferenceException e) {
        }
	}
	public void guestcheckout() throws InterruptedException
	{
		try
		{
		shoptea.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		WebElement cartitem = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")));
		cartitem.click();
		Thread.sleep(2000);
		WebElement fd = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@class='button checkout-button btn-dark' and contains(text(),'Checkout')]")));
				fd.click();
				Guest.click();
				fname.sendKeys("tammyg");
				Thread.sleep(2000);
				lname.sendKeys("james");
				Thread.sleep(2000);
				telephone.sendKeys("9844595891");
				Thread.sleep(2000);
				street1.sendKeys("456 heritage");
				Thread.sleep(2000);
				postcode.sendKeys("95825");
				Thread.sleep(2000);
				city.sendKeys("Sacramento");
				Thread.sleep(2000);
				 select = new Select(driver.findElement(By.id("shipping:region_id")));
				select.selectByVisibleText("California");
				Thread.sleep(2000);
				continue1.click();
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated
						(By.xpath("//span[contains(text(),'Use Address As Entered *')]")));
				user.click();
	}
	catch(StaleElementReferenceException e) {
    }
				
	}

	public void paymentpagedetails() throws InterruptedException
	{
		try
		{
		shoptea.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[contains(text(),'Organic African Nectar Tea Bags')]"))));
		WebElement cartitem = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//button[@class='button btn-cart btn-dark' and contains(text(),'Add To Cart')]")));
		cartitem.click();
		Thread.sleep(2000);
		WebElement fd = wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//a[@class='button checkout-button btn-dark' and contains(text(),'Checkout')]")));
				fd.click();
				Guest.click();
				
				fname.sendKeys(prop.getProperty("fname"));
				Thread.sleep(2000);
				lname.sendKeys(prop.getProperty("lname"));
				Thread.sleep(2000);
				telephone.sendKeys(prop.getProperty("telephone"));
				Thread.sleep(2000);
				street1.sendKeys(prop.getProperty("address"));
				Thread.sleep(2000);
				postcode.sendKeys(prop.getProperty("postal_code"));
				Thread.sleep(2000);
				city.sendKeys(prop.getProperty("city"));
				 select = new Select(driver.findElement(By.id("shipping:region_id")));
				select.selectByVisibleText("California");
				Thread.sleep(2000);
				continue1.click();
		WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated
						(By.xpath("//span[contains(text(),'Use Address As Entered *')]")));
				user.click();
				Thread.sleep(2000);
				 js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
						(By.xpath("//button[@class='button btn-dark' and @onclick='ddate.save();']"))));
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='custompayment_cc_number']")).sendKeys("4111111111111111");
				driver.findElement(By.xpath("//*[@id='custompayment_cc_cid']")).sendKeys("344");
				 select = new Select(driver.findElement(By.xpath("//*[@id='custompayment_expiration']")));
					select.selectByVisibleText("02 - February");
					 select = new Select(driver.findElement(By.xpath("//*[@id='custompayment_expiration_yr']")));
						select.selectByVisibleText("2024");
						driver.findElement(By.xpath("//*[@id='custompayment_cc_owner']")).sendKeys("Tammy James");
						Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='billing:same_as_shipping']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("billing:email")).sendKeys("tammyg100@gmail.com");
				Thread.sleep(2000);
				js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.elementToBeClickable
						(By.xpath("//*[@id='payment-button-continue']"))));
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='payment-button-continue']")));
				 //action.moveToElement(driver.findElement(By.xpath("//*[@id='payment-button-continue']"))).click().perform();
				// js = (JavascriptExecutor) driver;
					//js.executeScript("arguments[0].click()",wait.until(ExpectedConditions.visibilityOfElementLocated
							//(By.xpath("//*[@id='payment-button-continue']"))));
				//driver.findElement(By.xpath("//button[@id='payment-button-continue' and @onclick='payment.save()']")).click();
				Thread.sleep(3000);
		}
		catch(StaleElementReferenceException e) {
	    }
		
	}
}
