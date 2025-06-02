package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

public class JavascriptExecutorTest extends TestBase {
    @Test
    public void scrollDownPage() {
        driver.get("https://jegy.hu");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
