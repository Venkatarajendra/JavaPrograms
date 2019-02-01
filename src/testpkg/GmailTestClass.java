package testpkg;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailTestClass {
	WebDriver driver;
	VerifyGmailInbox vgi = new VerifyGmailInbox();
	
	@Test
	public void verifyExists() {
		driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		List<WebElement> gmailLink = driver.findElements(By.tagName("a"));		
		
		boolean sts = vgi.verifyField( gmailLink,"Gmailsdsdfsd");
		
		if(sts) {
			System.out.println("Field  is available");
		}
		else {
			System.out.println("Field is not available");
		}
		
		driver.close();
			
	}
	
	

}
