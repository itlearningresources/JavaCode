// ------------------------------------
// Question 13
// ------------------------------------
import java.util.*;

public class StringTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a String: ");
        String sz1  = scan.next();
        System.out.print("Enter another String: ");
        String sz2  = scan.next();

        System.out.println( (sz1.length() + sz2.length()) / 2 );
        if ( sz1.equals(sz2) )
             System.out.println( "true" );
        else
             System.out.println( "false" );

        int randomNumber = 0;

        randomNumber = random.nextInt( (sz1.length()-1) + 1 - 0) + 0;
        char ch1 = sz1.charAt(randomNumber);

        randomNumber = random.nextInt( (sz2.length()-1) + 1 - 0) + 0;
        char ch2 = sz2.charAt(randomNumber);


        System.out.println(ch1 + "," + ch2);


    }

}
