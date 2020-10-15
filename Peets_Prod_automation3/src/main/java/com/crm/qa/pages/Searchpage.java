package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.testbase;

public class Searchpage extends testbase  
{
	public Actions action;
	public Select select;
	public JavascriptExecutor js;
	String cardNum= "4111111111111111";
    String name= "James Tammy";
    String expire= "12/24";
    String cvvcode= "344";
	
	@FindBy(xpath="//i[@class='icon icon--account-black' and ancestor::div[contains(@class,'header__container')]]")
	 public WebElement Mainlgn;
	
	@FindBy(xpath ="//*[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"okta-signin-submit\"]")
	WebElement signin;
	
	@FindBy(xpath="//button[@class='btn-icon js-search-toggle' and ancestor::div[@class='header__container container container--small container--full-bleed']]")
	WebElement mainsearch;
	
	@FindBy(xpath="//*[@id='searchInput']")
	WebElement itemsearch;
	
	@FindBy(xpath="//*[@id='searchMenuBtn']")
	WebElement coreitem;
	
	@FindBy(xpath="//a[@href='/products/aged-sumatra' and contains(text(),'Aged Sumatra')]")
	WebElement  item1;
	
	@FindBy(xpath="//*[@id='btnAddToBagText']")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@class='bag__action bag__checkout btn btn--primary btn--full js-checkout-link' and contains(text(),'Checkout')]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id='checkout_email']")
	WebElement emailadd;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_first_name']")
	WebElement firstname1 ;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_last_name']")
	WebElement lastname1;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_address1']")
	WebElement address2;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_city']")
	WebElement city1;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_zip']")
	WebElement addresszip1;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_phone']")
	WebElement phone1;
	
	@FindBy(xpath="//*[@id='checkout_email']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_first_name']")
	WebElement firstname ;
	
	@FindBy(xpath="checkout_shipping_address_last_name")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_address1']")
	WebElement address1;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_city']")
	WebElement city;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_zip']")
	WebElement addresszip;
	
	@FindBy(xpath="//*[@id='checkout_shipping_address_phone']")
	WebElement phone;
	
	@FindBy(xpath="//*[@id='continue_button']")
	WebElement contbtn;
	
	@FindBy(xpath="//*[@id='continue_button']/span[@class='btn__content' and contains(text(),'Continue to payment')]")
	WebElement paymentbtn;
	
	@FindBy(xpath="//input[@id='number' and preceding-sibling::label[@class='visually-hidden' and contains(text(),'Card number')]]")
	WebElement cardnumber;
	
	@FindBy(xpath="//input[@placeholder='Name on card' and preceding-sibling::label[@class='visually-hidden' and contains(text(),'Name on card')]]")
	WebElement cardname;
	
	@FindBy(xpath="//input[@placeholder='Expiration date (MM / YY)' and preceding-sibling::label[@class='visually-hidden' and contains(text(),'Expiration date (MM / YY)')]]")
	WebElement date;
	
	@FindBy(xpath="//input[@placeholder='Security code' and preceding-sibling::label[@class='visually-hidden' and contains(text(),'Security code')]]")
	WebElement cvv;
	
	@FindBy(xpath="//*[@id='checkout_different_billing_address_false']")
	WebElement continueshipping;
	
	@FindBy(xpath="//button[@id='continue_button' and descendant::span[contains(text(),'Pay now')]]")
	WebElement paynow;
	@FindBy(xpath="//*[@id='customerEmail']")
	WebElement custemail;
	@FindBy(xpath="//*[@id='customerPassword']")
	WebElement pass1;
	@FindBy(xpath="//button[@class='btn btn--full' and contains(text(),'Sign In')]")
	WebElement signing;
	@FindBy(xpath="//*[@id='checkout_email']")
	WebElement checkout_email;
	@FindBy(xpath="//*[@id='checkout_shipping_address_first_name']")
	WebElement check_fname;
	@FindBy(xpath="//*[@id='checkout_shipping_address_last_name']")
	WebElement check_lname;
	@FindBy(xpath="//*[@id='checkout_different_billing_address_false']")
	WebElement samebilling;
	
	public Searchpage()
	{
		PageFactory.initElements(driver,this);
	}
