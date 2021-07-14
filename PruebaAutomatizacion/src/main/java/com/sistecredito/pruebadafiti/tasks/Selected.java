package com.sistecredito.pruebadafiti.tasks;

import com.sistecredito.pruebadafiti.interactions.Search;
import com.sistecredito.pruebadafiti.models.DataProduct;
import com.sistecredito.pruebadafiti.questions.GetText;
import com.sistecredito.pruebadafiti.userinterfaces.CommonElements;
import com.sistecredito.pruebadafiti.userinterfaces.ShoesSection;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Selected implements Task {

    private DataProduct dataProduct;

    public Selected(DataProduct dataProduct) {
        this.dataProduct = dataProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Search.theElement(ShoesSection.TENNIS_PRODUCT.of(dataProduct.getProduct())));
        actor.remember("theProductSelected", GetText.ofTheElement(CommonElements.PRODUCT_NAME));
        actor.attemptsTo(Click.on(CommonElements.SIZE_PRODUCT.of(dataProduct.getSize())),
                Click.on(CommonElements.BUY_BUTTON));
        actor.attemptsTo(WaitUntil.the(CommonElements.CART, WebElementStateMatchers.isClickable()),
                Click.on(CommonElements.CART));
    }

    public static Selected theProduct(DataProduct dataProduct) {
        return Tasks.instrumented(Selected.class, dataProduct);
    }
}
