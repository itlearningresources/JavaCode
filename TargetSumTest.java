

public class TargetSumTest {

    public static int targetSum(String line, int first, int last, char target) {
        int len = line.length();
        int nRet = 0;
        if ( first < 0 )     nRet = -1;
        if ( first >= len )  nRet = -1;
        if ( last <= first ) nRet = -1;
        if ( last >= len )   nRet = -1;
        if ( nRet != -1 )
            for (int i=first;i<=last;i++)
                 if (line.charAt(i) == target) nRet++;

        return nRet;
    }


    public static void main(String[] args) {
        System.out.println(targetSum("Michael",0,6,'c'));
        System.out.println(targetSum("Mlchael",0,6,'l'));
        System.out.println(targetSum("computer science",4,13,'e'));
    }


}
