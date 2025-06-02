package tests;

import base.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.nio.file.Paths;

public class FileUploadTest extends TestBase {
    @Test
    public void testUpload() {
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
        driver.findElement(By.id("myFile")).sendKeys(Paths.get("sample.txt").toAbsolutePath().toString());
    }
}
