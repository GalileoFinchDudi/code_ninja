package com.galileofinch.designpatterns.factory.factory;

import com.galileofinch.designpatterns.factory.button.Button;
import com.galileofinch.designpatterns.factory.button.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
