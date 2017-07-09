import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Zadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int arrayLength = scanner.nextInt();
        int[] arrayOfInts = new int[arrayLength];

        //Odczytujemy dane
        for(int i = 0; i < arrayLength; i++){
            System.out.print("Podaj liczbę do tablicy pod index " + i + " :");
            arrayOfInts[i] = scanner.nextInt();
        }

        //Drukujemy od konca
        for(int i = arrayLength - 1; i >= 0; i--) {
            System.out.println("Wynik: " + arrayOfInts[i]);
        }

    }
}
