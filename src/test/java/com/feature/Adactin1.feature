Feature: Checking the hotel booking functionality of an Adactin application
@SmokeTest
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<username>" In The Username Field
And user Enter The "<password>" In The Password Field
Then user Click The Login Button And It Navigates the To the Serch Hotel Page

Examples:
|username|password|
|Mownica|Mowni|
|Guru|12345|
|Yuvaraj|67890|
