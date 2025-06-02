package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By loginLink = By.linkText("Bejelentkezés");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public boolean isOnHomePage() {
        return driver.getTitle().contains("Jegy.hu");
    }
}

