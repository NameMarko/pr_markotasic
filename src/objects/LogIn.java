package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {

	public static final String LOG_USER_NAME = "//input[@placeholder='username']";
	public static final String LOG_PASSWORD = "//input[@placeholder='password']";
	public static final String LOG_IN = "//input[@value='Log in']";

	// select element user name from log in field on home page
	public static WebElement userName(WebDriver wd) {
		WebElement userName = wd.findElement(By.xpath(LOG_USER_NAME));
		return userName;
	}

	// clicks on selected element
	public static void clickUserName(WebDriver wd) {
		userName(wd).click();
	}

	// set data on element
	public static void sendKeysUserName(WebDriver wd, String uName) {
		userName(wd).sendKeys(uName);
	}

	// select element password from log in field on home page
	public static WebElement password(WebDriver wd) {
		WebElement password = wd.findElement(By.xpath(LOG_PASSWORD));
		return password;
	}

	// clicks on selected element
	public static void clickPassword(WebDriver wd) {
		password(wd).click();
	}

	// set data on element
	public static void sendKeysPassword(WebDriver wd, String uName) {
		password(wd).sendKeys(uName);
	}

	// clicks on log in button
	public static void logInButton(WebDriver wd) {
		wd.findElement(By.xpath(LOG_IN)).click();
		;
	}

	// clicks on log out button
	public static void logOutButton(WebDriver wd) {
		wd.findElement(By.xpath("//a[@id='logoutBtn']")).click();
	}

}
