package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.HomePage;
import methods.Method;

public class ValidLogIn {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_101\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void LogIn () {
		Method.goToURL(driver);
		Method.unesiKorisnik(driver, HomePage.validKorisnik);
		Method.unesiLozinka(driver, HomePage.validLozinka);
		Method.klikPrijaviSe(driver);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);  
		wait.until(ExpectedConditions.invisibilityOfElementLocated(HomePage.prijaviSeDugme_id));
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actual = driver.getCurrentUrl();
		String exp = "http://89.216.55.24:8083/smartPortal/mcdonalds";
		Assert.assertEquals(actual, exp);	
		
	}
	
	@AfterClass
	public void close () throws Exception {
		Thread.sleep(200);
		driver.quit();
	}
}
