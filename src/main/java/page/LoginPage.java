package page;

import base.Base.BaseTest;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    public static String signin="//*[@class='login']";
    public static String email="//*[@id='email']";
    public static String pswd="//*[@id='passwd']";

public void signclick()
{
    driver.findElement(By.xpath(signin)).click();
}

    public void LoginFunction(String Id,String pwd)
    {

        driver.findElement(By.xpath(email)).sendKeys(Id);
        driver.findElement(By.xpath(pswd)).sendKeys(pwd);
    }
}
