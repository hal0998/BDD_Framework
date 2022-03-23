$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Fetures/LoginTest.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke_Test"
    }
  ]
});
formatter.scenario({
  "name": "User Able login successfully to EAM Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke_Test"
    },
    {
      "name": "@Login_Feature"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.manage()\" because the return value of \"java.lang.InheritableThreadLocal.get()\" is null\r\n\tat Com.EAM.TestBase.TestBase.launch_Browser(TestBase.java:108)\r\n\tat Com.EAM.Stepdefinitions.GenralHooks.set_up(GenralHooks.java:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Launch the chrome browser navigate to the NSC HomePage url click the user login button",
  "keyword": "Given "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.launch_the_chrome_browser_navigate_to_the_NSC_HomePage_url_click_the_user_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the user login button directed to the new window enters username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.user_clicks_the_user_login_button_directed_to_the_new_window_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "external user should be landing homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.external_user_should_be_landing_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because the return value of \"java.lang.InheritableThreadLocal.get()\" is null\r\n\tat Com.EAM.TestBase.TestBase.close(TestBase.java:120)\r\n\tat Com.EAM.Stepdefinitions.GenralHooks.tear_Down(GenralHooks.java:32)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "User Able login successfully to EAM Application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke_Test"
    },
    {
      "name": "@Login_Feature1"
    }
  ]
});
formatter.before({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.manage()\" because the return value of \"java.lang.InheritableThreadLocal.get()\" is null\r\n\tat Com.EAM.TestBase.TestBase.launch_Browser(TestBase.java:108)\r\n\tat Com.EAM.Stepdefinitions.GenralHooks.set_up(GenralHooks.java:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Launch the chrome browser navigate to the NSC HomePage url click the user login button",
  "keyword": "Given "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.launch_the_chrome_browser_navigate_to_the_NSC_HomePage_url_click_the_user_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the user login button directed to the new window enters username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.user_clicks_the_user_login_button_directed_to_the_new_window_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "external user should be landing homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Com.EAM.Stepdefinitions.Login_Test.external_user_should_be_landing_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("this is my failure message");
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because the return value of \"java.lang.InheritableThreadLocal.get()\" is null\r\n\tat Com.EAM.TestBase.TestBase.close(TestBase.java:120)\r\n\tat Com.EAM.Stepdefinitions.GenralHooks.tear_Down(GenralHooks.java:32)\r\n",
  "status": "failed"
});
});