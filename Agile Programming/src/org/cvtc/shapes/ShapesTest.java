package org.cvtc.shapes;
import java.util.Scanner;

public class ShapesTest {

    public static void main(String[] args) {

        // import scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // ask user for input
        System.out.println("Please enter Width: ");
        // store width in w
        int w = positiveValidation(keyboard.nextInt());

        System.out.println("Please enter Height: ");
        // store height in h
        int h = positiveValidation(keyboard.nextInt());

        System.out.println("Please enter Depth: ");
        // store depth in d
        int d = positiveValidation(keyboard.nextInt());

        System.out.println("Please enter Radius: ");
        // store radius in r
        int r = positiveValidation(keyboard.nextInt());



        // create shape objects
        //-- cuboid
        Cuboid newCuboid = new Cuboid(w, h, d);
        newCuboid.render();

        //-- cylinder
        Cylinder newCylinder = new Cylinder(r, h);
        newCylinder.render();

        //-- sphere
        Sphere newSphere = new Sphere(r);
        newSphere.render();

    } //-- end main

    // validation function
    private static int positiveValidation(int checkedInteger) {

        // import scanner
        Scanner keyboard = new Scanner(System.in);
        int validInteger = 0;

        if (checkedInteger > 0) {

            return checkedInteger;

        } else {

            while (checkedInteger <= 0) {

                System.out.println("Please enter a positive number");

                validInteger = keyboard.nextInt();

                checkedInteger = validInteger;
            } //-- end while

            return validInteger;
        } //-- end if

    } //-- end positiveValidation

} //-- end ShapesTest
