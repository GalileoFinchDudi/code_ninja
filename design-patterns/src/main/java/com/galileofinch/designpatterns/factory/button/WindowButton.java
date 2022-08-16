package com.galileofinch.designpatterns.factory.button;

public class WindowButton implements Button {
    public void render() {
        System.out.println("window button render");
    }

    public void onClick() {
        System.out.println("window btton on click");
    }
}
