// ------------------------------------
// Question 11
// ------------------------------------
import java.util.*;

public class GradeTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a Score: ");
        int n = scan.nextInt();
        Grade entry = new Grade(n);

        final int MIN = 40;
        final int MAX = 100;
        int randomNumber = 0;
        int ct = 0;
        boolean more = true;
        Grade g2;

        while (more) {
            randomNumber = random.nextInt(MAX + 1 - MIN) + MIN;
            g2 = new Grade(randomNumber);
            if ( ! entry.equals(g2) ) 
                more = false;
            else {
                System.out.println( g2 );
                if ( g2.getNumGrade() > entry.getNumGrade() ) ct++;
            }

        }
        System.out.println( ct );


    }

}
