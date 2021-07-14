package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeSection {
    public static final Target COUNTRY_SELECTION = Target.the("Selected country").located(By.id("image_flag_co"));
    public static final Target MAN_CATEGORY = Target.the("Man category").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView");
}
