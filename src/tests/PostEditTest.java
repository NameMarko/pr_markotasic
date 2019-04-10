package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.PostEdit;

public class PostEditTest {

	public static void postEditManual(WebDriver wd, Scanner sc) {

		PostEdit.postEdit(wd);
		System.out.println("EDIT POST:");
		System.out.println("Enter Title");
		PostEdit.clickTitle(wd);
		sc.nextLine();
		PostEdit.setTitle(wd, sc.nextLine());

		System.out.println("Enter Location");
		PostEdit.clickLocation(wd);
		PostEdit.setLocation(wd, sc.nextLine());

		PostEdit.setTransport(wd, 1);

		System.out.println("Enter Text");
		PostEdit.clickText(wd);
		PostEdit.setText(wd, sc.nextLine());

		PostEdit.clickPostButton(wd);

	}

}
