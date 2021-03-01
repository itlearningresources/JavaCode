

public class CompStringsTest {

    public static int compStrings(String string1, String string2) {
        int ct = 0;
        int len1 = string1.length();
        int len2 = string2.length();
        int shortlen = (len1 <= len2) ? len1 : len2;
        for ( int i=0;i<shortlen;i++) {
            if (string1.charAt(i) == string2.charAt(i)) ct++;
        }
        return ct;

    }


    public static void main(String[] args) {
        System.out.println(compStrings("hello","goodbye")); //output: 0
        System.out.println(compStrings("hello","he"));      //output: 2
        System.out.println(compStrings("race","madam"));    //output: 1
    }


}
