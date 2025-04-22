package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page uploadPage;

    @Given("El usuario está en la página de subida de archivos")
    public void elUsuarioEstaEnLaPaginaDeSubidaDeArchivos() {
        driver = new DriverFactory().getDriver();
        uploadPage = new tc_002Page(driver);
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo en formato PDF/DOCX dentro del límite de 50 MB")
    public void elUsuarioSeleccionaUnArchivoEnFormatoPDFDOCXDentroDelLimiteDe50MB() {
        uploadPage.uploadFile("path/to/your/file.pdf");
    }

    @Then("El archivo se carga correctamente y se muestra la vista previa con el nombre, tamaño y tipo del archivo")
    public void elArchivoSeCargaCorrectamenteYSeMuestraLaVistaPrevia() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
        Assert.assertEquals("file.pdf", uploadPage.getFileNameFromPreview());
        Assert.assertTrue(uploadPage.getFileSizeFromPreview() <= 50 * 1024 * 1024);
        Assert.assertEquals("application/pdf", uploadPage.getFileTypeFromPreview());
        driver.quit();
    }
}