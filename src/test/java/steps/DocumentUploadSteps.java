package steps;

import pages.DocumentUploadPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class DocumentUploadSteps {

    DocumentUploadPage documentUploadPage = new DocumentUploadPage();

    @When("el usuario selecciona la opción {string}")
    public void elUsuarioSeleccionaLaOpcion(String opcion) {
        documentUploadPage.seleccionarOpcionCargaDocumentos(opcion);
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void elSistemaMuestraOpcionParaCargaUnicaYMúltiple() {
        assertTrue(documentUploadPage.verificarOpcionesDeCarga());
    }

    @When("el usuario elige {string}")
    public void elUsuarioElige(String modoCarga) {
        documentUploadPage.elegirModoCarga(modoCarga);
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void seHabilitaUnUnicoRecuadroParaSubirElArchivo() {
        assertTrue(documentUploadPage.verificarRecuadroUnico());
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void seMuestranMultiplesRecuadrosCorrespondientesACadaDocumentoRequerido() {
        assertTrue(documentUploadPage.verificarMultiplesRecuadros());
    }
}