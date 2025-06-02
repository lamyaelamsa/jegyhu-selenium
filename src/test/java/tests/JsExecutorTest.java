package tests;
import base.TestBase;

import org.junit.jupiter.api.Test;
import pages.JsExecutorPage;

public class JsExecutorTest extends TestBase {
    @Test
    public void testScrollWithJs() {
        driver.get("https://your-long-page.com");
        JsExecutorPage page = new JsExecutorPage(driver);
        page.scrollToBottom();
        System.out.println("Scroll executed.");
    }
}
