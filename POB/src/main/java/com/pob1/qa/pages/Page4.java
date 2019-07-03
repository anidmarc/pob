package com.pob1.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pob1.qa.base.Base;

public class Page4 extends Base {

	@FindBy(xpath="//button[@class='commonbtn btnclick learnmore_button btn-primary']")
	public WebElement Environmental_Button;
	
    public String page4getTitle() {
		return driver.getTitle();
	}
    
    public boolean EnvironmentalButtonDisplayed() {
		return Environmental_Button.isDisplayed();
	}
	
	public boolean EnvironmentalButtonEnabled() {
		return Environmental_Button.isEnabled();
	}
	
	public void EnvironmentalButtonNextPage() {
		Environmental_Button.click();
	}
	
	
}
