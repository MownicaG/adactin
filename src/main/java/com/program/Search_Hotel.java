package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement rt;
	@FindBy(id ="room_nos")
	private WebElement rn;
	@FindBy(id = "datepick_in")
	private WebElement datein;
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	@FindBy(id = "adult_room")
	private WebElement adr;
	@FindBy(id = "child_room")
	private WebElement cdr;
	@FindBy(id = "Submit")
	private WebElement Submit;

public Search_Hotel(WebDriver driver2) {
this.driver= driver2;
PageFactory.initElements(driver2, this);
}
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRt() {
	return rt;
}
public WebElement getRn() {
	return rn;
}
public WebElement getDatein() {
	return datein;
}
public WebElement getDateout() {
	return dateout;
}
public WebElement getAdr() {
	return adr;
}
public WebElement getCdr() {
	return cdr;
}
public WebElement getSubmit() {
	return Submit;
}
}