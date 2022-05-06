package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation {
	
	public WebDriver driver;
	@FindBy(xpath="(//td[@align='right'])[15]")
	private WebElement scroll;
	
	@FindBy(id="logout")
	private WebElement signOff;

	public BookingConfirmation(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getSignOff() {
		return signOff;
	}

}
