package org.cvtc.shapes;
import java.util.Scanner;

public class ShapesTest {

    public static void main(String[] args) {

        // import scanner for user input
        Scanner keyboard = new Scanner(System.in);

        	Dialog messageBox = new MessageBox();
        
	        // ask user for input
	        System.out.println("Please enter Width: ");
	        // store width in w
	        float w = positiveValidation(keyboard.nextFloat()); 
	        
	        System.out.println("Please enter Height: ");
	        // store height in h
	        float h = positiveValidation(keyboard.nextFloat());
	
	        System.out.println("Please enter Depth: ");
	        // store depth in d
	        float d = positiveValidation(keyboard.nextFloat());
	
	        System.out.println("Please enter Radius: ");
	        // store radius in r
	        float r = positiveValidation(keyboard.nextFloat());
	
	
	        // create shape objects
	        //-- cuboid
	        Cuboid newCuboid = new Cuboid(messageBox, w, h, d);
	        newCuboid.render();
	
	        //-- cylinder
	        Cylinder newCylinder = new Cylinder(messageBox, r, h);
	        newCylinder.render();
	
	        //-- sphere
	        Sphere newSphere = new Sphere(messageBox, r);
	        newSphere.render();
	        
    } //-- end main

    // float validation function
    private static float positiveValidation(float checkedFloat) {

        // import scanner
        Scanner keyboard = new Scanner(System.in);
        float validInteger = 0.0f;

	        // check if positive number
	        if (checkedFloat > 0.0f) {
	
	            return checkedFloat;	
	
	        } else {
	
	        	
	            while (checkedFloat <= 0.0f) {
	
	                System.out.println("Please enter a positive number");
	
	                validInteger = keyboard.nextFloat();
	
	                checkedFloat = validInteger;
	            } //-- end while
	
	            return validInteger;
	        } //-- end if
	 
    } //-- end positiveValidation
} //-- end ShapesTest
