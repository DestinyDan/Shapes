package org.cvtc.shapes;

import javax.swing.*;


public class Cuboid extends Shape {

    // fields
    private float width;
    private float height;
    private float depth;

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
                        "Width: " + width + "\n" +
                        "Height: " + height + "\n" +
                        "Depth: " + depth + "\n" +
                        "Surface Area: " + surfaceArea() + "\n" +
                        "Volume: " + volume(),
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
