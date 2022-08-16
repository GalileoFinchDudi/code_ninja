package com.galileofinch.designpatterns.abstractFactory.factories;

import com.galileofinch.designpatterns.abstractFactory.buttons.Button;
import com.galileofinch.designpatterns.abstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
