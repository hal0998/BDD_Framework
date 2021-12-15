package Com.EAM.Webelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.EAM.Utilities.Tools;
import Com.EAM.TestBase.*;

public class UserHomePage {

	
	public UserHomePage() {
		
		
		PageFactory.initElements(TestBase.get(), this);
		
	}
	
	
	@FindBy(xpath="//table[@class=\"xsz x1a\" and @id=\"pt1:pt_pgl22\"]/tbody/tr/td[1]/span/label")
    @CacheLookup
    WebElement userlabel;
	
	public void userLabel() {
		
		Tools.dynamic_Wait(userlabel, 10);
		String userlabeltext=userlabel.getText();
		String username=Tools.get_Pro("username");
		Tools.content_Validation(username, userlabeltext, "User Home Page validation");
		
	}
	
	
	
}
