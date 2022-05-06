Feature: Booking Hotel Via Adactin Hotel Website
@home
Scenario: whether Login Functionality Is Working Properly 
Given user Has Opened The Adaction Hotel Website
When user enters username and password then click login
|Username|Password|
|revanshasti|Riyaan|
|revan|revan@123|
|shasti|shasti@123|


Scenario: user chooses hotel based on their preference
When user selects location from the list of locations displayed
And user selects hotel from the list of hotels displayed
And user selects the room type of their choice from the given options
And user selects number of rooms based on their requirement from the list
And user gives the check-in date 
And user gives the check-out date
And user selects the adults per room from the respective field
And user selects the children per room from the respective field
Then user clicks the search button to navigate to select hotel page

Scenario: user selects the hotel after knowing the price details
When user selects the radio button of the hotel they preferred
Then user clicks continue button to navigate to book a hotel page

Scenario: user gives their personal details and makes the credit card payment 
 When user enters their first name in the respective field
 And user enters their last name in the respective field
 And user enters their address for billing purpose in the respective field
 And user enters the 16 digit credit card number
 And user selects the credit card type from the list displayed in respective field
 And user selects the month and year from the list in the expiry date field
 And user enters the CVV number in the respective field
 Then user clicks book now to navigate to booking confirmation page
 
 Scenario: user get to know all the booking details for their reference
 Given order number gets generated
 Then user clicks logout button once displayed details are perfect
