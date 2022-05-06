package com.SDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.baseclass.AddressAndPayment;
import com.adactin.baseclass.BookingConfirmation;
import com.adactin.baseclass.ConfirmSearchHotel;
import com.adactin.baseclass.Home_Page;
import com.adactin.baseclass.SearchHotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	

	private Home_Page hp;
	private SearchHotel sh;
	private ConfirmSearchHotel csh;
	private AddressAndPayment aap;
	private BookingConfirmation bc;
	
	
	public SearchHotel getSh() {
		sh=new SearchHotel(driver);
		return sh;
	}


	public Home_Page getHp() {
		hp=new Home_Page(driver);
		return hp;
	}
	
	public ConfirmSearchHotel getCsh() {
		csh=new ConfirmSearchHotel(driver);
		return csh;
	}
	
	public AddressAndPayment getAap() {
		
		aap=new AddressAndPayment(driver);
		return aap;
	}
	
	public BookingConfirmation getBc() {
		
		bc=new BookingConfirmation(driver);
		return bc;
	}
	
	

	
	

}
