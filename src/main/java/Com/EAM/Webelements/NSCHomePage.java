package Com.EAM.Webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EAM.Utilities.Tools;
import Com.EAM.TestBase.*;

public class NSCHomePage {

	public NSCHomePage() {
		
		PageFactory.initElements(TestBase.get(), this);
	}
	
	@FindBy(xpath="(//a[text()='User Login'])[1]")
	@CacheLookup
	WebElement userlogin;
	
	public LoginPage click_UserLogin() {
		
		Tools.dynamic_Wait(userlogin, 10);
		userlogin.click();
		Tools.freeze(2);
		Tools.switch_to_ChildWindow();
		return new LoginPage();
	
	}

}
