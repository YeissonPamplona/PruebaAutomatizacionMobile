package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonElements {

    private CommonElements(){
    }

    public static final Target CATEGORIES = Target.the("Categories").located(By.id("navigation_categories"));
    public static final Target SIZE_PRODUCT = Target.the("Size product").locatedBy("//*[@text='{0}']");
    public static final Target PRODUCT_NAME = Target.the("Producto name").located(By.id("product_name"));
    public static final Target BUY_BUTTON = Target.the("Buy button").located(By.id("buy_button"));
    public static final Target CART = Target.the("Categories").locatedBy("//android.widget.ImageView[@content-desc='Carrito']");
    public static final Target MY_ACCOUNT = Target.the("My account").located(By.id("navigation_account"));
    public static final Target CLOSE_WELCOME_POPUP = Target.the("Close the welcome PopUp").located(By.id("navigation_account"));
}
