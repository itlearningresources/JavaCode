// ------------------------------------
// Question 11
// ------------------------------------
import java.util.*;

public class EVTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        final int MIN = 5;
        final int MAX = 15;
        int randomNumber = random.nextInt(MAX + 1 - MIN) + MIN;
        EV ev1 = new EV(randomNumber,"Tesla Model S");

        System.out.print("Enter Model: ");
        String m = scan.nextLine();
        System.out.print("Enter Range: ");
        int n = scan.nextInt();
        EV ev2 = new EV(n,m);

        int r1 = ev1.getRange();
        int r2 = ev2.getRange();
        String szOut = "same";
        if (r1 != r2)
            szOut = (r1>r2) ? ev1.toString() : ev2.toString();
        System.out.println( szOut );

        String m1 = ev1.getModel();
        String m2 = ev2.getModel();
        if (m1.equals(m2))
            System.out.println( "Models are the same" );


    }

}
