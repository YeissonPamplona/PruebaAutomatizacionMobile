package com.sistecredito.pruebadafiti.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartSection {

    private CartSection() {
    }

    public static final Target PRODUCT = Target.the("Product add to cart").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView[1]");
}
