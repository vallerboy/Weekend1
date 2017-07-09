import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Zadanie17 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        final String finalPassword = "Polska";
        String userTypedPassword = "";
        do {
            System.out.print("Wpisz hasło: ");
            userTypedPassword = scaner.nextLine();
        } while (!userTypedPassword.equals(finalPassword));

        if(finalPassword.equals("Polska"))
            System.out.println("Hasło to Polska");

        System.out.println("Udało Ci się zalogować");
    }
}
