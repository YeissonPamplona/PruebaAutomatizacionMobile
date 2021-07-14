package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrerSection {

    public static final Target EMAIL = Target.the("Email").located(By.id("form_email"));
    public static final Target PASS = Target.the("Password").located(By.id("form_password"));
    public static final Target REPEAT_PASS = Target.the("Password").located(By.id("form_password_confirm"));
    public static final Target DOCUMENT_TYPE = Target.the("Document type").located(By.id("form_document_type"));
    public static final Target CC_DOCUMENT = Target.the("Document type").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");
    public static final Target DOCUMENT_NUMBER = Target.the("Document number").located(By.id("form_identification"));
    public static final Target NAME = Target.the("Name").located(By.id("form_first_name"));
    public static final Target LAST_NAME = Target.the("Last name").located(By.id("form_last_name"));
    public static final Target BIRTH_DATE = Target.the("Birth date").located(By.id("form_birthday"));
    public static final Target GENDER = Target.the("Gender").located(By.id("form_gender"));
    public static final Target MASCULINO_GENDER = Target.the("Gender").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView");
    public static final Target BUTTON_SUSCRIPTION = Target.the("Gender").located(By.id("checkbox_newsletter_dafiti"));
    public static final Target SAVE_BUTTON = Target.the("Save button").located(By.id("register_button"));
}
