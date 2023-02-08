package org.projectmanager;

import org.openqa.selenium.WebDriver;

import com.program.BookPage;
import com.program.Login_Page;
import com.program.Search_Hotel;
import com.program.SelectPage;

public class Page_Object_Manager {

	public WebDriver driver;//null
	
	private Login_Page lp;//null

	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}

	private Login_Page getlp;
		public Login_Page getLogin_Page() {
		
		if (lp==null) {
		lp = new Login_Page(driver);
		}
		
		return lp;
	}
	
	private Search_Hotel getsh;
	
	public Search_Hotel getSearchHotel() {
		if (getsh==null) {
			 getsh = new  Search_Hotel (driver);
		}
		
		return getsh;
		
		

	}

	private SelectPage getsp;
	
	public SelectPage getSelectPage() {
		
		if (getsp==null) {
			 getsp = new SelectPage(driver);
		}
		
		return getsp;

	}
    private BookPage getbp;
	
	public BookPage getBookPage() {
		
		if (getbp==null) {
			 getbp = new BookPage(driver);
		}
		
		return getbp;

	}
	
	
	
	
}

