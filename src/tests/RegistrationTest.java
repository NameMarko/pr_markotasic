package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.Registration;
import utility.Cons;
import utility.ExcelData;

public class RegistrationTest {

	public static void registerNewUser(WebDriver driver, int rowNum) throws Exception {

		ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_reg);
		String[] data = new String[5];
		for (int i = 0; i < 5; i++) {
			data[i] = ExcelData.getData(rowNum, i);
		}
		Registration.clickFirstName(driver);
		Registration.sendKeysFirstName(driver, data[0]);

		Registration.clickLastName(driver);
		Registration.sendKeysLastName(driver, data[1]);

		Registration.clickuserName(driver);
		Registration.sendKeysUserName(driver, data[2]);

		Registration.clickemail(driver);
		Registration.sendKeysEmail(driver, data[3]);

		Registration.clickPassword(driver);
		Registration.sendKeysPassword(driver, data[4]);

		Registration.regButton(driver);
	}

	public static void registerNewUserAll(WebDriver wd) throws Exception {
		ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_reg);
		for (int i = 1; i < ExcelData.rowCount(); i++) {
			registerNewUser(wd, i);
		}

	}

	public static void regNewUserManual(WebDriver driver, Scanner sc) {

		Registration.clickFirstName(driver);
		System.out.println("Enter First Name");
		sc.nextLine();
		Registration.sendKeysFirstName(driver, sc.nextLine());

		Registration.clickLastName(driver);
		System.out.println("Enter Last Name");
		Registration.sendKeysLastName(driver, sc.nextLine());

		Registration.clickuserName(driver);
		System.out.println("Enter User Name");
		Registration.sendKeysUserName(driver, sc.nextLine());

		Registration.clickemail(driver);
		System.out.println("Enter E-mail");
		Registration.sendKeysEmail(driver, sc.nextLine());

		Registration.clickPassword(driver);
		System.out.println("Enter Password");
		Registration.sendKeysPassword(driver, sc.nextLine());

		Registration.regButton(driver);

	}

}
