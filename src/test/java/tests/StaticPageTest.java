package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;

public class StaticPageTest extends TestBase {
    @Test
    public void testOpenStaticPage() {
        driver.get("https://jegy.hu");
        System.out.println("Opened homepage successfully.");
    }
}
