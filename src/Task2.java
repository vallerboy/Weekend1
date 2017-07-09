import java.util.Scanner;

/**
 * Created by Lenovo on 08.07.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;

        // Sposób bez zmiennej pomocniczej
         a += b;
         b = a - b;
         a = a - b;

         //Zmienna pomocnicza
         c = a;
         a = b;
         b = c;

         System.out.println("A: " + a + " B: " + b);
    }
}
