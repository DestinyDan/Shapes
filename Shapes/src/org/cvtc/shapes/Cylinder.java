package org.cvtc.shapes;

public class Cylinder extends Shape implements Renderer {

    // fields
    private float radius = 0.0f;
    private float height = 0.0f;
    private float pi = (float) Math.PI;

    // constructor
    public Cylinder(Dialog messageBox, float radius, float height) {
    	super(messageBox);
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

    // render method
    @Override
    public void render() {
        messageBox.show("Dimensions " + "\n" +
                        "Radius: " + String.format("%.2f", this.radius) + "\n" +
                        "Height: " + String.format("%.2f", this.height) + "\n" +
                        "Surface Area: " + String.format("%.2f", this.surfaceArea()) + "\n" +
                        "Volume: " + String.format("%.2f", this.volume()),
                		"Cylinder");
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
