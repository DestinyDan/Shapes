package org.cvtc.shapes;

import javax.swing.*;


public class Cuboid extends Shape {

    // fields
    private float width = 0.0f;
    private float height = 0.0f;
    private float depth = 0.0f;

    // constructor
    public Cuboid(float width, float height, float depth){
        this.width = width;
        this.height = height;
        this.depth = depth;

    }

    // abstract methods
    @Override
    public float surfaceArea() {
        return 2 * ((width * height) + (width * depth) + (height * depth));
    }

    @Override
    public float volume() {
        return (width * height * depth);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "Dimensions \n" +
                        "Width: " + String.format("%.2f", width) + "\n" +
                        "Height: " + String.format("%.2f", height) + "\n" +
                        "Depth: " + String.format("%.2f", depth) + "\n" +
                        "Surface Area: " + String.format("%.2f", surfaceArea()) + "\n" +
                        "Volume: " + String.format("%.2f", volume()),
                "Cuboid", JOptionPane.PLAIN_MESSAGE);
    }

    // getters & setters
    public float getWidth() {
        return width;
    }
    private void setWidth(int width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }
    private void setDepth(float depth) {
        this.depth = depth;
    }

}