/*
	
	public void searchfunctionality()
	{
		action=new Actions(driver);
	}
	
	public void presenter()
	{
		
		action.sendKeys(Keys.ENTER).build().perform();  //click ener on the search item
	}
	
	public void scrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)","");	
		
	}
	
	public void performmousehover(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0].click()", element);		
	}*/
	
	public void registerusercheckout() throws InterruptedException
	{ 
		driver.navigate().to("https://peets-coffee-staging.myshopify.com/account/login?return_url=%2Faccount#/");
		String email="johntammy@gmail.com";
		String pwd1="Dolphin@123";
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[1].value = arguments[0]; ", email, custemail); 
		js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[1].value = arguments[0]; ", pwd1, pass1);
		signing.click();
		System.out.println("Its a existing customer");
		Thread.sleep(2000);
		mainsearch.click();
		Thread.sleep(3000);
		itemsearch.sendKeys("aged sumatra");
		Thread.sleep(3000);
		//action.sendKeys(Keys.ENTER).build().perform(); 
		coreitem.click();
		Thread.sleep(2000);
		item1.click();
		Thread.sleep(2000);
		 js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click()",addtocart);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable("addtocart")).click();
				addtocart.click();
				Thread.sleep(4000);
					checkout.click();
					address2.sendKeys("1186 Roseville Pkwy");
					city1.sendKeys("Roseville");
					
					select=new Select(driver.findElement(By.id("checkout_shipping_address_country")));
					 select.selectByVisibleText("United States");
					 select=new Select(driver.findElement(By.id("checkout_shipping_address_province")));
					select.selectByVisibleText("California");
					addresszip.sendKeys("95678");
					phone.sendKeys("6678903456");
					Thread.sleep(3000);
		contbtn.click();
		Thread.sleep(3000);
		try {
		       WebDriverWait wait=new WebDriverWait(driver, 20);

		       wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath(" //*[@id='continue_button' and descendant ::span[contains(text(),'Continue to payment')]]"))
		       ).click();
		 }
	    catch(Throwable t){
	        System.out.println("The execption is: " + t);
	    }
		Thread.sleep(2000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-number')]")));
		    	js= (JavascriptExecutor) driver;
		    	js.executeScript("arguments[1].value = arguments[0]; ", cardNum, cardnumber); 
		    	driver.switchTo().defaultContent();
		    	Thread.sleep(2000);   
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-name')]")));
	    		js= (JavascriptExecutor) driver;
	    		js.executeScript("arguments[1].value = arguments[0]; ", name, cardname); 
	    		driver.switchTo().defaultContent();
	    		Thread.sleep(2000);
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-expiry')]")));
	    		js= (JavascriptExecutor) driver;
	    		js.executeScript("arguments[1].value = arguments[0]; ", expire, date); 
	    		driver.switchTo().defaultContent();
	    		Thread.sleep(2000);
   		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-verification_value')]")));
   				js= (JavascriptExecutor) driver;
   				js.executeScript("arguments[1].value = arguments[0]; ", cvvcode, cvv); 
   				driver.switchTo().defaultContent();
   				Thread.sleep(2000);
   				continueshipping.click();
   				Thread.sleep(4000);
   				paynow.click();
   				Thread.sleep(5000);
		}
		
	public void guest_checkout() throws InterruptedException
	{
			mainsearch.click();
			itemsearch.sendKeys("aged sumatra");
			Thread.sleep(2000);
			//action.sendKeys(Keys.ENTER).build().perform(); 
			coreitem.click();
			Thread.sleep(2000);
			item1.click();
			Thread.sleep(2000);
			 js = (JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click()",addtocart);
			addtocart.click();
			Thread.sleep(4000);
			checkout.click();
			checkout_email.sendKeys(prop.getProperty("email"));
			check_fname.sendKeys(prop.getProperty("fname"));
			check_lname.sendKeys(prop.getProperty("lname"));
			address2.sendKeys(prop.getProperty("address"));
			city1.sendKeys(prop.getProperty("city"));						
			select=new Select(driver.findElement(By.id("checkout_shipping_address_country")));
			select.selectByVisibleText("United States");
			select=new Select(driver.findElement(By.id("checkout_shipping_address_province")));
			select.selectByVisibleText("California");
			addresszip.sendKeys(prop.getProperty("postal_code"));
			phone.sendKeys(prop.getProperty("telephone"));
			Thread.sleep(3000);
			contbtn.click();
			Thread.sleep(3000);
			try {
			       WebDriverWait wait=new WebDriverWait(driver, 20);

			       wait.until(ExpectedConditions.visibilityOfElementLocated(
			            By.xpath(" //*[@id='continue_button' and descendant ::span[contains(text(),'Continue to payment')]]"))
			       ).click();
			 }
		    catch(Throwable t){
		        System.out.println("The execption is: " + t);
		    }
			Thread.sleep(2000);
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-number')]")));
	    	js= (JavascriptExecutor) driver;
	    	js.executeScript("arguments[1].value = arguments[0]; ", cardNum, cardnumber); 
	    	driver.switchTo().defaultContent();
	    	Thread.sleep(2000);   
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-name')]")));
    		js= (JavascriptExecutor) driver;
    		js.executeScript("arguments[1].value = arguments[0]; ", name, cardname); 
    		driver.switchTo().defaultContent();
    		Thread.sleep(2000);
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-expiry')]")));
    		js= (JavascriptExecutor) driver;
    		js.executeScript("arguments[1].value = arguments[0]; ", expire, date); 
    		driver.switchTo().defaultContent();
    		Thread.sleep(2000);
	   		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'card-fields-verification_value')]")));
			js= (JavascriptExecutor) driver;
			js.executeScript("arguments[1].value = arguments[0]; ", cvvcode, cvv); 
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
	   		continueshipping.click();
	   		Thread.sleep(4000);
	   		paynow.click();
	   		Thread.sleep(5000);
			}			
	}


	


