package com.galileofinch.designpatterns.factory.factory;

import com.galileofinch.designpatterns.factory.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();

}
