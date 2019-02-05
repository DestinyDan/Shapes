package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape {

    // fields
    private float radius = 0;
    private float height = 0;
    private float pi = Math.round(Math.PI);

    // constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;

    }

    // abstract methods
    @Override
    public float surfaceArea() {
        return 2 * (pi * (radius * radius)) + (2 * pi * radius) * height;
    }

    @Override
    public float volume() {
        return pi * (radius * radius) * height;
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "Dimensions \n" +
                        "Radius: " + radius + "\n" +
                        "Height: " + height + "\n" +
                        "Surface Area: " + surfaceArea() + "\n" +
                        "Volume: " + volume(),
                "Cylinder", JOptionPane.PLAIN_MESSAGE);
    }

    // getters & setters
    public float getRadius() {
        return radius;
    }
    private void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }
}
