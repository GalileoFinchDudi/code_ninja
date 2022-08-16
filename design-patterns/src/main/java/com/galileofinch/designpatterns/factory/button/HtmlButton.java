package com.galileofinch.designpatterns.factory.button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("html button render");
    }

    public void onClick() {
        System.out.println("html button on click");
    }
}
