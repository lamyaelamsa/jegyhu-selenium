package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage extends BasePage {

    private By hoverElement = By.cssSelector(".nav-right .menu-container"); // Example selector

    public HoverPage(WebDriver driver) {
        super(driver);
    }

    public void hoverOverMenu() {
        WebElement elementToHover = driver.findElement(hoverElement);
        Actions actions = new Actions(driver);
        actions.moveToElement(elementToHover).perform();
    }

    public boolean isHoverMenuVisible() {
        return driver.findElement(hoverElement).isDisplayed();
    }
}
