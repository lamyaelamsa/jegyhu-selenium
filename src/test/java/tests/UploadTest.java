package tests;
import base.TestBase;

import org.junit.jupiter.api.Test;
import pages.UploadPage;

public class UploadTest extends TestBase {
    @Test
    public void testFileUpload() {
        driver.get("https://your-upload-page.com");
        UploadPage page = new UploadPage(driver);
        page.uploadFile("C:\\Users\\student\\Downloads\\testfile.txt");
        System.out.println("File uploaded.");
    }
}
