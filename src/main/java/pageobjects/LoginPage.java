package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@formcontrolname='userid']")
	WebElement username;
	@FindBy(xpath= "//*[@formcontrolname='password']") WebElement password;
	
	public WebElement username() {
		return username;
		
	}
	public WebElement password() {
		return password;
	}
	

}
