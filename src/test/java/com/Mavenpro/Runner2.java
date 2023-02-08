package com.Mavenpro;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.projectmanager.Page_Object_Manager;

import property.com.File_Reader_Manager;


public class Runner2 extends BaseClass {
	public static WebDriver driver = launchBrowser("Chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String url = File_Reader_Manager.getInstanceCR().getUrl();
		launchUrl(url);
		File_Reader_Manager.getInstanceFRM();
		String username = File_Reader_Manager.getInstanceCR().getusername();
		passInput(pom.getLogin_Page().getUser(),username);
		File_Reader_Manager.getInstanceFRM();
		String password = File_Reader_Manager.getInstanceCR().password();
		passInput(pom.getLogin_Page().getPassword(),password);
		clickOnElement(pom.getLogin_Page().getLogin());
		clickOnElement(pom.getSearchHotel().getLocation());
		File_Reader_Manager.getInstanceFRM();
		String location = File_Reader_Manager.getInstanceCR().location();
		selectbyValue(pom.getSearchHotel().getLocation(),location );

		File_Reader_Manager.getInstanceFRM();
		String Hotels = File_Reader_Manager.getInstanceCR().Hotels();
		selectbyIndex(pom.getSearchHotel().getHotels(),1);
		File_Reader_Manager.getInstanceFRM();
		String Rt = File_Reader_Manager.getInstanceCR().Rt();
		selectbyVisbileText(pom.getSearchHotel().getRt(),Rt);
		File_Reader_Manager.getInstanceFRM();
		String Rn = File_Reader_Manager.getInstanceCR().Rn();
		selectbyVisbileText(pom.getSearchHotel().getRn(), Rn);
		File_Reader_Manager.getInstanceFRM();
		String Datein = File_Reader_Manager.getInstanceCR().Datein();
		deleteInput(pom.getSearchHotel().getDatein());
		passInput(pom.getSearchHotel().getDatein(), Datein);
		File_Reader_Manager.getInstanceFRM();
		String Dateout = File_Reader_Manager.getInstanceCR().Dateout();
		deleteInput(pom.getSearchHotel().getDateout());
		passInput(pom.getSearchHotel().getDateout(),Dateout );

		File_Reader_Manager.getInstanceFRM();
		String Adr = File_Reader_Manager.getInstanceCR().Adr();
		selectbyValue(pom.getSearchHotel().getAdr(), Adr);

		File_Reader_Manager.getInstanceFRM();
		String Cdr = File_Reader_Manager.getInstanceCR().Cdr();
		selectbyValue(pom.getSearchHotel().getCdr(), Cdr);
		clickOnElement(pom.getSearchHotel().getSubmit());

		File_Reader_Manager.getInstanceFRM();
		String Fn = File_Reader_Manager.getInstanceCR().Fn();
		passInput(pom.getBookPage().getFn(),Fn );

		File_Reader_Manager.getInstanceFRM();
		String Ln = File_Reader_Manager.getInstanceCR().Ln();
		passInput(pom.getBookPage().getLn(), Ln);

		File_Reader_Manager.getInstanceFRM();
		String Ad = File_Reader_Manager.getInstanceCR().Ad();
		passInput(pom.getBookPage().getAd(), Ad);

		File_Reader_Manager.getInstanceFRM();
		String Cn = File_Reader_Manager.getInstanceCR().Cn();
		passInput(pom.getBookPage().getCn(), Cn);
		File_Reader_Manager.getInstanceFRM();
		String Ct = File_Reader_Manager.getInstanceCR().Ct();
		selectbyVisbileText(pom.getBookPage().getCt(), Ct);
		File_Reader_Manager.getInstanceFRM();
		String Cexp = File_Reader_Manager.getInstanceCR().Cexp();
		selectbyVisbileText(pom.getBookPage().getCexp(), Cexp);

		File_Reader_Manager.getInstanceFRM();
		String Cexpyear = File_Reader_Manager.getInstanceCR().Cexpyear();
		selectbyVisbileText(pom.getBookPage().getCexpyear(), Cexpyear);

		File_Reader_Manager.getInstanceFRM();
		String Cv = File_Reader_Manager.getInstanceCR().Cv();
		passInput(pom.getBookPage().getCv(), "Cv");	
		passInput(pom.getBookPage().getCv(), "234");

		
		clickOnElement(pom.getBookPage().getBook());
		
		

		
		
		
	}
	
	
	
	}


