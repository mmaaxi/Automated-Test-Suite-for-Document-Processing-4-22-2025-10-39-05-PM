package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page slipPage = new tc_010Page();

    @Given("El sistema está en la pantalla de carga de documentos")
    public void el_sistema_esta_en_la_pantalla_de_carga_de_documentos() {
        slipPage.navigateToDocumentUploadPage();
    }
    
    @When("El usuario carga y procesa los documentos")
    public void el_usuario_carga_y_procesa_los_documentos() {
        slipPage.uploadAndProcessDocuments();
    }

    @Then("El sistema genera el 'Slip de salida' y guarda tanto los documentos originales como los datos extraídos en el historial de la solicitud")
    public void el_sistema_genera_slip_y_guarda_en_historial() {
        Assert.assertTrue(slipPage.isSlipGenerated());
        Assert.assertTrue(slipPage.isDataStoredInHistory());
    }
}