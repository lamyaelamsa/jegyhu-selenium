package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropPage {

    private WebDriver driver;

    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performDragAndDrop() {
        String jsDragDrop = """
                function createEvent(typeOfEvent) {
                    var event = document.createEvent("CustomEvent");
                    event.initCustomEvent(typeOfEvent, true, true, null);
                    event.dataTransfer = {
                        data: {},
                        setData: function (key, value) {
                            this.data[key] = value;
                        },
                        getData: function (key) {
                            return this.data[key];
                        }
                    };
                    return event;
                }

                function dispatchEvent(element, event, transferData) {
                    if (transferData !== undefined) {
                        event.dataTransfer = transferData;
                    }
                    if (element.dispatchEvent) {
                        element.dispatchEvent(event);
                    } else if (element.fireEvent) {
                        element.fireEvent("on" + event.type, event);
                    }
                }

                function simulateHTML5DragAndDrop(element, destination) {
                    var dragStartEvent = createEvent('dragstart');
                    dispatchEvent(element, dragStartEvent);
                    var dropEvent = createEvent('drop');
                    dispatchEvent(destination, dropEvent, dragStartEvent.dataTransfer);
                    var dragEndEvent = createEvent('dragend');
                    dispatchEvent(element, dragEndEvent, dragStartEvent.dataTransfer);
                }

                var source = arguments[0];
                var target = arguments[1];
                simulateHTML5DragAndDrop(source, target);
                """;

        WebElement from = driver.findElement(columnA);
        WebElement to = driver.findElement(columnB);

        ((JavascriptExecutor) driver).executeScript(jsDragDrop, from, to);
    }

    public String getColumnAText() {
        return driver.findElement(columnA).getText();
    }

    public String getColumnBText() {
        return driver.findElement(columnB).getText();
    }
}
