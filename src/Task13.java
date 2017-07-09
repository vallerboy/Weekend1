import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number =  scanner.nextInt();

        for(int i = 5; i <= number; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
