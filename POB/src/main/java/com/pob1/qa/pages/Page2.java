package com.pob1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pob1.qa.base.Base;

public class Page2 extends Base{

	@FindBy(xpath="//button[@class='commonbtn landing_btn btn continueBtn fade-in enableBtn']")
	WebElement continuebutton2;
	
//	public Page2() {
//		PageFactory.initElements(driver, this);
//	}
	
	public String page2getTitle() {
		return driver.getTitle();
	}
	
	public boolean continueButtonDisplayed() {
		return continuebutton2.isDisplayed();
	}
	
	public boolean continueButtonEnabled() {
		return continuebutton2.isEnabled();
	}
	
	public Page3 continueNextPage() {
		 continuebutton2.click();
		 return new Page3();
	}
	
	
}
