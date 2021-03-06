package com.sistecredito.pruebadafiti.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_product_to_cart.feature",
        glue = "com.sistecredito.pruebadafiti.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class AddProductToCart {
}
