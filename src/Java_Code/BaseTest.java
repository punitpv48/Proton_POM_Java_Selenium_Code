package Java_Code;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
    protected WebDriver driver;

    @BeforeMethod
    public void setup() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://account.proton.me/mail");
    }

    @AfterMethod
    public void tearDown() 
    {
        driver.quit();
    }

}