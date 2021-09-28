import  java.util.*;
//  **************************************************************************
//  **  Rectangle
//  **************************************************************************

public class Rectangle {

    //---------------------------------------------+
    // Instance Variables (all private)
    //---------------------------------------------+
    private float side1;
    private float side2;

    //---------------------------------------------+
    // No Argument Constructor
    //---------------------------------------------+
    public Rectangle() {
    }

    //---------------------------------------------+
    // Argument Constructor
    //---------------------------------------------+
    public Rectangle(float side1_in, float side2_in) {
        side1 = side1_in;
        side2 = side2_in;
    }

    //---------------------------------------------+
    // Getters and Setters
    //---------------------------------------------+
    public float getSide1() {
        return side1;
    }
    public void setSide1(float side1_in) {
        side1 = side1_in;
    }
    public float getSide2() {
        return side2;
    }
    public void setSide2(float side2_in) {
        side2 = side2_in;
    }

    //---------------------------------------------+
    // toString() Method
    //---------------------------------------------+
    public String toString() {
        final String sp = ", ";
        return "side1: " + side1 +sp+ "side2: " + side2;
    }

    //---------------------------------------------+
    // Main Method - Can be used to test the class
    //---------------------------------------------+
    public static void main(String[] args) {
        int i;
        String sz;
        Rectangle instance = new Rectangle();
        System.out.println("static void main(String[] args) of Rectangle was called");

        //---------------------------------------------+
        // Class Variables
        //---------------------------------------------+
        // float	side1
        // float	side2

        //---------------------------------------------+
        // Test setters
        //---------------------------------------------+
        System.out.println("Calling:  instance.setSide1(27.10f)");
        instance.setSide1(27.10f);
        System.out.println("Calling:  instance.setSide2(44.95f)");
        instance.setSide2(44.95f);

        //---------------------------------------------+
        // Test getters
        //---------------------------------------------+
        System.out.println("instance.toString():		" + instance);
        System.out.println("instance.getSide1():         " + instance.getSide1());
        System.out.println("instance.getSide2():         " + instance.getSide2());

        //---------------------------------------------+
        // Instance Testers
        //---------------------------------------------+
        Rectangle newobject1 = new Rectangle(64.5f, 92.85f);
        System.out.println("newobject1.toString():		" + newobject1);
        System.out.println((new Rectangle(64.5f, 92.85f)).toString(););
        Rectangle newobject2 = new Rectangle(94.2f, 46.81f);
        System.out.println("newobject2.toString():		" + newobject2);
        System.out.println((new Rectangle(94.2f, 46.81f)).toString(););
        Rectangle newobject3 = new Rectangle(46.48f, 44.85f);
        System.out.println("newobject3.toString():		" + newobject3);
        System.out.println((new Rectangle(46.48f, 44.85f)).toString(););
        Rectangle newobject4 = new Rectangle(11.74f, 46.41f);
        System.out.println("newobject4.toString():		" + newobject4);
        System.out.println((new Rectangle(11.74f, 46.41f)).toString(););
        Rectangle newobject5 = new Rectangle(57.33f, 99.22f);
        System.out.println("newobject5.toString():		" + newobject5);
        System.out.println((new Rectangle(57.33f, 99.22f)).toString(););
        Rectangle newobject6 = new Rectangle(50.94f, 87.92f);
        System.out.println("newobject6.toString():		" + newobject6);
        System.out.println((new Rectangle(50.94f, 87.92f)).toString(););
        Rectangle newobject7 = new Rectangle(79.80f, 16.92f);
        System.out.println("newobject7.toString():		" + newobject7);
        System.out.println((new Rectangle(79.80f, 16.92f)).toString(););
        Rectangle newobject8 = new Rectangle(91.0f, 7.57f);
        System.out.println("newobject8.toString():		" + newobject8);
        System.out.println((new Rectangle(91.0f, 7.57f)).toString(););
        Rectangle newobject9 = new Rectangle(74.28f, 36.3f);
        System.out.println("newobject9.toString():		" + newobject9);
        System.out.println((new Rectangle(74.28f, 36.3f)).toString(););
        Rectangle newobject10 = new Rectangle(30.80f, 41.63f);
        System.out.println("newobject10.toString():		" + newobject10);
        System.out.println((new Rectangle(30.80f, 41.63f)).toString(););
        Rectangle newobject11 = new Rectangle(47.16f, 22.71f);
        System.out.println("newobject11.toString():		" + newobject11);
        System.out.println((new Rectangle(47.16f, 22.71f)).toString(););
        Rectangle newobject12 = new Rectangle(77.13f, 61.21f);
        System.out.println("newobject12.toString():		" + newobject12);
        System.out.println((new Rectangle(77.13f, 61.21f)).toString(););
        Rectangle newobject13 = new Rectangle(18.96f, 60.94f);
        System.out.println("newobject13.toString():		" + newobject13);
        System.out.println((new Rectangle(18.96f, 60.94f)).toString(););
        Rectangle newobject14 = new Rectangle(82.37f, 81.44f);
        System.out.println("newobject14.toString():		" + newobject14);
        System.out.println((new Rectangle(82.37f, 81.44f)).toString(););
        Rectangle newobject15 = new Rectangle(33.2f, 98.50f);
        System.out.println("newobject15.toString():		" + newobject15);
        System.out.println((new Rectangle(33.2f, 98.50f)).toString(););
        Rectangle newobject16 = new Rectangle(85.2f, 44.77f);
        System.out.println("newobject16.toString():		" + newobject16);
        System.out.println((new Rectangle(85.2f, 44.77f)).toString(););

        //---------------------------------------------+
        // Instance Testers II
        //---------------------------------------------+
        System.out.println((new Rectangle(13.5f, 96.80f)).toString(););
        System.out.println((new Rectangle(37.29f, 52.53f)).toString(););
        System.out.println((new Rectangle(76.75f, 53.99f)).toString(););
        System.out.println((new Rectangle(37.43f, 77.73f)).toString(););
        System.out.println((new Rectangle(67.97f, 66.5f)).toString(););
        System.out.println((new Rectangle(17.97f, 51.58f)).toString(););
        System.out.println((new Rectangle(22.78f, 20.11f)).toString(););
        System.out.println((new Rectangle(70.36f, 42.23f)).toString(););
        System.out.println((new Rectangle(17.42f, 12.67f)).toString(););
        System.out.println((new Rectangle(69.91f, 62.97f)).toString(););
        System.out.println((new Rectangle(22.83f, 62.65f)).toString(););
        System.out.println((new Rectangle(49.21f, 30.4f)).toString(););
        System.out.println((new Rectangle(58.12f, 98.82f)).toString(););
        System.out.println((new Rectangle(81.19f, 85.38f)).toString(););
        System.out.println((new Rectangle(9.38f, 86.53f)).toString(););
        System.out.println((new Rectangle(92.64f, 21.99f)).toString(););
    }
}
