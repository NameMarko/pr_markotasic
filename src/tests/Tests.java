package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.HomePage;
import objects.LogIn;
import objects.PostDelete;
import utility.Cons;

public class Tests {

	public static void chuseTest(WebDriver wd, Scanner sc) throws Exception {

		while (true) {

			System.out.println("Enter '1' for Registration Test");
			System.out.println("Enter '2' for LogIn Test");
			System.out.println("Enter '3' for Post Test");
			System.out.println("Enter '4' for Post Edit Test");
			System.out.println("Enter '5' to Delete Post");
			System.out.println("Enter 'x' for Close");

			switch (sc.next()) {

			case "1":
				while (true) {
					System.out.println("Enter '11' for all users");
					System.out.println("Enter '12' for user manual input");
					System.out.println("Enter '0' for Back");
					if (Cons.loginurl.equals(wd.getCurrentUrl())) {
						LogIn.logOutButton(wd);
					}

					switch (sc.next()) {
					case "11":
						RegistrationTest.registerNewUserAll(wd);
						break;
					case "12":
						RegistrationTest.regNewUserManual(wd, sc);
						break;

					case "0":
						break;
					}
					break;

				}
				break;

			case "2":
				while (true) {

					System.out.println("Enter '21' for LogIn all users");
					System.out.println("Enter '22' for manual user LogIn");
					System.out.println("Enter '0' for Back");
					switch (sc.next()) {
					case "21":
						HomePage.goToHomePage(wd);
						LogInTest.logInAll(wd);
						break;
					case "22":
						LogInTest.logInManual(wd, sc);
						break;
					case "0":
						break;
					}
					break;
				}
				break;

			case "3":
				while (true) {

					if (Cons.loginurl.equals(wd.getCurrentUrl())) {
						System.out.println("Enter '31' to create all new posts");
						System.out.println("Enter '32' to create manual new post");
						System.out.println("Enter '0' for Back");
					} else {
						LogInTest.logInManual(wd, sc);
						System.out.println("Enter '31' to create all new posts");
						System.out.println("Enter '32' to create manual new post");
						System.out.println("Enter '0' for Back");
					}
					switch (sc.next()) {
					case "31":
						PostTest.createPostAll(wd);
						break;
					case "32":
						PostTest.createPostManual(wd, sc);
						break;
					case "0":
						break;
					}
					break;
				}
				break;

			case "4":
				while (true) {
					if (Cons.loginurl.equals(wd.getCurrentUrl())) {
						System.out.println("Enter '41' to edit post");
						System.out.println("Enter '0' for Back");
					} else {
						LogInTest.logInManual(wd, sc);
						System.out.println("Enter '41' to edit post");
						System.out.println("Enter '0' for Back");
					}
					switch (sc.next()) {
					case "41":
						PostEditTest.postEditManual(wd, sc);
						break;
					case "0":
						break;
					}
					break;
				}
				break;

			case "5":
				if (Cons.loginurl.equals(wd.getCurrentUrl())) {
					PostDelete.postDelete(wd, 2);
				} else {
					LogInTest.logInManual(wd, sc);
					PostDelete.postDelete(wd, 2);
				}
				break;

			case "x":
				wd.close();
				return;
			default:
				System.out.println("Bad Command\n");
			}

		}

	}

}
