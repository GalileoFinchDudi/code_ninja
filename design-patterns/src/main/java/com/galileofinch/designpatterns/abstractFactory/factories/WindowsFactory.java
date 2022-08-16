package com.galileofinch.designpatterns.abstractFactory.factories;

import com.galileofinch.designpatterns.abstractFactory.buttons.Button;
import com.galileofinch.designpatterns.abstractFactory.buttons.WindowsButton;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.Checkbox;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
