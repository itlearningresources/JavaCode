// ------------------------------------
// Question 11
// ------------------------------------
import java.util.*;

public class CircleTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int n = scan.nextInt();
        Circle c1 = new Circle(n);

        Random random = new Random();
        final int MIN = 5;
        final int MAX = 15;
        int randomNumber = random.nextInt(MAX + 1 - MIN) + MIN;
        Circle c2 = new Circle(randomNumber);

        System.out.println("Area Circle 1 is : " + c1.area());
        System.out.println("Area Circle 2 is : " + c2.area());

        int temp = c2.getRadius();
        c2.setRadius(c1.getRadius());
        c1.setRadius(temp);

        System.out.println(c1);
        System.out.println(c2);

    }

}
