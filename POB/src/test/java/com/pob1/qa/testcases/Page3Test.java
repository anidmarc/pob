package com.pob1.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pob1.qa.base.Base;
import com.pob1.qa.pages.Page1;
import com.pob1.qa.pages.Page2;

public class Page3Test extends Base{
	
	Page2 pg3= null;
	public Page3Test() {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		//pg1 = new Page1();	
		Page1 pf1= PageFactory.initElements(driver, Page1.class);
		Page2 pf2= PageFactory.initElements(driver, Page2.class);
		pf1.continueNextPage1();
		pf2.continueNextPage();
		pg3 = new Page2();
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
