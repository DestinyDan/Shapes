package org.cvtc.shapes;

import java.util.Scanner;

public class ShapeFactory {
	
	// Fields
	private Dialog dialog;

	// Getters & Setters
	public Dialog getDialog() {
		return dialog;
	}

	public void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
	}

	// Methods
	public Cuboid makeCuboid(float width, float height, float depth) {
		return new Cuboid(getDialog(), width, height, depth);
	}
	
	public Cylinder makeCylinder(float height, float radius) {
		return new Cylinder(getDialog(), height, radius);
	}
	
	public Sphere makeSphere(float radius) {
		return new Sphere(getDialog(), radius);
	}
}
