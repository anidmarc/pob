package com.pob1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pob1.qa.base.Base;

public class Page1 extends Base{

	@FindBy(id="headingBtn")
	public WebElement homebutton;
	
	@FindBy(xpath="//span[@class='img-title h-1 align-top']")
	public WebElement headername;
	
	@FindBy(xpath="//div[@class='col-sm-12 col-md-8 col-lg-4 horz-col mb-lg-0 mb-3 panel-left text-center initialImg custom-lp img01 on-top fade-in']//img[@class='img-fluid introimg']")
	public WebElement imagedetails;
	
	@FindBy(xpath="//button[@class='commonbtn landing_btn btn continueBtn enableBtn fade-in']")
	public WebElement continuebutton1;
	
//	public Page1() {
//		PageFactory.initElements(driver, this);
//	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public boolean headerButtonEnabled() {
		return headername.isEnabled();
	}
	
	public boolean headerButtonDisplayed() {
		return headername.isDisplayed();
	}
	
	public String homeTextisPresent() {
		return homebutton.getAttribute("title");
	}
	
	public String altTextoftheGraphic() {
		return imagedetails.getAttribute("alt");
	}
	
	public boolean continueButton1Displayed() {
		return continuebutton1.isDisplayed();
	}
	
	public boolean continueButton1Enabled() {
		return continuebutton1.isEnabled();
	}
	
	public void continueNextPage1() {
		 continuebutton1.click();
	}
}
