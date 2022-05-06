package com.adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement place;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement room;
	
	@FindBy(id="room_nos")
	private WebElement roomNums;
	
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement Adults;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public SearchHotel(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNums() {
		return roomNums;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return Adults;
	}

	public WebElement getChildren() {
		return children;
	}

}
