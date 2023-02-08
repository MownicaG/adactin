package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public WebDriver driver;
	
	public BookPage(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAd() {
		return ad;
	}
	public WebElement getCn() {
		return cn;
	}
	public WebElement getCt() {
		return ct;
	}
	public WebElement getCexp() {
		return cexp;
	}
	public WebElement getCexpyear() {
		return cexpyear;
	}
	public WebElement getCv() {
		return cv;
	}
	public WebElement getBook() {
		return book;
	}
	@FindBy(id = "first_name")
	private WebElement fn;
	@FindBy(id = "last_name")
	private WebElement ln;
	@FindBy(id = "address")
	private WebElement ad;
	@FindBy(id = "cc_num")
	private WebElement cn;
	@FindBy(id = "cc_type")
	private WebElement ct;
	@FindBy(id = "cc_exp_month")
	private WebElement cexp;
	@FindBy(id = "cc_exp_year")
	private WebElement cexpyear;
	@FindBy(id = "cc_cvv")
	private WebElement cv;
	@FindBy(id = "book_now")
	private WebElement book;
}


