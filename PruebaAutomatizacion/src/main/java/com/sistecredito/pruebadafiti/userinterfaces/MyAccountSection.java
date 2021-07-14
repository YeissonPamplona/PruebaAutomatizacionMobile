package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyAccountSection {

    public static final Target REGISTER_OPTION = Target.the("Registrer option").located(By.id("account_email"));
    public static final Target CREATE_ACCOUNT = Target.the("Registrer option").located(By.id("create_account"));
}
