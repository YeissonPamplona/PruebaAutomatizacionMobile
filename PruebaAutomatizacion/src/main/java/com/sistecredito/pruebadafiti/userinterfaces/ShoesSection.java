package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesSection {

    private ShoesSection(){}

    public static final Target TENNIS_PRODUCT = Target.the("Search the tennis").locatedBy("//*[@text='{0}']");
}
