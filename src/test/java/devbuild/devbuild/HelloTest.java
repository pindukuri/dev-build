package devbuild.devbuild;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HelloTest {
	

	String baseUrl = "https://www.gmail.com";
	String baseUrl1 = "https://www.google.com";
	String baseUrl2 = "https://www.amazon.com";
	WebDriver driver = null;
@BeforeMethod()
public void setup()
{
	String driverPath = "Driver/chromedriver";

	System.out.println("Launching google chrome with new profile..");

	System.setProperty("webdriver.chrome.driver", driverPath);

	driver = new ChromeDriver();

}


	
	
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(1000);
	driver.get(baseUrl);
	
	
	
	
	
		
}
}
