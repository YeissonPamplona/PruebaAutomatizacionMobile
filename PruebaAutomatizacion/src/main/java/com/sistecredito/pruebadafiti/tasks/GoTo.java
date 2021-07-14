package com.sistecredito.pruebadafiti.tasks;

import com.sistecredito.pruebadafiti.userinterfaces.CategoriesSection;
import com.sistecredito.pruebadafiti.userinterfaces.CommonElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sistecredito.pruebadafiti.userinterfaces.HomeSection.COUNTRY_SELECTION;
import static com.sistecredito.pruebadafiti.userinterfaces.HomeSection.MAN_CATEGORY;

public class GoTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(COUNTRY_SELECTION),
                WaitUntil.the(MAN_CATEGORY, WebElementStateMatchers.isClickable()),
                Click.on(MAN_CATEGORY));
    }

    public static GoTo theCategoryProduct(){
        return new GoTo();
    }
}
