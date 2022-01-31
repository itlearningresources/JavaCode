// The most common usage of Scanner is to read primitive types and String form the keyboard (System.in), as follows:

import java.util.Scanner;

public class TestScannerSystemIn {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
 
      System.out.print("Enter an integer: ");
      int anInt = in.nextInt();
      System.out.println("You entered " + anInt);
 
      System.out.print("Enter a floating-point number: ");
      double aDouble = in.nextDouble();
      System.out.println("You entered " + aDouble);
 
      System.out.print("Enter 2 words: ");
      String word1 = in.next();  // read a string delimited by white space
      String word2 = in.next();  // read a string delimited by white space
      System.out.println("You entered " + word1 + " " + word2);
 
      in.nextLine();   // flush the "enter" before the next readLine()
 
      System.out.print("Enter a line: ");
      String line = in.nextLine();  // read a string up to line delimiter
      System.out.println("You entered " + line);
   }
}
