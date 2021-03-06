$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinHotel.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel Via Adactin Hotel Website",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "whether Login Functionality Is Working Properly",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;whether-login-functionality-is-working-properly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Has Opened The Adaction Hotel Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enters The Username In Respective Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters The Password In Respective Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Clicks On The Login Button And Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Has_Opened_The_Adaction_Hotel_Website()"
});
formatter.result({
  "duration": 3747195159,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Username_In_Respective_Field()"
});
formatter.result({
  "duration": 186602875,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Password_In_Respective_Field()"
});
formatter.result({
  "duration": 72972344,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_The_Login_Button_And_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 2518126186,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "user chooses hotel based on their preference",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;user-chooses-hotel-based-on-their-preference",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@hotel"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user selects location from the list of locations displayed",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user selects hotel from the list of hotels displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user selects the room type of their choice from the given options",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user selects number of rooms based on their requirement from the list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user gives the check-in date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gives the check-out date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user selects the adults per room from the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user selects the children per room from the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user clicks the search button to navigate to select hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_selects_location_from_the_list_of_locations_displayed()"
});
formatter.result({
  "duration": 135409969,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_hotel_from_the_list_of_hotels_displayed()"
});
formatter.result({
  "duration": 93564519,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_the_room_type_of_their_choice_from_the_given_options()"
});
formatter.result({
  "duration": 92134855,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_number_of_rooms_based_on_their_requirement_from_the_list()"
});
formatter.result({
  "duration": 106843552,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_gives_the_check_in_date()"
});
formatter.result({
  "duration": 61125088,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_gives_the_check_out_date()"
});
formatter.result({
  "duration": 51451308,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_the_adults_per_room_from_the_respective_field()"
});
formatter.result({
  "duration": 68990354,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_the_children_per_room_from_the_respective_field()"
});
formatter.result({
  "duration": 86371822,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_clicks_the_search_button_to_navigate_to_select_hotel_page()"
});
formatter.result({
  "duration": 661287616,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "user selects the hotel after knowing the price details",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;user-selects-the-hotel-after-knowing-the-price-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@confirmHotel"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user selects the radio button of the hotel they preferred",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user clicks continue button to navigate to book a hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_selects_the_radio_button_of_the_hotel_they_preferred()"
});
formatter.result({
  "duration": 75063106,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_clicks_continue_button_to_navigate_to_book_a_hotel_page()"
});
formatter.result({
  "duration": 600852304,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "user gives their personal details and makes the credit card payment",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;user-gives-their-personal-details-and-makes-the-credit-card-payment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@details"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user enters their first name in the respective field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user enters their last name in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enters their address for billing purpose in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user enters the 16 digit credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user selects the credit card type from the list displayed in respective field",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user selects the month and year from the list in the expiry date field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user enters the CVV number in the respective field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user clicks book now to navigate to booking confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_enters_their_first_name_in_the_respective_field()"
});
formatter.result({
  "duration": 75810238,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_their_last_name_in_the_respective_field()"
});
formatter.result({
  "duration": 53069643,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_their_address_for_billing_purpose_in_the_respective_field()"
});
formatter.result({
  "duration": 85131130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_enters_the_digit_credit_card_number(int)"
});
formatter.result({
  "duration": 67124787,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_the_credit_card_type_from_the_list_displayed_in_respective_field()"
});
formatter.result({
  "duration": 95966511,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_selects_the_month_and_year_from_the_list_in_the_expiry_date_field()"
});
formatter.result({
  "duration": 138679540,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enters_the_CVV_number_in_the_respective_field()"
});
formatter.result({
  "duration": 58165236,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_clicks_book_now_to_navigate_to_booking_confirmation_page()"
});
formatter.result({
  "duration": 47961068,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "user get to know all the booking details for their reference",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;user-get-to-know-all-the-booking-details-for-their-reference",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@bookingConfirm"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "order number gets generated",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "user clicks logout button once displayed details are perfect",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.order_number_gets_generated()"
});
formatter.result({
  "duration": 5824282316,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_clicks_logout_button_once_displayed_details_are_perfect()"
});
formatter.result({
  "duration": 363379223,
  "status": "passed"
});
});