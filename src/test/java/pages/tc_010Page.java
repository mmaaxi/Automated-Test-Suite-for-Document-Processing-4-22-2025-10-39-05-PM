package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    private By uploadButton = By.id("uploadButton");
    private By processButton = By.id("processButton");
    private By slipNotification = By.id("slipNotification");
    private By historySection = By.id("historySection");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDocumentUploadPage() {
        // Logic to navigate to the document upload page
        driver.get("http://example.com/upload");
    }

    public void uploadAndProcessDocuments() {
        // Logic to upload and process documents
        WebElement upload = driver.findElement(uploadButton);
        upload.sendKeys("path/to/documents.zip");
        
        WebElement process = driver.findElement(processButton);
        process.click();
    }

    public boolean isSlipGenerated() {
        // Logic to verify that the slip is generated
        return driver.findElement(slipNotification).isDisplayed();
    }

    public boolean isDataStoredInHistory() {
        // Logic to verify the data is stored in history
        return driver.findElement(historySection).isDisplayed();
    }
}