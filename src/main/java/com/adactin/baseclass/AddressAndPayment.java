package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAndPayment {
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fName;
	
	@FindBy(id="last_name")
	private WebElement lName;
	
	@FindBy(id="address")
	private WebElement venue;
	
	@FindBy(id="cc_num")
	private WebElement number;
	
	@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;

	public AddressAndPayment(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getVenue() {
		return venue;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

}
