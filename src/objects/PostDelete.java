package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostDelete {

	// delete post last 2 posts
	public static void postDelete(WebDriver wd, int deleteNum) {

		try {
			for (int i = 0; i < deleteNum; i++) {

				List<WebElement> lie = wd.findElements(By.xpath("//i[@class='fas fa-ellipsis-v']"));
				List<WebElement> lid = wd.findElements(By.xpath("//i[@class='fas fa-trash-alt']"));
				lie.get(0).click();
				lid.get(0).click();

			}
		} catch (Exception e) {

		}

	}

}
