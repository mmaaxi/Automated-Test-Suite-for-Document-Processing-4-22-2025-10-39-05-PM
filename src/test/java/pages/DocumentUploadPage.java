package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentUploadPage {
    WebDriver driver;

    By btnCargarDocumentos = By.id("btnCargarDocumentos");
    By opcionesCarga = By.id("opcionesCarga");
    By recuadroUnico = By.id("recuadroUnico");
    By recuadrosMultiples = By.id("recuadrosMultiples");

    public DocumentUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarOpcionCargaDocumentos(String opcion) {
        driver.findElement(btnCargarDocumentos).click();
    }

    public boolean verificarOpcionesDeCarga() {
        return driver.findElement(opcionesCarga).isDisplayed();
    }

    public void elegirModoCarga(String modoCarga) {
        // Implementación ejemplo de elección de modo basado en modoCarga.
        if (modoCarga.equals("carga en un solo archivo")) {
            driver.findElement(recuadroUnico).click();
        } else {
            driver.findElement(recuadrosMultiples).click();
        }
    }

    public boolean verificarRecuadroUnico() {
        return driver.findElement(recuadroUnico).isDisplayed();
    }

    public boolean verificarMultiplesRecuadros() {
        return driver.findElement(recuadrosMultiples).isDisplayed();
    }
}