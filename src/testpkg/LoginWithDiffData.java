package testpkg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginWithDiffData {
	public static ExtentTest eTest;
	WebDriver driver;
	//public static void main(String[] args) throws IOException, InterruptedException {
	@Test
	public void loginApp() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		String url = "http://localhost:8080/login?from=%2F";
		
		String fpath = "E:\\Webdriverwork\\loginData.txt";
		
		
		String username, passwd;		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		File ipFile = new File(fpath);	
		BufferedReader br = new BufferedReader(new FileReader(ipFile));
		String line;
		int i=0;
		while((line=br.readLine())!=null) {
			i++;
			if (i>1) {
				String[] userData = line.split(" ");
				username = userData[0].trim();
				passwd = userData[1].trim();
				driver.findElement(By.id("j_username")).sendKeys(username);
				driver.findElement(By.name("j_password")).sendKeys(passwd);
				driver.findElement(By.name("Submit")).click();
				boolean sts = false;
				try {
					sts = driver.findElement(By.id("side-panel")).isDisplayed();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(sts) {
					System.out.println("Logged in with user: "+username);
					Thread.sleep(10000);
					WebElement logout = driver.findElement(By.xpath(".//*[@id='header']/div[2]/span/a[2]"));
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[0].click();", logout);
					//eTest.log(LogStatus.PASS, "LoggedIn");
				}
				else {
					System.out.println("Not Logged in with user: "+username);
					//eTest.log(LogStatus.FAIL, "Not LoggedIn");
				}
			}
		}		
	

	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
