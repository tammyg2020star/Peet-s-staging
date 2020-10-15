package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.Util.WebEventListener;
import com.qa.Util.testutil;
/**
 * Author: @Tammyg
 */
public class testbase 
{
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener  eventlistner;
	
	public testbase()
	{
		try
		{
				
 prop=new Properties();
		
		FileInputStream fip=new FileInputStream("C:\\Users\\Thimmegowda\\Desktop\\Eclipse_work\\Peets_Prod_automation3\\src\\main\\java\\com\\qa\\config\\config.properties");
		
		prop.load(fip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Thimmegowda\\Desktop\\selenium jars\\Drivers\\New chrome\\chromedriver.exe");
			 driver=new ChromeDriver();//launch chrome
		}else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Thimmegowda\\Desktop\\selenium jars\\Drivers\\geckodriver.exe");
			 driver=new FirefoxDriver();//launch chrome
		}
		
		e_driver=new EventFiringWebDriver(driver);
		
		eventlistner=new WebEventListener();
		e_driver.register(eventlistner);
		driver=e_driver;
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(testutil.page_load_timeout, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(testutil.implicit_wait,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		//driver.get(prop.getProperty("loginurl"));
		
	}
}
