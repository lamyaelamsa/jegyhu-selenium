package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private By emailField = By.cssSelector("input[placeholder='E-mail cím']");
    private By passwordField = By.cssSelector("input[placeholder='Jelszó']");
    private By loginButton = By.xpath("//button[contains(text(),'belépés')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginAs(String email, String password) {
        WebElement emailInput = driver.findElement(emailField);
        WebElement passwordInput = driver.findElement(passwordField);

        enterText(emailInput, email);
        enterText(passwordInput, password);
        clickElement(driver.findElement(loginButton));
    }

    public String getLoginErrorMessage() {
        // Optional: if you want to capture the red error box text
        By errorBox = By.cssSelector(".error-box, .alert-danger, .alert.alert-danger");
        return getElementText(driver.findElement(errorBox));
    }
}
