package constants;

import org.openqa.selenium.By;

public class HomePage {
public static final String URL = "http://89.216.55.24:8083/smartPortal/mcdonalds/login";
public static final By korisnickoImePolje_id = By.id("usernameLabel"); 
public static final By korisnickoImeUnos_id = By.id("loginname"); 
public static final By lozinkaPolje_id = By.id("passwordLabel");
public static final By lozinkaUnos_id = By.id("password");
public static final By prijaviSeDugme_id = By.id("loginLabelButton");

public static final String validKorisnik = "milena";
public static final String validLozinka = "Milena@123";
public static final String invalidKorisnik = "MILena";
public static final String invalidLozinka = "Milena123";

public static final String expected = "http://89.216.55.24:8083/smartPortal/mcdonalds";
}
