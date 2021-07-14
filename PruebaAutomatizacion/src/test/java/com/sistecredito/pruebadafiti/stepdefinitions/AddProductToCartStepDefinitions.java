package com.sistecredito.pruebadafiti.stepdefinitions;

import com.sistecredito.pruebadafiti.exceptions.MensajeExceptions;
import com.sistecredito.pruebadafiti.models.DataProduct;
import com.sistecredito.pruebadafiti.questions.GetText;
import com.sistecredito.pruebadafiti.tasks.Selected;
import com.sistecredito.pruebadafiti.tasks.GoTo;
import com.sistecredito.pruebadafiti.userinterfaces.CartSection;
import com.sistecredito.pruebadafiti.utils.Driver;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductToCartStepDefinitions {

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(Driver.mobile())));
        OnStage.theActorCalled("Yeisson");
    }

    @Given("^the user select the category product$")
    public void theUserSelectTheCategoryProduct() {
        theActorInTheSpotlight().wasAbleTo(GoTo.theCategoryProduct());
    }


    @When("^he add the product to cart$")
    public void heAddTheProductToCart(List<DataProduct> dataProducts) {
        theActorInTheSpotlight().attemptsTo(Selected.theProduct(dataProducts.get(0)));
    }

    @Then("^he will see the product select in the cart section$")
    public void heWillSeeTheProductSelectInTheCartSection() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetText.ofTheElement(CartSection.PRODUCT),
                Matchers.equalTo(theActorInTheSpotlight().recall("theProductSelected"))).
                orComplainWith(MensajeExceptions.class, "El producto agregado no es el mismo"));
    }
}
