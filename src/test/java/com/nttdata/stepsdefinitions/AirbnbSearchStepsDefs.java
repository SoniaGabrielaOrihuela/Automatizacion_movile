package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.findby.By;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;


    @Given("Valido la pagina de Airnbn")
    public void validoLaPaginaDeAirnbn() {airbnbSearchSteps.clickClose();}

    @When("Ingreso el texto {string} en el campo de busqueda")
    public void ingresoElTextoEnElCampoDeBusqueda(String texto) {
        MobileElement searchBox = airbnbSearchSteps.findElement(By.xpath("//android.widget.EditText"));
        searchBox.sendKeys(texto);

    }

    @And("Hago clic en el boton buscar")
    public void hagoClicEnElBotonBuscar() {
        MobileElement searchButton = airbnbSearchSteps.findElement(By.xpath("//android.widget.EditText"));
        searchButton.click();
    }

    @Then("muestra el texto {string}")
    public void muestraElTexto(String texto2) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), texto2);
        MobileElement resultText = airbnbSearchSteps.findElement(By.xpath("//android.widget.TextView[@text=\"¿En qué fechas viajas?\"]"));
        assert resultText.isDisplayed();
    }
}
