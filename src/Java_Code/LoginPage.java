package Java_Code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait;

	// Locators
	By username = By.id("username");
	By password = By.id("password");
	By keepMeSignedIn = By.xpath("//*[contains(text(),'Keep me signed in')]");
	By signInButton = By.xpath("//button[contains(.,'Sign in')]");

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	// Enter Username
	public void enterUsername(String userName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys(userName);
	}

	// Enter Password
	public void enterPassword(String passWord) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(passWord);
	}

	// Select Keep me signed in
	public void selectKeepMeSignedIn() {
		wait.until(ExpectedConditions.elementToBeClickable(keepMeSignedIn)).click();
	}

	// Click Sign In
	public void clickSignIn() {
		wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
	}

	// Verify Login
	public boolean isLoginSuccessful() {
		wait.until(ExpectedConditions.urlContains("/inbox"));
		return driver.getCurrentUrl().contains("/inbox");
	}
}