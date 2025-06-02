package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage extends BasePage {
    private By uploadInput = By.id("upload");
    private By submitButton = By.id("submit");

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
        driver.findElement(submitButton).click();
    }
}
