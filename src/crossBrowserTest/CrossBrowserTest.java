package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters("Browser")
	public void openBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\Webdriverwork\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Webdriverwork\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		else {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		
	}
	
	@Test
	public void verifyTitle() {
		driver.navigate().to("http://www.google.co.in");
		System.out.println("Title of the page is: "+driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
