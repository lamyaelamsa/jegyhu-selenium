package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PageTitleTest extends TestBase {
    @Test
    public void testPageTitleContainsKeyword() {
        driver.get("https://jegy.hu/user/login");
        String title = driver.getTitle();
        assertTrue(title.contains("Bejelentkezés"));
    }
}
