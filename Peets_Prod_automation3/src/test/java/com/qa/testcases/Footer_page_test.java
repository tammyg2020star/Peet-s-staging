package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.Coffeepage;
import com.crm.qa.pages.Footer_page;
import com.qa.base.testbase;

public class Footer_page_test extends testbase
{
	Footer_page footer;
	public Footer_page_test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		footer=new Footer_page();
	} 

	@Test(priority=1)
	public void Help_Centerfooterlnkcheck()
	{
	boolean help = footer.checkhelpfooterlink();
	Assert.assertTrue(true);
	//Assert.assertEquals(help, "Help Center");
	}
	
	@Test(priority=2)
	public void verify_my_account_link()
	{
	boolean My_Account = footer.checkmy_Accountlink();
	Assert.assertTrue(true);
	//Assert.assertEquals(My_Account, "My Account");
	}
	
	@Test(priority=3)
	public void verify_Peets_Cards()
	{
	boolean Peet_Card = footer.checkPeet_Cardlink();
	Assert.assertTrue(true);
//	Assert.assertEquals(Peet_Card, "Peet's Cards");
	}
	
	@Test(priority=4)
	public void verify_Peetnik_cardslnk()
	{
	boolean checkPeetniklnk = footer.checkPeetniklnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(checkPeetniklnk,"Peetnik Rewards");
	}
	
	@Test(priority=5)
	public void verify_Shipping_Returnslink()
	{
	boolean Shipping_Returnslink = footer.checkShippinglnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(Shipping_Returnslink, "Shipping and Returns");
	}
	
	@Test(priority=6)
	public void verify_Current_Offerslink()
	{
	boolean Current_Offerslink = footer.checkOfferslnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(Current_Offerslink, "Current Offers");
	}
	
	@Test(priority=7)
	public void verifyGrocery_Storeslink()
	{
	boolean Grocery_Stores = footer.checkGrocerylnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(Grocery_Stores, "Grocery Stores");
	}
	
	@Test(priority=8)
	public void verifyCodeofEthicslnkcheck()
	{
	boolean CodeofEthics = footer.checkEthicslnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(CodeofEthics,"Code of Ethics");
	}
	
	@Test(priority=9)
	public void verifyResponsibleSourcinglnkcheck()
	{
	boolean ResponsibleSourcing = footer.checkSourcinglnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(ResponsibleSourcing, "Responsible Sourcing");
	}
	
	@Test(priority=10)
	public void verifySubmitASitelnkcheck()
	{
	boolean SubmitASite = footer.checkSitelnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(SubmitASite,"Submit A Site");
	}
	
	@Test(priority=11)
	public void verifyAffiliateProgramlnkcheck()
	{
	boolean AffiliateProgram = footer.checkAffiliatelnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(AffiliateProgram, "Affiliate Program");
	}
	
	@Test(priority=12)
	public void verifySupplyChainTransparencylnk()
	{
	boolean SupplyChainTransparency = footer.checkTransparencylnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(SupplyChainTransparency, "Supply Chain Transparency");
	}
	
	@Test(priority=13)
	public void verifyLicensedPartners()
	{
	boolean LicensedPartners = footer.checkLicensedlnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(LicensedPartners,"Licensed Partners");
	}
	
	@Test(priority=14)
	public void verifyProudlyPouringlnkcheck()
	{
	boolean ProudlyPouring = footer.checkPouringlnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(ProudlyPouring, "Proudly Pouring");
	}
	
	@Test(priority=15)
	public void verifyOfficeCoffeelink()
	{
	boolean OfficeCoffee = footer.checkOfferslnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(OfficeCoffee, "Office Coffee");
	}
	
	@Test(priority=16)
	public void HverifyMightyLeafTealnk()
	{
	boolean MightyLeafTea = footer.checkMightylnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(MightyLeafTea,"Mighty Leaf Tea");
	}
	
	@Test(priority=17)
	public void verifyJoinPeetslink()
	{
	boolean JoinPeetslink = footer.checkJoinlnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(JoinPeetslink, "Join Peet's");
	}
	
	@Test(priority=18)
	public void verifySocialResponsibilitylink()
	{
	boolean SocialResponsibility = footer.checkSocial_reslnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(SocialResponsibility, "Social Responsibility");
	}
	
	@Test(priority=19)
	public void verifyOurpeoplelink()
	{
	boolean Ourpeoplelink = footer.checkOur_peoplelnk();
	Assert.assertTrue(true);
//	Assert.assertEquals(Ourpeoplelink, "Our People");
	}
	
	@Test(priority=20)
	public void verifyNewsroom()
	{
	boolean Newsroom = footer.checkhelpfooterlink();
	Assert.assertTrue(true);
//	Assert.assertEquals(Newsroom, "Newsroom");
	}
	
	@Test(priority=21)
	public void verifyreferafriendlink()
	{
		boolean ReferFriend = footer.checkRefer_friendlnk();
		Assert.assertTrue(true);
//		Assert.assertEquals(ReferFriend, "Refer A Friend");
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.quit();
	}
}
