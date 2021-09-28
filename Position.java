import  java.util.*;
//  **************************************************************************
//  **  Position
//  **************************************************************************

public class Position {

    //---------------------------------------------+
    // Instance Variables (all private)
    //---------------------------------------------+
    private int xcoord;
    private int ycoord;
    private int zcoord;

    //---------------------------------------------+
    // No Argument Constructor
    //---------------------------------------------+
    public Position() {
    }

    //---------------------------------------------+
    // Argument Constructor
    //---------------------------------------------+
    public Position(int xcoord_in, int ycoord_in, int zcoord_in) {
        xcoord = xcoord_in;
        ycoord = ycoord_in;
        zcoord = zcoord_in;
    }

    //---------------------------------------------+
    // Getters and Setters
    //---------------------------------------------+
    public int getXcoord() {
        return xcoord;
    }
    public void setXcoord(int xcoord_in) {
        xcoord = xcoord_in;
    }
    public int getYcoord() {
        return ycoord;
    }
    public void setYcoord(int ycoord_in) {
        ycoord = ycoord_in;
    }
    public int getZcoord() {
        return zcoord;
    }
    public void setZcoord(int zcoord_in) {
        zcoord = zcoord_in;
    }

    //---------------------------------------------+
    // toString() Method
    //---------------------------------------------+
    public String toString() {
        final String sp = ", ";
        return "xcoord: " + xcoord +sp+ "ycoord: " + ycoord +sp+ "zcoord: " + zcoord;
    }

    //---------------------------------------------+
    // Main Method - Can be used to test the class
    //---------------------------------------------+
    public static void main(String[] args) {
        int i;
        String sz;
        Position instance = new Position();
        System.out.println("static void main(String[] args) of Position was called");

        //---------------------------------------------+
        // Class Variables
        //---------------------------------------------+
        // int		xcoord
        // int		ycoord
        // int		zcoord

        //---------------------------------------------+
        // Test setters
        //---------------------------------------------+
        System.out.println("Calling:  instance.setXcoord(46)");
        instance.setXcoord(46);
        System.out.println("Calling:  instance.setYcoord(49)");
        instance.setYcoord(49);
        System.out.println("Calling:  instance.setZcoord(57)");
        instance.setZcoord(57);

        //---------------------------------------------+
        // Test getters
        //---------------------------------------------+
        System.out.println("instance.toString():		" + instance);
        System.out.println("instance.getXcoord():        " + instance.getXcoord());
        System.out.println("instance.getYcoord():        " + instance.getYcoord());
        System.out.println("instance.getZcoord():        " + instance.getZcoord());

        //---------------------------------------------+
        // Instance Testers
        //---------------------------------------------+
        Position newobject1 = new Position(90, 87, 84);
        System.out.println("newobject1.toString():		" + newobject1);
        Position newobject2 = new Position(26, 35, 55);
        System.out.println("newobject2.toString():		" + newobject2);
        Position newobject3 = new Position(17, 74, 21);
        System.out.println("newobject3.toString():		" + newobject3);
        Position newobject4 = new Position(64, 35, 93);
        System.out.println("newobject4.toString():		" + newobject4);
        Position newobject5 = new Position(24, 87, 31);
        System.out.println("newobject5.toString():		" + newobject5);
        Position newobject6 = new Position(68, 41, 57);
        System.out.println("newobject6.toString():		" + newobject6);
        Position newobject7 = new Position(71, 87, 44);
        System.out.println("newobject7.toString():		" + newobject7);
        Position newobject8 = new Position(92, 16, 59);
        System.out.println("newobject8.toString():		" + newobject8);
        Position newobject9 = new Position(3, 82, 81);
        System.out.println("newobject9.toString():		" + newobject9);
        Position newobject10 = new Position(57, 9, 60);
        System.out.println("newobject10.toString():		" + newobject10);
        Position newobject11 = new Position(90, 32, 4);
        System.out.println("newobject11.toString():		" + newobject11);
        Position newobject12 = new Position(89, 91, 34);
        System.out.println("newobject12.toString():		" + newobject12);
        Position newobject13 = new Position(92, 78, 43);
        System.out.println("newobject13.toString():		" + newobject13);
        Position newobject14 = new Position(65, 9, 62);
        System.out.println("newobject14.toString():		" + newobject14);
        Position newobject15 = new Position(96, 32, 47);
        System.out.println("newobject15.toString():		" + newobject15);
        Position newobject16 = new Position(57, 98, 28);
        System.out.println("newobject16.toString():		" + newobject16);
    }
}
