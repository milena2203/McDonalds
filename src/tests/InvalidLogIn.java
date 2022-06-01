package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.HomePage;
import methods.Method;

public class InvalidLogIn {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_101\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test 
	public static void test1()  {
		Method.goToURL(driver);
		// valid Korisnik, invalid Lozinka
		Method.unesiKorisnik(driver, HomePage.validKorisnik);
		Method.unesiLozinka(driver, HomePage.invalidLozinka);
		Method.klikPrijaviSe(driver);

		WebDriverWait wait1 = new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"background\"]/div[2]/div/div/div[2]/button")));
		String actual1 = driver.getCurrentUrl();
		//sa.assertNotEquals(actual1, HomePage.expected);
		Assert.assertNotEquals(actual1, HomePage.expected);
	}

	
	 @Test
	 public void test2 () {
		// invalid Korisnik, valid Lozinka
		
			Method.goToURL(driver);
			Method.unesiKorisnik(driver, HomePage.invalidKorisnik);
			Method.unesiLozinka(driver, HomePage.validLozinka);
			Method.klikPrijaviSe(driver);

			WebDriverWait wait2 = new WebDriverWait(driver, 5);
			//wait2.until(ExpectedConditions
					//.elementToBeClickable(By.xpath("//*[@id=\"background\"]/div[2]/div/div/div[2]/button")));
			String actual2 = driver.getCurrentUrl();
			//sa.assertNotEquals(actual2, HomePage.expected);
			Assert.assertNotEquals(actual2, HomePage.expected);
	 }
	 
	 @Test 
	 public void test3 () {
		// invalid Korisnik, invalid Lozinka
		 
			Method.goToURL(driver);
			Method.unesiKorisnik(driver, HomePage.invalidKorisnik);
			Method.unesiLozinka(driver, HomePage.invalidLozinka);
			Method.klikPrijaviSe(driver);

			WebDriverWait wait3 = new WebDriverWait(driver, 5);
			//wait3.until(ExpectedConditions
					//.elementToBeClickable(By.xpath("//*[@id=\"background\"]/div[2]/div/div/div[2]/button")));
			String actual3 = driver.getCurrentUrl();
		//	sa.assertNotEquals(actual3, HomePage.expected);
			Assert.assertNotEquals(actual3, HomePage.expected);
	 }
	@AfterClass
	public void close() throws Exception {
		Thread.sleep(200);
		driver.quit();
	}
}
