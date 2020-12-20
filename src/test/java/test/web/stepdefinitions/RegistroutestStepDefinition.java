package test.web.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroutestStepDefinition {

    @Before
    public void PrepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^el usuario abre la pagina$")
    public void abroLaPagina() {
        theActorCalled("user").wasAbleTo(Abrirpagina.conlaUrl());
    }


    @Cuando("^el usuario quiere registrar sus datos personales$")
    public void meQuieroRegistrar(List<Map<String,String>> data) {
        theActorInTheSpotlight().attemptsTo(
                UtestTask.join(),
                PasoDatosPersonales.alFormulario(data)
        );
    }

    @Cuando("^el usuario adiciona los datos de su direccion como ciudad (.*) codigo postal (.*)$")
    public void adicionoMiCiudadDeDestinoYElCodigoPostal(String city,String postalcode) {
        theActorInTheSpotlight().attemptsTo(
                IngresarDatos.sobreLaDireccion(city,postalcode)
        );
    }

    @Cuando("^el usuario establece un password (.*) para la cuenta$")
    public void elUsuarioEstableceUnPassword(String pass) {
        theActorInTheSpotlight().attemptsTo(
                Establezco.elPassword(pass)
        );
    }
}