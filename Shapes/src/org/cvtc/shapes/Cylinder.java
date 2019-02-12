package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape {

    // fields
    private float radius = 0.0f;
    private float height = 0.0f;
    private float pi = (float) Math.PI;

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
                        "Radius: " + String.format("%.2f", radius) + "\n" +
                        "Height: " + String.format("%.2f", height) + "\n" +
                        "Surface Area: " + String.format("%.2f", surfaceArea()) + "\n" +
                        "Volume: " + String.format("%.2f", volume()),
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
