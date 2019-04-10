package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.HomePage;
import objects.LogIn;
import utility.Cons;
import utility.ExcelData;

public class LogInTest {

	public static void logIn(WebDriver driver, int rNum) throws Exception {

		try {
			ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_reg);
			String[] data = new String[5];
			for (int i = 0; i < 5; i++) {
				data[i] = ExcelData.getData(rNum, i);
			}
			LogIn.clickUserName(driver);
			LogIn.sendKeysUserName(driver, data[2]);

			LogIn.clickPassword(driver);
			LogIn.sendKeysPassword(driver, data[4]);

			LogIn.logInButton(driver);
			String curl = driver.getCurrentUrl();
			Thread.sleep(300);
			LogIn.logOutButton(driver);

			if (Cons.loginurl.equals(curl))
				ExcelData.setData("PASSED", rNum, 5);
		} catch (Exception e) {
			ExcelData.setData("FAILED", rNum, 5);
			driver.navigate().back();
		}

	}

	public static void logInAll(WebDriver wd) throws Exception {
		ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_reg);
		for (int i = 1; i < ExcelData.rowCount(); i++) {
			logIn(wd, i);
		}

	}

	public static void logInManual(WebDriver driver, Scanner sc) {

		HomePage.goToHomePage(driver);

		System.out.println("LOG IN");

		LogIn.clickUserName(driver);
		System.out.println("Enter User Name:");
		sc.nextLine();

		LogIn.sendKeysUserName(driver, sc.nextLine());

		LogIn.clickPassword(driver);
		System.out.println("Enter Password:");
		LogIn.sendKeysPassword(driver, sc.nextLine());

		LogIn.logInButton(driver);

	}

}
