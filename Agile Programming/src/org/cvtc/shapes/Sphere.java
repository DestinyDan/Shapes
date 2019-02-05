package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape {

    // fields
    private float radius = 0;
    private float pi = Math.round(Math.PI);

    // constructor
    public Sphere(float radius) {
        this.radius = radius;

    }

    // abstract methods
    @Override
    public float surfaceArea() {
        return 4 * pi * (radius * radius);
    }

    @Override
    public float volume() {
        return (4/3) * pi * (radius * radius * radius);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "Dimensions \n" +
                        "Radius: " + radius + "\n" +
                        "Surface Area: " + surfaceArea() + "\n" +
                        "Volume: " + volume(),
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
