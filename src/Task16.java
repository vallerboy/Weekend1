import java.util.Random;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task16 {

    public static void main(String[] args) {
        Random rand = new Random();
        //int randInt = rand.nextInt(49 - 1) + 1;

        //System.out.println(randInt);

        for(int i = 1; i <= 6; i++) {
         System.out.println("Wynik losowania " + i + ": " + (rand.nextInt(49 - 1) + 1));
        }

    }

}
