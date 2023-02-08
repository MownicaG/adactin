package step_Definition;

import java.io.IOException;

import org.projectmanager.Page_Object_Manager;

import com.Mavenpro.BaseClass;

import property.com.File_Reader_Manager;

public class Step_Definition extends BaseClass {

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@cucumber.api.java.en.Given("user Must Launch The Url")
	public void user_must_launch_the_url() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
	}
	
	@cucumber.api.java.en.When("user Enter The {string} In The Username Field")
	public void user_enter_the_in_the_username_field(String username) throws Throwable {
		File_Reader_Manager.getInstanceFRM().getInstanceCR().getusername();
		passInput(pom.getLogin_Page().getUser(),username);
	}
	
	@cucumber.api.java.en.When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String password) throws Throwable {
		File_Reader_Manager.getInstanceFRM().getInstanceCR().password();
		passInput(pom.getLogin_Page().getPassword(),password);
	}
	
	@cucumber.api.java.en.Then("user Click The Login Button And It Navigates the To the Serch Hotel Page")
	public void user_click_the_login_button_and_it_navigates_the_to_the_serch_hotel_page() {
		clickOnElement(pom.getLogin_Page().getLogin());
	}
	

}
