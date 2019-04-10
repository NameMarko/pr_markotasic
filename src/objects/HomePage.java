package objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import utility.Cons;

public class HomePage {
	public static void goToHomePage(WebDriver wd) {
		wd.get(Cons.url);
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		String curl = wd.getCurrentUrl();
		if (Cons.url.equals(curl)) {
			
		} else {
			System.out.println("Bad url");
		}
	}
}
