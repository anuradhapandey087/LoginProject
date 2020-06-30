package stepDef;

import base.Base.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import page.LoginPage;

public class LoginPageStep {
    LoginPage lp=new LoginPage();

    @Given("^User is on home page$")
    public void User_homepage()
    {
        BaseTest.initialization();
        lp.signclick();
    }
    @When("^User entered \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Enter_email_pwd(String email,String pwd)
    {
        lp.LoginFunction(email,pwd);
    }
}
