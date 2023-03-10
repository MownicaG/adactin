Feature: Checking the hotel booking functionality of an Adactin application
Scenario: Login Functionality
Given user Must Launch the Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page 
Scenario: Search Hotel Functionality
Given user Must Select the Options
When user Select Location In The Select Location Field
When user Select Hotels In The Select Hotels Field
When user Select Room Type In The Select Room Type Field
When user Select Room Nos In The Select Room Nos Field
When user Enter The Datepick_In And Clear Datepick_In Field
And user Enter The Datepick_In In And Pass SendKeys Datepick_In Field
When user Enter The Datepick_Out And Clear Datepick_Out Field
And user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field
When user Enter The Adult_Room In The Adult_Room Field
And user Enter The Child_Room In The Child_Room Field
Then user Click The Submit Button 
Scenario: Select Page Functionality
Then user Click The Radio Button  
Then user Click The Continue Button And It Navigates To The Book Hotel Page
Scenario: Book Page Functionality
Given Enter the Options
When user Enter The Fname In The Fname Field
When user Enter The Lname In The Lname Field
When user Enter The Address In The Address Field
When user Enter The Ccno In The Ccno Field
When user Select The Cct In The Cct Field
And user Select The Exm In The Exm Field
And user Select The Exy In The Exy Field
When user Enter The Cvv In The Cvv Field
Then user Click The Book Now Button  
Scenario: Logout Functionality
Given user Must Click The Logout Button





