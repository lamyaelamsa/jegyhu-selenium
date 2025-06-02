package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import pages.DragAndDropPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragAndDropTest extends TestBase {

    @Test
    public void testDragAndDropSuccess() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");

        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        String boxATextBefore = dragAndDropPage.getColumnAText();
        String boxBTextBefore = dragAndDropPage.getColumnBText();

        dragAndDropPage.performDragAndDrop();
        Thread.sleep(1000); // Small wait to allow drag & drop to take effect

        String boxATextAfter = dragAndDropPage.getColumnAText();
        String boxBTextAfter = dragAndDropPage.getColumnBText();

        assertEquals(boxBTextBefore, boxATextAfter, "Box A should now have Box B's original text");
        assertEquals(boxATextBefore, boxBTextAfter, "Box B should now have Box A's original text");
    }
}
