
// ------------------------------------
// Question 10
// ------------------------------------
public class Circle {

    private int radius;
    private final int DEFAULTRADIUS = 12;

    public Circle(int r) {
        radius = r;
    }

    public Circle() {
        radius = DEFAULTRADIUS;
    }
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
    
    public String toString() {
        return Integer.toString(radius);
    }
    
    public double area()  {
        return Math.PI * (radius * radius);
    }
    
}
// ------------------------------------
// Question 11
// ------------------------------------
public class CircleTest {

    private int radius;
    private final int DEFAULTRADIUS = 12;

    public Circle(int r) {
        radius = r;
    }

    public Circle() {
        radius = DEFAULTRADIUS;
    }
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
    
    public String toString() {
        return Integer.toString(radius);
    }
    
    public double area()  {
        return Math.PI * (radius * radius);
    }
    
}
