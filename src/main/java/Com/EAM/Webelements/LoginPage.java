package Com.EAM.Webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EAM.TestBase.TestBase;
import Com.EAM.Utilities.Tools;

public class LoginPage {

	public LoginPage() {

		PageFactory.initElements(TestBase.get(), this);
	}

	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement userInput;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement passwordInput;

	@FindBy(xpath = "//input[@class='btnLogin']")
	@CacheLookup
	WebElement loginButton;

	public void enter_UserName() {

		String userName = Tools.get_Pro("username");
		Tools.dynamic_Wait(userInput, 10);
		userInput.sendKeys(userName);

	}

	public void enter_Password() {

		String password = Tools.get_Pro("password");
		Tools.dynamic_Wait(passwordInput, 10);
		passwordInput.sendKeys(password);

	}

	public UserHomePage click_loginButton() {

		Tools.waitfor_Clickable(loginButton, 10);
		loginButton.click();
		return new UserHomePage();
	}
}
