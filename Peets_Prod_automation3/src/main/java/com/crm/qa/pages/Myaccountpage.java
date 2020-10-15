/**
 * 
 */
package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.testbase;

/**
 * @author Thimmegowda
 *
 */
public class Myaccountpage extends testbase
{
	
	@FindBy(xpath="//a[@data-id='coffee-nav' and contains(text(),'Coffee')]")
	WebElement coffeelink;

}
