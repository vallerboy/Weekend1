import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Zadanie15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int winnerNumber = 132;

        System.out.println("Witaj w grze! Odgadnij liczbę!");

        int answer = 0;
        while(answer !=  winnerNumber){
            System.out.print("Podaj liczbę: ");
            answer = scanner.nextInt();

            if(answer > winnerNumber){
                System.out.println("Celuj trochę niżej");
            }else{
                System.out.println("Celuj trochę wyżej!");
            }
        }

        System.out.println("Wygrałeś!");
    }
}
