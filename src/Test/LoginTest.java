package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Java_Code.BaseTest;
import Java_Code.LoginPage;

public class LoginTest extends BaseTest 
{

    @Test
    public void loginTest() 
    {
    	LoginPage loginPage = new LoginPage(driver);
        
    	// Enter User name
    	loginPage.enterUsername("punione4");
        
    	// Enter password
    	loginPage.enterPassword("Hwell#4894");
        
    	// Select Keep me signed in
    	loginPage.selectKeepMeSignedIn();
        
    	// Click Sign In
    	loginPage.clickSignIn();
        
    	//Verifying the URL before login
    	System.out.println("Current URL: " + driver.getCurrentUrl());

        // Verify successful login
        Assert.assertTrue(loginPage.isLoginSuccessful(),"Login was not successful");
        
      //Verifying the URL after the user is logged in
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }
}