package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CommonElements {
    public static final Target CATEGORIES = Target.the("Categories").located(By.id("navigation_categories"));
    public static final Target SIZE_PRODUCT = Target.the("Size product").locatedBy("//*[@text='{0}']");
    public static final Target PRODUCT_NAME = Target.the("Producto name").located(By.id("product_name"));
    public static final Target BUY_BUTTON = Target.the("Buy button").located(By.id("buy_button"));
    public static final Target CART = Target.the("Categories").locatedBy("//android.widget.ImageView[@content-desc='Carrito']");
}
