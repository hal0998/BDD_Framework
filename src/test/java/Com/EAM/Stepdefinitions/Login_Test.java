package Com.EAM.Stepdefinitions;

import Com.EAM.Utilities.Tools;
import Com.EAM.Webelements.LoginPage;
import Com.EAM.Webelements.NSCHomePage;
import Com.EAM.Webelements.UserHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Test extends Tools {
	NSCHomePage nschomePage;
	LoginPage loginpage;
	UserHomePage userpage;

	@Given("Launch the chrome browser navigate to the NSC HomePage url click the user login button")
	public void launch_the_chrome_browser_navigate_to_the_NSC_HomePage_url_click_the_user_login_button() {

		nschomePage = new NSCHomePage();
		loginpage = nschomePage.click_UserLogin();
	}

	@When("user clicks the user login button directed to the new window enters username and password.")
	public void user_clicks_the_user_login_button_directed_to_the_new_window_enters_username_and_password() {

		loginpage.enter_UserName();
		loginpage.enter_Password();
		userpage = loginpage.click_loginButton();

	}

	@Then("external user should be landing homepage")
	public void external_user_should_be_landing_homepage() {

		Tools.get_PageTitile();
		userpage.userLabel();

	}

}
