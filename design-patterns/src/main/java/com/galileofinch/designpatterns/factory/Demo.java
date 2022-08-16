package com.galileofinch.designpatterns.factory;

import com.galileofinch.designpatterns.factory.factory.Dialog;
import com.galileofinch.designpatterns.factory.factory.HtmlDialog;
import com.galileofinch.designpatterns.factory.factory.WindowDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {

        configure();
        runBusinessLogic();

    }

    static void configure() {
        if (System.getProperty("os.name").equals("Window")) {
            dialog = new WindowDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
