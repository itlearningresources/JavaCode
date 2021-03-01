import java.util.Random;


public class TestRandom {

    public static int rand(int min, int max) {
        Random random = new Random();
        return random.nextInt(max + 1 - min) + min;
    }


    public static void main(String[] args) {

     int max = 0;
     int min = 0;
     

     int r = 0;
     Random random = new Random();

     for ( int i=0;i<20000;i++) {
         min = rand(0,100);
         max=  min+ rand( 0,rand(1,100) );

         r = random.nextInt(max + 1 - min) + min;
         System.out.println("[" + min + "," + max + "] " + r);


         r = (int) (Math.random()*(max-min))+min;
         System.out.println("[" + min + "," + max + "] " + r);
     
     
     }
}


}
