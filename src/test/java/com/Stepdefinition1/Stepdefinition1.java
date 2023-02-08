package com.Stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Runner.runner123;

public class Stepdefinition1 {
	public static WebDriver driver = runner123.driver;
	
	@cucumber.api.java.en.Given("user Must Launch the Url")
	public void user_must_launch_the_url() {
	driver.get("http://adactinhotelapp.com/SearchHotel.php");
	}
	@cucumber.api.java.en.When("user Enter The Username In The Username Field")
	public void user_enter_the_username_in_the_username_field() {
		driver.findElement(By.id("username")).sendKeys("GMownica");
	}
	@cucumber.api.java.en.When("user Enter The Password In The Password Field")
	public void user_enter_the_password_in_the_password_field() {
		driver.findElement(By.id("password")).sendKeys("Mowni@21");
	}
	@cucumber.api.java.en.Then("user Click The Login Button And It Navigates To The Search Hotel Page")
	public void user_click_the_login_button_and_it_navigates_to_the_search_hotel_page() {
	driver.findElement(By.id("login")).click();
	}
	@cucumber.api.java.en.Given("user Must Select the Options")
	public void user_must_select_the_options() {
		
	}
	@cucumber.api.java.en.When("user Select Location In The Select Location Field")
	public void user_select_location_in_the_select_location_field() {
		WebElement location = driver.findElement(By.id("location"));
		location.click();
        Select s = new Select(location);
		s.selectByVisibleText("Melbourne");
		
	}
	@cucumber.api.java.en.When("user Select Hotels In The Select Hotels Field")
	public void user_select_hotels_in_the_select_hotels_field() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.click();
		Select s1 = new Select(hotels);
		s1.selectByVisibleText("Hotel Creek");
	}
	@cucumber.api.java.en.When("user Select Room Type In The Select Room Type Field")
	public void user_select_room_type_in_the_select_room_type_field() {
		WebElement room = driver.findElement(By.id("room_type"));
		room.click();
		Select s2 = new Select(room);
		s2.selectByVisibleText("Deluxe");
	}
	@cucumber.api.java.en.When("user Select Room Nos In The Select Room Nos Field")
	public void user_select_room_nos_in_the_select_room_nos_field() {
		WebElement roomno = driver.findElement(By.id("room_nos"));
		roomno.click();
		Select s3 = new Select(roomno);
		s3.selectByVisibleText("2 - Two");
	}
	@cucumber.api.java.en.When("user Enter The Datepick_In And Clear Datepick_In Field")
	public void user_enter_the_datepick_in_and_clear_datepick_in_field() {
		driver.findElement(By.id("datepick_in")).clear();
	}
	@cucumber.api.java.en.When("user Enter The Datepick_In In And Pass SendKeys Datepick_In Field")
	public void user_enter_the_datepick_in_in_and_pass_send_keys_datepick_in_field() {
		driver.findElement(By.id("datepick_in")).sendKeys("21/10/2022");
	}
	@cucumber.api.java.en.When("user Enter The Datepick_Out And Clear Datepick_Out Field")
	public void user_enter_the_datepick_out_and_clear_datepick_out_field() {
		driver.findElement(By.id("datepick_out")).clear();
	}
	@cucumber.api.java.en.When("user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field")
	public void user_enter_the_datepick_out_and_pass_send_keys_datepick_out_field() {
		driver.findElement(By.id("datepick_out")).sendKeys("25/10/2022");
	}
	@cucumber.api.java.en.When("user Enter The Adult_Room In The Adult_Room Field")
	public void user_enter_the_adult_room_in_the_adult_room_field() {
		WebElement ad = driver.findElement(By.id("adult_room"));
        Select s4 = new Select(ad);
		s4.selectByVisibleText("2 - Two");
	}
	@cucumber.api.java.en.When("user Enter The Child_Room In The Child_Room Field")
	public void user_enter_the_child_room_in_the_child_room_field() {
		WebElement cd = driver.findElement(By.id("child_room"));
        Select s5 = new Select(cd);
		s5.selectByVisibleText("2 - Two");
	}
	@cucumber.api.java.en.Then("user Click The Submit Button")
	public void user_click_the_submit_button() {
		driver.findElement(By.id("Submit")).click();
	}
	@cucumber.api.java.en.Then("user Click The Radio Button")
	public void user_click_the_radio_button() {
		driver.findElement(By.id("radiobutton_0")).click();
	}
	@cucumber.api.java.en.Then("user Click The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
		driver.findElement(By.id("continue")).click();

	}
	@cucumber.api.java.en.Given("Enter the Options")
	public void enter_the_options() {
	}
	@cucumber.api.java.en.When("user Enter The Fname In The Fname Field")
	public void user_enter_the_fname_in_the_fname_field() {
		driver.findElement(By.id("first_name")).sendKeys("Mownica");
	}
	@cucumber.api.java.en.When("user Enter The Lname In The Lname Field")
	public void user_enter_the_lname_in_the_lname_field() {
		driver.findElement(By.id("last_name")).sendKeys("Gajendran");

	}
	@cucumber.api.java.en.When("user Enter The Address In The Address Field")
	public void user_enter_the_address_in_the_address_field() {
		driver.findElement(By.id("address")).sendKeys("2/788,M.M nagar, 5th cross");

	}
	@cucumber.api.java.en.When("user Enter The Ccno In The Ccno Field")
	public void user_enter_the_ccno_in_the_ccno_field() {
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");

	}
	@cucumber.api.java.en.When("user Select The Cct In The Cct Field")
	public void user_select_the_cct_in_the_cct_field() {
		driver.findElement(By.id("cc_type")).sendKeys("Others");

	}
	@cucumber.api.java.en.When("user Select The Exm In The Exm Field")
	public void user_select_the_exm_in_the_exm_field() {
		WebElement em = driver.findElement(By.id("cc_exp_month"));
		Select s6 = new Select(em);
		s6.selectByVisibleText("March");
	}
	@cucumber.api.java.en.When("user Select The Exy In The Exy Field")
	public void user_select_the_exy_in_the_exy_field() {
		WebElement exm = driver.findElement(By.id("cc_exp_year"));
		Select s7 = new Select(exm);
		s7.selectByVisibleText("2022");
	}
	@cucumber.api.java.en.When("user Enter The Cvv In The Cvv Field")
	public void user_enter_the_cvv_in_the_cvv_field() {
        driver.findElement(By.id("cc_cvv")).sendKeys("1528");
}
	@cucumber.api.java.en.Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		driver.findElement(By.id("book_now")).click();

	}
	
	@cucumber.api.java.en.Given("user Must Click The Logout Button")
	public void user_must_click_the_logout_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	}







	
}