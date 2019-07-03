package com.pob1.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pob1.qa.base.Base;
import com.pob1.qa.pages.Page1;
import com.pob1.qa.pages.Page2;

public class Page1Test extends Base{

	Page1 pg1;
	Page2 pg2;
	
	public Page1Test() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		pg1 = new Page1();	
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
	}
	
	@Test (priority=1)
	public void page1getTitleTest() {
		String PageTile = pg1.getTitle();
		System.out.println("Page title is "+ PageTile);
	}
	
	@Test (priority=2)
	public void headerButtonEnabledTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		boolean headerButtonEnabled= pf1.headerButtonEnabled();
		System.out.println("The headerButtonEnabled is "+headerButtonEnabled);
	}
	
	@Test (priority=3)
	public void headerButtonDisplayedTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		boolean headerButtonDisplayed= pf1.headerButtonDisplayed();
		System.out.println("The headerButtonDisplayed is "+headerButtonDisplayed);
	}
	
	@Test (priority=4)
	public void homeTextisPresentTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		String homeText = pf1.homeTextisPresent();
		System.out.println("The value present in the Title attribute is "+homeText);
	}
	
	@Test (priority=5)
	public void altTextoftheGraphicTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		String graphicAltText = pf1.altTextoftheGraphic();
		System.out.println("The value present in the alt attribute is "+graphicAltText);
	}
	
	@Test (priority=6)
	public void continueButtonDisplayedTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		boolean continueButtonDispplayed = pf1.continueButton1Displayed();
		System.out.println("Continue button is displaying ? " +continueButtonDispplayed);
	}
	
	@Test (priority=7)
	public void continueButtonEnabledTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
		boolean continueButtonEnabled = pf1.continueButton1Enabled();
		System.out.println("Continue button is enabled ? " +continueButtonEnabled);
	}
	
	@Test (priority=8)
	public void continueNextPageTest() {
		Page1 pf1 = PageFactory.initElements(driver, Page1.class);
	pf1.continueNextPage1();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
	

