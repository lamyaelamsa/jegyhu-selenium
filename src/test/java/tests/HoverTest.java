package tests;

import org.junit.jupiter.api.Test;
import pages.HoverPage;
import base.TestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoverTest extends TestBase {

    @Test
    public void testHoverAction() {
        driver.get("https://jegy.hu"); // Home page

        HoverPage hoverPage = new HoverPage(driver);
        hoverPage.hoverOverMenu();

        assertTrue(hoverPage.isHoverMenuVisible(), "The hover menu should be visible.");
    }
}
