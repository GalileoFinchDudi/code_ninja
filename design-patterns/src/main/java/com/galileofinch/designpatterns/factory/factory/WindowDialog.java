package com.galileofinch.designpatterns.factory.factory;

import com.galileofinch.designpatterns.factory.button.Button;
import com.galileofinch.designpatterns.factory.button.WindowButton;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

}
