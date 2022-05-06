package com.adactin.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.SDP.Page_Object_Manager;
import com.adactin.baseclass.Base;

public class Adactin_Project extends Base {

	public static WebDriver driver = Base.getBrowser("chrome");

	Page_Object_Manager manage = new Page_Object_Manager(driver);

	@Test(priority = 1)
	private void launchSite() {

		getUrl("http://adactinhotelapp.com/index.php");

		inputValue(manage.getHp().getEmail(), "revanshasti");
		inputValue(manage.getHp().getPass(), "Riyaan");
		clickElement(manage.getHp().getSubmit());
	}

	@Test(priority = 2)
	private void hotelSearch() {

		dropDown(manage.getSh().getPlace(), "byindex", "3");
		dropDown(manage.getSh().getHotel(), "byindex", "2");
		dropDown(manage.getSh().getRoom(), "byindex", "2");
		dropDown(manage.getSh().getRoomNums(), "byvalue", "5");
		inputValue(manage.getSh().getCheckIn(), "01/05/2022");
		inputValue(manage.getSh().getCheckOut(), "02/05/2022");
		dropDown(manage.getSh().getAdults(), "byindex", "1");
		dropDown(manage.getSh().getChildren(), "byindex", "1");
		clickElement(manage.getSh().getSearch());
	}

	@Test(priority = 3)
	private void confirmHotel() {

		rButton(manage.getCsh().getrButton());
		clickElement(manage.getCsh().getGoAhead());
	}

	@Test(priority = 4)
	private void confirmPayment() {

		inputValue(manage.getAap().getfName(), "Revan");
		inputValue(manage.getAap().getlName(), "Shasti");
		inputValue(manage.getAap().getVenue(), "No:10,Chennai-49");
		inputValue(manage.getAap().getNumber(), "3214 4567 6549 7894");
		dropDown(manage.getAap().getType(), "byindex", "2");
		dropDown(manage.getAap().getMonth(), "byindex", "11");
		dropDown(manage.getAap().getYear(), "byvisibletext", "2022");
		inputValue(manage.getAap().getCvv(), "6789");
		clickElement(manage.getAap().getBook());
		implicitWait(20);

	}

	@Test(priority = 5)
	private void logOff() throws Throwable {

		explicitWait(30, manage.getBc().getSignOff());
		printScreen("hotel");
		clickElement(manage.getBc().getSignOff());
	}

}
