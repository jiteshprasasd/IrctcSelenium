package demoIrctc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {

	WebDriver driver;

	@Test
	public void login() throws IOException, InterruptedException {

		driver = initializeBrowser();

		Properties prop = new Properties();
		String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(propertiesPath);
		prop.load(fis);
		driver.get(prop.getProperty("url"));

		LandingPage landingPage = new LandingPage(driver);
		landingPage.alert().click();
		landingPage.loginBtn().click();
		
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
//		loginPage.username().sendKeys("jiteshprasad");
		loginPage.username().sendKeys(prop.getProperty("userid"));
//		loginPage.password().sendKeys("Jitesh@86");
		loginPage.password().sendKeys(prop.getProperty("password"));
//		loginPage.loginButton().click();

	}

}
