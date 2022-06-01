package methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.HomePage;

public class Method {
//	private static WebDriver driver;

	/*
	 * public static void driver () { System.setProperty("webdriver.chrome.driver",
	 * "C:\\chromedriver_win32_93\\chromedriver.exe"); driver = new ChromeDriver();
	 * }
	 */

	public static void goToURL(WebDriver driver) {
		driver.get(HomePage.URL);
		driver.manage().window().maximize();
	}

	public static void unesiKorisnik(WebDriver driver, String korisnik) {
		driver.findElement(HomePage.korisnickoImePolje_id).click();
		driver.findElement(HomePage.korisnickoImeUnos_id).sendKeys(korisnik);
		
		 WebDriverWait wait = new WebDriverWait(driver, 10);    
		
		//polje.sendKeys(Keys.ENTER);
	}

	public static void unesiLozinka(WebDriver driver, String lozinka) {
		driver.findElement(HomePage.lozinkaPolje_id).click();		
		driver.findElement(HomePage.lozinkaUnos_id).sendKeys(lozinka);
	}

	public static void klikPrijaviSe(WebDriver driver) {
		driver.findElement(HomePage.prijaviSeDugme_id).sendKeys(Keys.ENTER);
	}
	
	public static void pritisniEnter (WebDriver driver) {
		
		    
			try {
				   Robot robot = new Robot();
				   robot.keyPress(KeyEvent.VK_ENTER);
				    robot.keyRelease(KeyEvent.VK_ENTER);
				    robot.delay(200);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		
	}

	
}
