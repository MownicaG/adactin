package com.Mavenpro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("chrome"))
			;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// if (browsername.equalsIgnoreCase("firefox")) {
		// System.setProperty("webdriver.gecko.driver",
		// System.getProperty("user.dir")+"\\Driver\\chromedriverNew.exe");
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
//}
		return driver;
	}


	
//launch browser	
	public static void launchUrl(String url) {
		driver.get(url);

	}

//close
	public static void closeBrowser() {
		driver.close();
	}

//quit
	public static void terminateBrowser() {
		driver.quit();
	}

//navigate-forward
	public static void forwardPage() {
		driver.navigate().forward();
	}

//sendkeys
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}

//click
	public static void clickOnElement(WebElement element) {
		element.click();

	}

//clear
	public static void deleteInput(WebElement element) {
		element.clear();
	}

//selectbyValue
	public static void selectbyValue(WebElement element, String val) {
		Select s = new Select(element);
		s.selectByValue(val);
	}

	// selectbyIndex
	public static void selectbyIndex(WebElement element, int ind) {
		Select s = new Select(element);
		s.selectByIndex(ind);
	}

	// selectbyVisbileText
	public static void selectbyVisbileText(WebElement element, String tex) {
		Select s = new Select(element);
		s.selectByVisibleText(tex);

	}

	// screenshot
	public static void screenShot(String location) throws IOException {

		TakesScreenshot photo = (TakesScreenshot) driver;
		File source = photo.getScreenshotAs(OutputType.FILE);
		File path = new File(location);
		FileUtils.copyFile(source, path);

	}

	// scroll down and up
	public static void scroll(String sd, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(sd, element);

	}

	// Alert accept
	public static void accept(WebElement element) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	// Alert dismiss
	public static void dismiss(WebElement element) {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	// Alert input
	public static void input(WebElement element, String input) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(input);
	}

	// getAlerttext
	public static void getAlerttext() {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	}

	// navigate-to
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	// navigate-back
	public static void backPage() {
		driver.navigate().back();
	}

	// navigate-Refresh
	public static void refresh(WebElement element) {
		driver.navigate().refresh();
	}

	// RadioButton
	public static void RadioButton(WebElement element) {
		element.click();
	}

	// get current url
	public static void getcurrenturl(String url) {
		System.out.println(driver.getCurrentUrl());

	}

	// get title
	public static void gettitle() {
		System.out.println(driver.getTitle());

	}

	// get text
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	// Actions drag and drop
	public static void dragAnddrop(WebElement element, WebElement element1) {
		Actions as = new Actions(driver);
		as.dragAndDrop(element, element).click().build().perform();
	}

	// Actions click
	public static void actionclick(WebElement element) {
		Actions as = new Actions(driver);
		as.click(element).perform();
	}

	// Actions move to element
	public static void movetoelement(WebElement element) {
		Actions as = new Actions(driver);
		as.moveToElement(element).perform();
	}

	// Actions context click
	public static void contextclick(WebElement element) {
		Actions as = new Actions(driver);
		as.contextClick(element).perform();
	}

	// Actions Double click
	public static void doubleclick(WebElement element) {
		Actions as = new Actions(driver);
		as.doubleClick(element).perform();
	}

	// robots down key press&release
	public static void downkey() throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
	}

	// robots up key press&release
	public static void Upkey() throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_UP);
		rt.keyRelease(KeyEvent.VK_UP);
	}

	// robots up key press&release
	public static void enterkey() throws AWTException {
		Robot rt = new Robot();
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
	}
	// get window handles

	public static void windowhandles() {
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
	}
	// get window handle

	public static void windowhandle() {
		String id = driver.getWindowHandle();
		System.out.println(id);
	}

	// enable
	public static void isenable(WebElement element) {
		element.isEnabled();
		System.out.println(element);
	}

	// Displayed
	public static void isdisplayed(WebElement element) {
		element.isDisplayed();
		System.out.println(element);
	}

	// Selected
	public static void isselected(WebElement element) {
		element.isSelected();
		System.out.println(element);
	}

	// deselectbyValue
	public static void deselectbyValue(WebElement element, String ind) {
		Select s = new Select(element);
		s.deselectByValue(ind);
	}

	// deselectbyIndex
	public static void deselectbyIndex(WebElement element, int input) {
		Select s = new Select(element);
		s.deselectByIndex(input);
	}
	//41 get options
		public static void getoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement set : options) {
				System.out.println(set.getText());
			}
		}

	//42 get first selected option
		public static void getfirstselectedoptions(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}

	//43 get all selected option
		public static void getallslectedoptions(WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selectedOptions : allSelectedOptions) {
				System.out.println(selectedOptions.getText());
			}
		}

	//44 implicit wait
		public static void implicitwait(int sec) {
			driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		}

	//45 web-table AllDatas

		public static void webtableAllDatas(List<WebElement> elements) {
			List<WebElement> datas = elements;
			for (WebElement allDatas : datas) {
				System.out.println(allDatas.getText());
			}
		}
	//46 web-table rowDatas

		public static void webtableRowDatas(List<WebElement> elements) {
			List<WebElement> rDatas = elements;
			for (WebElement rowDatas : rDatas) {
				System.out.println(rowDatas.getText());
			}
		}
	//47 web-table columnDatas
		public static void webtableCoulmnDatas(List<WebElement> elements) {
			List<WebElement> cDatas = elements;
			for (WebElement columnDatas : cDatas) {
				System.out.println(columnDatas.getText());
			}
		}
	//48  web-table singleDatas
	public static void wetableSingleData(WebElement element) {
	System.out.println(element.getText());
	}
	//49 frame id
	public static void frameId(String id) {
	driver.switchTo().frame(id);	
	}
	//50 frame index
	public static void frameIndex(int index) {
	driver.switchTo().frame(index);
	}
	// 51 frame webelemet
	public static void frameWebelemet(WebElement element) {
	driver.switchTo().frame(element);
	}
	//52 frame exit
	public static void frameExit() {
	driver.switchTo().defaultContent();
	}
	//53 outer frame
	public static void outerFrame() {
	driver.switchTo().parentFrame();
	}
	}

	
