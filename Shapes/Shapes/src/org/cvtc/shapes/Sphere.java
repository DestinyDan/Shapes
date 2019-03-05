package org.cvtc.shapes;

public class Sphere extends Shape implements Renderer {

    // fields
    private float radius = 0.0f;
    private float pi = (float) Math.PI;


    // constructor
    public Sphere(Dialog messageBox, float radius) {
    	super(messageBox);
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

    // render method
    public void render() {
    	messageBox.show("Dimensions " + "\n" +
		                "Radius: " + String.format("%.2f", this.radius) + "\n" +
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
}
