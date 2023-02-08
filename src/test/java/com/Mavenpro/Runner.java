package com.Mavenpro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.projectmanager.Page_Object_Manager;

import com.program.BookPage;
import com.program.Login_Page;
import com.program.Search_Hotel;

public class Runner extends BaseClass {

	public static WebDriver driver = launchBrowser("Chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {

		launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		// object 1
		passInput(pom.getLogin_Page().getUser(), "GMownica");
		passInput(pom.getLogin_Page().getPassword(), "Mowni@21");
		clickOnElement(pom.getLogin_Page().getLogin());
		// object 2
		clickOnElement(pom.getSearchHotel().getLocation());
		selectbyValue(pom.getSearchHotel().getLocation(), "London");
		selectbyIndex(pom.getSearchHotel().getHotels(), 1);
		selectbyVisbileText(pom.getSearchHotel().getRt(), "Standard");
		selectbyVisbileText(pom.getSearchHotel().getRn(), "2 - Two");
		deleteInput(pom.getSearchHotel().getDatein());
		passInput(pom.getSearchHotel().getDatein(), "23/11/2022");
		deleteInput(pom.getSearchHotel().getDateout());
		passInput(pom.getSearchHotel().getDateout(), "25/11/2022");
		selectbyValue(pom.getSearchHotel().getAdr(), "2");
		selectbyValue(pom.getSearchHotel().getCdr(), "0");
		clickOnElement(pom.getSearchHotel().getSubmit());
		SelectPage sp = new SelectPage(driver);// object 3
		//BookPage bp = new BookPage(driver);// object 4
		passInput(pom.getBookPage().getFn(), "Mownica");
		passInput(pom.getBookPage().getLn(), "Gajendran");
		passInput(pom.getBookPage().getAd(), "2/788, MM Nagar, 5th Cross Street");
		passInput(pom.getBookPage().getCn(), "1234567887654321");
		selectbyVisbileText(pom.getBookPage().getCt(), "VISA");
		selectbyVisbileText(pom.getBookPage().getCexp(), "December");
		selectbyVisbileText(pom.getBookPage().getCexpyear(), "2022");
		passInput(pom.getBookPage().getCv(), "234");
		clickOnElement(pom.getBookPage().getBook());

		screenShot("C:\\Users\\HP\\eclipse-workspace\\Mavenpro\\Screen Shot\\booking01.png");

	}

}
