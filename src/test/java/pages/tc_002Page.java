package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    private By uploadInput = By.id("uploadFile");
    private By previewSection = By.id("filePreview");
    private By fileName = By.id("fileName");
    private By fileSize = By.id("fileSize");
    private By fileType = By.id("fileType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        driver.findElement(uploadInput).sendKeys(filePath);
    }

    public boolean isPreviewDisplayed() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public String getFileNameFromPreview() {
        return driver.findElement(fileName).getText();
    }

    public long getFileSizeFromPreview() {
        String sizeText = driver.findElement(fileSize).getText();
        return Long.parseLong(sizeText);
    }

    public String getFileTypeFromPreview() {
        return driver.findElement(fileType).getText();
    }
}