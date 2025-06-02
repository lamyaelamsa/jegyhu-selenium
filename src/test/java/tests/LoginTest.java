package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {

    @Test
    public void testOpenPage() {
        driver.get("https://jegy.hu/user/login");
        System.out.println("Page opened successfully!");
    }

    @Test
    public void testInvalidLogin() {
        HomePage home = new HomePage(driver);
        home.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("invalid@email.com", "wrongpassword");

        System.out.println("Invalid login attempted.");
    }
}


