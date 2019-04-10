package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PostEdit {

	public static final String EDIT_TITLE = "//input[@id='title']";
	public static final String EDIT_LOCATION = "//input[@id='location']";
	public static final String EDIT_PIC = "custom-file-upload";
	public static final String EDIT_TRANSPORT = "//select[@id='transport']";
	public static final String EDIT_TEXT = "//textarea[@id='description']";
	public static final String POST_BUTTON = "//div[@class='popupEdit']//input[@value='Post']";

	public static void postEdit(WebDriver wd) {
		List<WebElement> lee = wd.findElements(By.xpath("//i[@class='fas fa-ellipsis-v']"));
		List<WebElement> le = wd.findElements(By.xpath("//i[@class='fas fa-edit']"));
		lee.get(0).click();
		le.get(0).click();
	}

	// TITLE
	public static WebElement getTitle(WebDriver wd) {
		WebElement getTitle = wd.findElement(By.xpath(EDIT_TITLE));
		return getTitle;
	}

	public static void clickTitle(WebDriver wd) {
		getTitle(wd).click();
		getTitle(wd).clear();
	}

	public static void setTitle(WebDriver wd, String title) {
		getTitle(wd).sendKeys(title);
	}

	// LOCATION
	public static WebElement getLocation(WebDriver wd) {
		WebElement getLocation = wd.findElement(By.xpath(EDIT_LOCATION));
		return getLocation;
	}

	public static void clickLocation(WebDriver wd) {
		getLocation(wd).click();
		getLocation(wd).clear();
	}

	public static void setLocation(WebDriver wd, String location) {
		getLocation(wd).sendKeys(location);
	}

	// PICTURE
	public static void setPicture(WebDriver wd) {
		wd.findElement(By.className(EDIT_PIC)).sendKeys("C:\\Users\\User\\Desktop\\leopard.jpg");
	}

	// SELECT TRANSPORT
	public static Select getTransport(WebDriver wd) {
		Select getTransport = new Select(wd.findElement(By.xpath(EDIT_TRANSPORT)));
		return getTransport;
	}

	public static void setTransport(WebDriver wd, int tIndex) {
		getTransport(wd).selectByIndex(tIndex);
	}

	// TEXT
	public static WebElement getText(WebDriver wd) {
		WebElement getText = wd.findElement(By.xpath(EDIT_TEXT));
		return getText;
	}

	public static void clickText(WebDriver wd) {
		getText(wd).click();
		getText(wd).clear();
	}

	public static void setText(WebDriver wd, String text) {
		getText(wd).sendKeys(text);
	}

	// clicks post BUTTON
	public static void clickPostButton(WebDriver wd) {
		wd.findElement(By.xpath(POST_BUTTON)).click();
	}
}
