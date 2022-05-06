package com.adactin.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SDP.Page_Object_Manager;
import com.adactin.baseclass.Base;
import com.adactin.properties.Instance_Creation;
import com.adactin.runner.Runner_Class;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base {

	public static WebDriver driver = Runner_Class.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Has Opened The Adaction Hotel Website$")
	public void user_Has_Opened_The_Adaction_Hotel_Website() throws Throwable {

		String url = Instance_Creation.getInstance().getInstanceCR().getUrl();
		Base.getUrl(url);

	}

	@When("^user enters username and password then click login$")
	public void user_enters_username_and_password_then_click_login(DataTable table) throws Throwable {

//		List<Map<String, String>> asMap =  table.asMap(String.class, String.class);
//	    for (Map<String, String> asMap1  : asMap) {
//	    	
//	    	inputValue(pom.getHp().getEmail(),asMap1.get("Username"));
//	    	inputValue(pom.getHp().getPass(),asMap1.get("Password"));
//		}

		// @When("^user Enters The Password In Respective Field$")
		// public void user_Enters_The_Password_In_Respective_Field() throws Throwable {

		// inputValue(pom.getHp().getPass(),"Riyaan");
		// }

		List<Map<String, String>> userlist = table.asMaps(String.class, String.class);
		for (Map<String, String> map : userlist) {
			int flag = 0;
			if (flag == 0) {
				flag++;
				inputValue(pom.getHp().getEmail(), map.get("Username"));

				try {
					if (flag == 1) {

						inputValue(pom.getHp().getPass(), map.get("Password"));
						clickElement(pom.getHp().getSubmit());
						clickElement(driver.findElement(By.xpath("//a[text()='Logout']")));
						clickElement(driver.findElement(By.xpath("//a[text()='Click here to login again']")));
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

//	@Then("^user Clicks On The Login Button And Navigates To The Search Hotel Page$")
//	public void user_Clicks_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page() throws Throwable {
//
//		clickElement(pom.getHp().getSubmit());
//	}

	@When("^user selects location from the list of locations displayed$")
	public void user_selects_location_from_the_list_of_locations_displayed() throws Throwable {
		dropDown(pom.getSh().getPlace(), "byindex", "3");
	}

	@When("^user selects hotel from the list of hotels displayed$")
	public void user_selects_hotel_from_the_list_of_hotels_displayed() throws Throwable {

		dropDown(pom.getSh().getHotel(), "byindex", "2");
	}

	@When("^user selects the room type of their choice from the given options$")
	public void user_selects_the_room_type_of_their_choice_from_the_given_options() throws Throwable {

		dropDown(pom.getSh().getRoom(), "byindex", "2");
	}

	@When("^user selects number of rooms based on their requirement from the list$")
	public void user_selects_number_of_rooms_based_on_their_requirement_from_the_list() throws Throwable {

		dropDown(pom.getSh().getRoomNums(), "byindex", "3");
	}

	@When("^user gives the check-in date$")
	public void user_gives_the_check_in_date() throws Throwable {

		inputValue(pom.getSh().getCheckIn(), "04/05/2022");
	}

	@When("^user gives the check-out date$")
	public void user_gives_the_check_out_date() throws Throwable {

		inputValue(pom.getSh().getCheckOut(), "07/05/2022");
	}

	@When("^user selects the adults per room from the respective field$")
	public void user_selects_the_adults_per_room_from_the_respective_field() throws Throwable {

		dropDown(pom.getSh().getAdults(), "byindex", "1");
	}

	@When("^user selects the children per room from the respective field$")
	public void user_selects_the_children_per_room_from_the_respective_field() throws Throwable {

		dropDown(pom.getSh().getChildren(), "byindex", "1");
	}

	@Then("^user clicks the search button to navigate to select hotel page$")
	public void user_clicks_the_search_button_to_navigate_to_select_hotel_page() throws Throwable {

		clickElement(pom.getSh().getSearch());
	}

	@When("^user selects the radio button of the hotel they preferred$")
	public void user_selects_the_radio_button_of_the_hotel_they_preferred() throws Throwable {

		clickElement(pom.getCsh().getrButton());
	}

	@Then("^user clicks continue button to navigate to book a hotel page$")
	public void user_clicks_continue_button_to_navigate_to_book_a_hotel_page() throws Throwable {

		clickElement(pom.getCsh().getGoAhead());
	}

	@When("^user enters their first name in the respective field$")
	public void user_enters_their_first_name_in_the_respective_field() throws Throwable {

		inputValue(pom.getAap().getfName(), "Revan");
	}

	@When("^user enters their last name in the respective field$")
	public void user_enters_their_last_name_in_the_respective_field() throws Throwable {

		inputValue(pom.getAap().getlName(), "Shasti");
	}

	@When("^user enters their address for billing purpose in the respective field$")
	public void user_enters_their_address_for_billing_purpose_in_the_respective_field() throws Throwable {

		inputValue(pom.getAap().getVenue(), "No:10,Heaven Street,Hell Road,Galaxy-39");
	}

	@When("^user enters the (\\d+) digit credit card number$")
	public void user_enters_the_digit_credit_card_number(int arg1) throws Throwable {

		inputValue(pom.getAap().getNumber(), "6458236545219758");
	}

	@When("^user selects the credit card type from the list displayed in respective field$")
	public void user_selects_the_credit_card_type_from_the_list_displayed_in_respective_field() throws Throwable {

		dropDown(pom.getAap().getType(), "byindex", "2");
	}

	@When("^user selects the month and year from the list in the expiry date field$")
	public void user_selects_the_month_and_year_from_the_list_in_the_expiry_date_field() throws Throwable {

		dropDown(pom.getAap().getMonth(), "byvisibletext", "October");
		dropDown(pom.getAap().getYear(), "byvisibletext", "2022");
	}

	@When("^user enters the CVV number in the respective field$")
	public void user_enters_the_CVV_number_in_the_respective_field() throws Throwable {

		inputValue(pom.getAap().getCvv(), "6587");
	}

	@Then("^user clicks book now to navigate to booking confirmation page$")
	public void user_clicks_book_now_to_navigate_to_booking_confirmation_page() throws Throwable {

		clickElement(pom.getAap().getBook());
	}

	@Given("^order number gets generated$")
	public void order_number_gets_generated() throws Throwable {

		explicitWait(40, pom.getBc().getSignOff());
		printScreen("AHotel");
	}

	@Then("^user clicks logout button once displayed details are perfect$")
	public void user_clicks_logout_button_once_displayed_details_are_perfect() throws Throwable {

		clickElement(pom.getBc().getSignOff());
	}

}
