package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSearchHotel {

	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement rButton;
	
	@FindBy(id="continue")
	private WebElement goAhead;

	public ConfirmSearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getrButton() {
		return rButton;
	}

	public WebElement getGoAhead() {
		return goAhead;
	}

	
}
