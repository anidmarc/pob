package com.pob1.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pob1.qa.base.Base;
import com.pob1.qa.pages.Page1;
import com.pob1.qa.pages.Page2;
import com.pob1.qa.pages.Page4;

public class Page4Test extends Base{

	
	public Page4Test() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		Page1 pf1= PageFactory.initElements(driver, Page1.class);
		Page2 pf2= PageFactory.initElements(driver, Page2.class);
		pf1.continueNextPage1();
		pf2.continueNextPage();
		pf2.continueNextPage();
	}
	
	@Test (priority=1)
	public void EnvironmentalButtonDisplayedTest() {
		Page4 pf4 = PageFactory.initElements(driver, Page4.class);
		boolean Enviornmental_Button = pf4.EnvironmentalButtonDisplayed();
		System.out.println("Environmental button is displaying ? " +Enviornmental_Button);
	}
	
	@Test (priority=2)
	public void EnvironmentalButtonEnabledTest() {
		Page4 pf4 = PageFactory.initElements(driver, Page4.class);
		boolean Enviornmental_Button = pf4.EnvironmentalButtonEnabled();
		System.out.println("Continue button is enabled ? " +Enviornmental_Button);
	}
	
	@Test (priority=3)
	public void EnvironmentalButtonNextPageTest() {
		Page4 pf4 = PageFactory.initElements(driver, Page4.class);
	pf4.EnvironmentalButtonNextPage();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.close();
	}
}
