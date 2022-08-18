package com.galileofinch.designpatterns.prototype.shapes;

public class Circle extends Shape {

    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle shape2 = (Circle) object;
        return shape2.radius == radius;
    }
}
