import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nextNumber = scanner.nextInt();

        String stringNumber = String.valueOf(nextNumber);
        System.out.println(stringNumber.charAt(stringNumber.length()-1));




    }
}
