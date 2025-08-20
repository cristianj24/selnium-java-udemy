package steps;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.*;
import pages.PaginaCheckoutCart;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    SoftAssert softAssert = new SoftAssert();

    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionTestingPage = new PaginaIntroduccionTesting();
    PaginaCheckoutCart checkoutCartPage = new PaginaCheckoutCart();

    @Given("I navigate to wwww.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }
    //En caso salir error porque no ecuetra la definicion utilizar el siguiente comando
    @And("(?:I|The user|The client) (select|selects) Introduccion al Testing")
    //@And("(The user|The client) (select|selects) Introduccion al Testing")
    public void navigateToIntro(){
        cursosPage.clickFundamentosTesting();
    }
    @When("(I|The user|The client) select buy now")
    //(I|The user|The client) Permite tomar diferentes valores para el step
    public void validateCheckoutPlans(){
        introduccionTestingPage.clickIntroduccionTestingLink();
    }
    @Then("make the payment")
    public void makePayment(){
        checkoutCartPage.writeMail("correo@correo.com");
    }
}