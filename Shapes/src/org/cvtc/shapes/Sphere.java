package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape {

    // fields
    private float radius = 0.0f;
    private float pi = (float) Math.PI;

    // constructor
    public Sphere(float radius) {
        this.radius = radius;

    }

	// abstract methods
    @Override
    public float surfaceArea() {
        return 4.0f * pi * (radius * radius);
    }

    @Override
    public float volume() {
        return (4.0f/3.0f) * pi * (radius * radius * radius);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "Dimensions \n" +
                        "Radius: " + String.format("%.2f", radius) + "\n" +
                        "Surface Area: " + String.format("%.2f", surfaceArea()) + "\n" +
                        "Volume: " + String.format("%.2f", volume()),
                "Sphere", JOptionPane.PLAIN_MESSAGE);
    }


    // getters & setters
    public float getRadius() {
        return radius;
    }
    private void setRadius(float radius) {
        this.radius = radius;
    }
}
