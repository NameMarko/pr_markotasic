package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	public static final String FIRST_NAME = "//input[@name='firstname']";
	public static final String LAST_NAME = "//input[@name='lastname']";
	public static final String USER_NAME = "//form[@action='processregister.php']//input[@name='username']";
	public static final String EMAIL = "//input[@name='email']";
	public static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	public static final String REG_BUTTON = "//input[@value='Register']";

	// first name reg input
	public static WebElement firstName(WebDriver wd) {
		WebElement firstName = wd.findElement(By.xpath(FIRST_NAME));
		return firstName;
	}

	public static void clickFirstName(WebDriver wd) {
		firstName(wd).click();
	}

	public static void sendKeysFirstName(WebDriver wd, String i) {
		firstName(wd).sendKeys(i);
	}

	// last name reg input
	public static WebElement lastName(WebDriver wd) {
		WebElement firstName = wd.findElement(By.xpath(LAST_NAME));
		return firstName;
	}

	public static void clickLastName(WebDriver wd) {
		lastName(wd).click();
	}

	public static void sendKeysLastName(WebDriver wd, String i) {
		lastName(wd).sendKeys(i);
	}

	// user name reg input
	public static WebElement userName(WebDriver wd) {
		WebElement userName = wd.findElement(By.xpath(USER_NAME));
		return userName;
	}

	public static void clickuserName(WebDriver wd) {
		userName(wd).click();
	}

	public static void sendKeysUserName(WebDriver wd, String i) {
		userName(wd).sendKeys(i);
	}

	// email reg input
	public static WebElement email(WebDriver wd) {
		WebElement email = wd.findElement(By.xpath(EMAIL));
		return email;
	}

	public static void clickemail(WebDriver wd) {
		email(wd).click();
	}

	public static void sendKeysEmail(WebDriver wd, String i) {
		email(wd).sendKeys(i);
	}

	// password reg input
	public static WebElement password(WebDriver wd) {
		WebElement password = wd.findElement(By.xpath(PASSWORD));
		return password;
	}

	public static void clickPassword(WebDriver wd) {
		password(wd).click();
	}

	public static void sendKeysPassword(WebDriver wd, String i) {
		password(wd).sendKeys(i);
	}

	// Reg button
	public static void regButton(WebDriver wd) {
		wd.findElement(By.xpath(REG_BUTTON)).click();
	}

}
