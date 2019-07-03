package com.pob1.qa.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pob1.qa.base.Base;
import com.pob1.qa.pages.Page1;
import com.pob1.qa.pages.Page2;
import com.pob1.qa.pages.Page3;

public class Page2Test extends Base {

	//Page1 pg1 = null;
	Page2 pg2= null;
	//Page3 pg3= null;
	
	public Page2Test() {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		//pg1 = new Page1();	
		Page1 pf1= PageFactory.initElements(driver, Page1.class);
		pf1.continueNextPage1();
		pg2 = new Page2();
	}
	
	@Test
	public void page2GetTitleTest() {
		String page2title = pg2.page2getTitle();
		System.out.println("The page2 title is "+page2title);
	}
	
	@Test
	public void page2headerButtonEnabledTest() {
		Page1 pf1= PageFactory.initElements(driver, Page1.class);
		try {
		boolean headerButtonEnabled= pf1.headerButtonEnabled();
		System.out.println("The headerButtonEnabled is "+headerButtonEnabled);
	}catch(Exception e) {
		System.out.println(e);
	}
	}
	
	@Test
	public void page2headerButtonDisplayedTest() {
		Page1 pf1= PageFactory.initElements(driver, Page1.class);
		try {
		boolean headerButtonDisplayed= pf1.headerButtonDisplayed();
		System.out.println("The headerButtonDisplayed is "+headerButtonDisplayed);
		} catch(Exception e) {
		System.out.println(e);	
		}
		
	}
	
	@Test
	public void page2continueNextPageTest() {
		Page2 pf2= PageFactory.initElements(driver, Page2.class);
	pf2.continueNextPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
