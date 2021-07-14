package com.sistecredito.pruebadafiti.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.NoSuchElementException;

public class Search implements Interaction {

    private Target target;

    public Search(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < 30; i++) {
            if (target.resolveFor(actor).isCurrentlyVisible()) {
                break;
            } else {
                actor.attemptsTo(Swipe.vertical());
            }
        }
        if (target.resolveFor(actor).isCurrentlyVisible()) {
            actor.attemptsTo(Click.on(target));
        } else {
            throw new NoSuchElementException(target.getCssOrXPathSelector());
        }
    }

    public static Search theElement(Target target) {
        return Tasks.instrumented(Search.class, target);
    }
}
