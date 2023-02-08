package com.stepdefinition;

import java.io.IOException;

import org.projectmanager.Page_Object_Manager;

import com.Mavenpro.BaseClass;

import property.com.File_Reader_Manager;

public class StepDefinition extends BaseClass {
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	@cucumber.api.java.en.Given("^user Must Launch the Url$")
	public void user_Must_Launch_the_Url() throws Throwable {
		File_Reader_Manager.getInstanceFRM();
		String url = File_Reader_Manager.getInstanceCR().getUrl();
		launchUrl(url);
	}

	@cucumber.api.java.en.When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
		File_Reader_Manager.getInstanceFRM();
		String username = File_Reader_Manager.getInstanceCR().getusername();
		passInput(pom.getLogin_Page().getUser(),username);
	}

	@cucumber.api.java.en.When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		File_Reader_Manager.getInstanceFRM();
		String password = File_Reader_Manager.getInstanceCR().password();
		passInput(pom.getLogin_Page().getPassword(),password);
		
	}

	@cucumber.api.java.en.Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(pom.getLogin_Page().getLogin());
	}
	@cucumber.api.java.en.Given("user Must Select the Options")
	public void user_must_select_the_options() throws IOException {

		File_Reader_Manager.getInstanceFRM();
		String Hotels = File_Reader_Manager.getInstanceCR().Hotels();
		selectbyIndex(pom.getSearchHotel().getHotels(),1);
	}

	@cucumber.api.java.en.When("user Select Location In The Select Location Field")
	public  void user_select_location_in_the_select_location_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String location = File_Reader_Manager.getInstanceCR().location();
		selectbyValue(pom.getSearchHotel().getLocation(),location );

	   
	}
	@cucumber.api.java.en.When("user Select Hotels In The Select Hotels Field")
	public void user_select_hotels_in_the_select_hotels_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Hotels = File_Reader_Manager.getInstanceCR().Hotels();
		selectbyIndex(pom.getSearchHotel().getHotels(),1);
	}

	@cucumber.api.java.en.When("user Select Room Type In The Select Room Type Field")
	public void user_select_room_type_in_the_select_room_type_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Rt = File_Reader_Manager.getInstanceCR().Rt();
		selectbyVisbileText(pom.getSearchHotel().getRt(),Rt);
	}

	@cucumber.api.java.en.When("user Select Room Nos In The Select Room Nos Field")
	public void user_select_room_nos_in_the_select_room_nos_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Rn = File_Reader_Manager.getInstanceCR().Rn();
		selectbyVisbileText(pom.getSearchHotel().getRn(), Rn);
	}
	@cucumber.api.java.en.When("user Enter The Datepick_In And Clear Datepick_In Field")
	public void user_enter_the_datepick_in_and_clear_datepick_in_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Datein = File_Reader_Manager.getInstanceCR().Datein();
		deleteInput(pom.getSearchHotel().getDatein());
		passInput(pom.getSearchHotel().getDatein(), Datein);
	}
	@cucumber.api.java.en.When("user Enter The Datepick_In In And Pass SendKeys Datepick_In Field")
	public void user_enter_the_datepick_in_in_and_pass_send_keys_datepick_in_field() {
		
	}
	@cucumber.api.java.en.When("user Enter The Datepick_Out And Clear Datepick_Out Field")
	public void user_enter_the_datepick_out_and_clear_datepick_out_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Dateout = File_Reader_Manager.getInstanceCR().Dateout();
		deleteInput(pom.getSearchHotel().getDateout());
		passInput(pom.getSearchHotel().getDateout(),Dateout );

	}
	@cucumber.api.java.en.When("user Enter The Datepick_Out And Pass SendKeys Datepick_Out Field")
	public void user_enter_the_datepick_out_and_pass_send_keys_datepick_out_field() {
	}
	@cucumber.api.java.en.When("user Enter The Adult_Room In The Adult_Room Field")
	public void user_enter_the_adult_room_in_the_adult_room_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Adr = File_Reader_Manager.getInstanceCR().Adr();
		selectbyValue(pom.getSearchHotel().getAdr(), Adr);
	}
	@cucumber.api.java.en.When("user Enter The Child_Room In The Child_Room Field")
	public void user_enter_the_child_room_in_the_child_room_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Cdr = File_Reader_Manager.getInstanceCR().Cdr();
		selectbyValue(pom.getSearchHotel().getCdr(), Cdr);
	}
	@cucumber.api.java.en.Then("user Click The Submit Button")
	public void user_click_the_submit_button() {
		clickOnElement(pom.getSearchHotel().getSubmit());
	}
	@cucumber.api.java.en.Then("user Click The Radio Button")
	public void user_click_the_radio_button() {
	}
	@cucumber.api.java.en.Then("user Click The Continue Button And It Navigates To The Book Hotel Page")
	public void user_click_the_continue_button_and_it_navigates_to_the_book_hotel_page() {
	}
	@cucumber.api.java.en.Given("Enter the Options")
	public void enter_the_options() {
	}

	@cucumber.api.java.en.When("user Enter The Fname In The Fname Field")
	public void user_enter_the_fname_in_the_fname_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Fn = File_Reader_Manager.getInstanceCR().Fn();
		passInput(pom.getBookPage().getFn(),Fn );

	}

	@cucumber.api.java.en.When("user Enter The Lname In The Lname Field")
	public void user_enter_the_lname_in_the_lname_field() throws IOException {

		File_Reader_Manager.getInstanceFRM();
		String Ln = File_Reader_Manager.getInstanceCR().Ln();
		passInput(pom.getBookPage().getLn(), Ln);
	}

	@cucumber.api.java.en.When("user Enter The Address In The Address Field")
	public void user_enter_the_address_in_the_address_field() throws IOException {

		File_Reader_Manager.getInstanceFRM();
		String Ad = File_Reader_Manager.getInstanceCR().Ad();
		passInput(pom.getBookPage().getAd(), Ad);
	}

	@cucumber.api.java.en.When("user Enter The Ccno In The Ccno Field")
	public void user_enter_the_ccno_in_the_ccno_field() throws IOException {

		File_Reader_Manager.getInstanceFRM();
		String Cn = File_Reader_Manager.getInstanceCR().Cn();
		passInput(pom.getBookPage().getCn(), Cn);
	}

	@cucumber.api.java.en.When("user Select The Cct In The Cct Field")
	public void user_select_the_cct_in_the_cct_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Ct = File_Reader_Manager.getInstanceCR().Ct();
		selectbyVisbileText(pom.getBookPage().getCt(), Ct);
	}

	@cucumber.api.java.en.When("user Select The Exm In The Exm Field")
	public void user_select_the_exm_in_the_exm_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Cexp = File_Reader_Manager.getInstanceCR().Cexp();
		selectbyVisbileText(pom.getBookPage().getCexp(), Cexp);
	}

	@cucumber.api.java.en.When("user Select The Exy In The Exy Field")
	public void user_select_the_exy_in_the_exy_field() throws IOException {
		File_Reader_Manager.getInstanceFRM();
		String Cexpyear = File_Reader_Manager.getInstanceCR().Cexpyear();
		selectbyVisbileText(pom.getBookPage().getCexpyear(), Cexpyear);
	}

	@cucumber.api.java.en.When("user Enter The Cvv In The Cvv Field")
	public void user_enter_the_cvv_in_the_cvv_field() throws IOException {

		File_Reader_Manager.getInstanceFRM();
		String Cv = File_Reader_Manager.getInstanceCR().Cv();
		passInput(pom.getBookPage().getCv(), "Cv");	
		passInput(pom.getBookPage().getCv(), "234");

	}

	@cucumber.api.java.en.Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() {
		clickOnElement(pom.getBookPage().getBook());

	}

}
