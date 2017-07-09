import java.util.Scanner;

/*
 * Created by Lenovo on 08.07.2017.
 */
// to komentarz liniowy
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz swój wiek: ");
        int age = scanner.nextInt();

        int promo = 0;

        if(age == 10 || age == 20 || age == 40){

        }

        switch (age){
            case 10: {
                promo = 10;
                break;
            }
            case 20: {
                promo = 20;
                break;
            }
            case 40: {
                promo = 50;
                break;
            }
            default: {
                System.out.println("Promocja Cię nie obejmuje!");
                break;
            }
        }
        System.out.println("Twój procent zniżki to: " + promo);

        ///////////// SKRÓCONY IF ////////////
        String message = age >= 18 ? "Możesz w to zagrać" : "Nie możesz grać";
        System.out.println(message);


    }

}
