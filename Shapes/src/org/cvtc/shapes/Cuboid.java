package org.cvtc.shapes;


public class Cuboid extends Shape implements Renderer {

    // fields
    private float width = 0.0f;
    private float height = 0.0f;
    private float depth = 0.0f;

    // constructor
    public Cuboid(Dialog messageBox, float width, float height, float depth){
    	super(messageBox);
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

    // render method
    @Override
    public void render() {
        messageBox.show("Dimensions " + "\n" +
                        "Width: " + String.format("%.2f", this.width) + "\n" +
                        "Height: " + String.format("%.2f", this.height) + "\n" +
                        "Depth: " + String.format("%.2f", this.depth) + "\n" +
                        "Surface Area: " + String.format("%.2f", this.surfaceArea()) + "\n" +
                        "Volume: " + String.format("%.2f", this.volume()),
                        "Cuboid");
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
