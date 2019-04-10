package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import objects.Post;
import utility.Cons;
import utility.ExcelData;

public class PostTest {
	public static void createPost(WebDriver wd, int rowNum) throws Exception {

		ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_post);

		String[] data = new String[3];
		for (int i = 0; i < 3; i++) {
			data[i] = ExcelData.getData(1, i);
		}

		Post.addPost(wd);
		Post.clickAddName(wd);
		Post.sendKeysAddName(wd, data[1]);

		Post.clickLocation(wd);
		Post.sendKeysLocation(wd, data[2]);

//			Post.addPicture(wd);
//			Post.sendKeysPicture(wd, "C:\\Users\\User\\Desktop\\5acadc92f3c7d.image.jpg");

		Post.selectTransport(wd);

		Post.clickText(wd);
		Post.sendKeysText(wd, data[0]);

		Post.setPost(wd);

	}

	public static void createPostAll(WebDriver wd) throws Exception {
		ExcelData.setFile(Cons.path + Cons.file, Cons.sheet_post);
		for (int i = 0; i < ExcelData.rowCount(); i++) {
			createPost(wd, i);
		}
	}

	public static void createPostManual(WebDriver wd, Scanner sc) {

		Post.addPost(wd);
		System.out.println("CREATE POST");
		System.out.println("Enter Name");
		Post.clickAddName(wd);
		sc.nextLine();
		String name = sc.nextLine();
		Post.sendKeysAddName(wd, name);

		System.out.println("Enter Location");
		Post.clickLocation(wd);
		String location = sc.nextLine();
		Post.sendKeysLocation(wd, location);

//			Post.addPicture(wd);
//			Post.sendKeysPicture(wd, "C:\\Users\\User\\Desktop\\5acadc92f3c7d.image.jpg");

		Post.selectTransport(wd);

		System.out.println("Enter Text");
		Post.clickText(wd);
		String text = sc.nextLine();
		Post.sendKeysText(wd, text);

		Post.setPost(wd);

	}
}
