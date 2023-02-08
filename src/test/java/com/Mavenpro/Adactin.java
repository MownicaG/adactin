package com.Mavenpro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser("Chrome");
		launchUrl("http://adactinhotelapp.com/SearchHotel.php");
		WebElement user = driver.findElement(By.id("username"));
		passInput(user, "GMownica");
		WebElement password = driver.findElement(By.id("password"));
		passInput(password, "Mowni@21");
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);
		WebElement location = driver.findElement(By.id("location"));
		selectbyValue(location, "Melbourne");
		WebElement hotels = driver.findElement(By.id("hotels"));
		selectbyVisbileText(hotels, "Hotel Creek");
		WebElement room = driver.findElement(By.id("room_type"));
		selectbyVisbileText(room, "Double");
		WebElement roomno = driver.findElement(By.id("room_nos"));
		selectbyVisbileText(roomno, "2 - Two");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("21/10/2022");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("25/10/2022");

		WebElement ad = driver.findElement(By.id("adult_room"));
		selectbyVisbileText(ad, "2 - Two");

		WebElement cd = driver.findElement(By.id("child_room"));
		selectbyVisbileText(cd, "2 - Two");

		WebElement submit = driver.findElement(By.id("Submit"));
		clickOnElement(submit);

		WebElement button = driver.findElement(By.id("radiobutton_0"));
		clickOnElement(button);

		WebElement resume = driver.findElement(By.id("continue"));
		clickOnElement(resume);

		driver.findElement(By.id("first_name")).sendKeys("Mownica");

		driver.findElement(By.id("last_name")).sendKeys("Gajendran");

		WebElement ad1 = driver.findElement(By.id("address"));
		passInput(ad1,"2/788,M.M nagar, 5th cross");
		WebElement ad2 = driver.findElement(By.id("cc_num"));
		passInput(ad2,"1234567890123456");
		WebElement ad3 = driver.findElement(By.id("cc_type"));
		passInput(ad3,"Others");
		WebElement em = driver.findElement(By.id("cc_exp_month"));
		selectbyVisbileText(em, "March");
		WebElement exm = driver.findElement(By.id("cc_exp_year"));
		selectbyVisbileText(exm, "2022");
		WebElement ad4 = driver.findElement(By.id("cc_cvv"));
		passInput(ad4,"1528");
		WebElement ad5 = driver.findElement(By.id("book_now"));
		clickOnElement(ad5);
		Thread.sleep(5000);
		screenShot("C:\\Users\\HP\\eclipse-workspace\\Mavenpro\\Screen Shot\\booking.png");

	}
}
