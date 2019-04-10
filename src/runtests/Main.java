package runtests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.HomePage;
import tests.Tests;

public class Main {

	public static void main(String[] args) throws Exception {

		WebDriver wd = new ChromeDriver();

		Scanner sc = new Scanner(System.in);

		HomePage.goToHomePage(wd);

		Tests.chuseTest(wd, sc);

		sc.close();

	}

}
