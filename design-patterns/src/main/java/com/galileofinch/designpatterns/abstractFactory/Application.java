package com.galileofinch.designpatterns.abstractFactory;

import com.galileofinch.designpatterns.abstractFactory.buttons.Button;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.Checkbox;
import com.galileofinch.designpatterns.abstractFactory.factories.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
