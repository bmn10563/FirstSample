package StepDefinitions;

import EcommercPage.AddGiftCardPage;
import EcommercPage.ecommercPage;
import org.openqa.selenium.WebDriver;

import java.util.Random;


public class Base {

	WebDriver driver;
	public ecommercPage epage;
	public AddGiftCardPage addgift;
	


	public static String generateRandomString(int length) {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

}




