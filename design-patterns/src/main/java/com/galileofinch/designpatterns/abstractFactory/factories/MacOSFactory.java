package com.galileofinch.designpatterns.abstractFactory.factories;

import com.galileofinch.designpatterns.abstractFactory.buttons.Button;
import com.galileofinch.designpatterns.abstractFactory.buttons.MacOSButton;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.Checkbox;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements  GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
