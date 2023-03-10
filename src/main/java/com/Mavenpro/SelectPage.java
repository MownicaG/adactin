package com.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	public WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id = "continue")
	private WebElement cont;
	
	
	public SelectPage(WebDriver driver2) {
     
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getCont() {
		return cont;
	}
	

}
