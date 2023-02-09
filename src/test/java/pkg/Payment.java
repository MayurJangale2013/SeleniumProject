package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Payment {

	@Test
	public void verifyPayment()
	{
		System.out.println("Executing payment test !!!");
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    System.out.println(driver.getTitle());
	}
}
