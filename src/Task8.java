import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int number = scanner.nextInt();

        System.out.println(word.substring(word.length()-number));
    }
}
