package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	public static final String MAKE_POST = "//a[contains(text(),'Make a post')]";
	public static final String POST_NAME = "//input[@placeholder='Naziv']";
	public static final String POST_LOCATION = "//input[@placeholder='Lokacija']";
	public static final String POST_PICTURE = "//label[@class='custom-file-upload']";
	public static final String POST_TYPE = "//select[@name='transport']";
	public static final String POST_TEXT = "//textarea[@placeholder='Opis']";
	static final String POST_BUTTON = "//input[@value='Post']";

	// select element make post
	public static void addPost(WebDriver wd) {
		wd.findElement(By.xpath(MAKE_POST)).click();
		;
	}

	// select element NAME
	public static WebElement addName(WebDriver wd) {
		WebElement postName = wd.findElement(By.xpath(POST_NAME));
		return postName;
	}

	// clicks on selected element
	public static void clickAddName(WebDriver wd) {
		addName(wd).click();
	}

	// set data on element
	public static void sendKeysAddName(WebDriver wd, String uName) {
		addName(wd).sendKeys(uName);
	}

	// select element LOCATION
	public static WebElement addLocation(WebDriver wd) {
		WebElement addLocation = wd.findElement(By.xpath(POST_LOCATION));
		return addLocation;
	}

	// clicks on selected element
	public static void clickLocation(WebDriver wd) {
		addLocation(wd).click();
	}

	// set data on element
	public static void sendKeysLocation(WebDriver wd, String uName) {
		addLocation(wd).sendKeys(uName);
	}

	// select element IMAGE UPLOAD
	public static WebElement addPicture(WebDriver wd) {
		WebElement addPicture = wd.findElement(By.id("image"));
		return addPicture;
	}

	// set data on element
	public static void sendKeysPicture(WebDriver wd, String uName) {
		addPicture(wd).sendKeys(uName);
	}

	// select element SELECT
	public static Select addTransport(WebDriver wd) {
		Select addTransport = new Select(wd.findElement(By.xpath(POST_TYPE)));
		return addTransport;
	}

	// set value
	public static void selectTransport(WebDriver wd) {
		addTransport(wd).selectByVisibleText("Bus");
	}

	// select element TEXT FIELD
	public static WebElement addText(WebDriver wd) {
		WebElement addText = wd.findElement(By.xpath(POST_TEXT));
		return addText;
	}

	// clicks on selected element
	public static void clickText(WebDriver wd) {
		addText(wd).click();
	}

	// set data on element
	public static void sendKeysText(WebDriver wd, String uName) {
		addText(wd).sendKeys(uName);
	}

	public static void setPost(WebDriver wd) {
		wd.findElement(By.xpath(POST_BUTTON)).click();
	}
}
