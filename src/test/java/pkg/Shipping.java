package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shipping {

	@Test
	public void verifyShipping()
	{
		System.out.println("Executing shipping test !!!");
	    WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.com");
	    System.out.println(driver.getTitle());
	}
}
