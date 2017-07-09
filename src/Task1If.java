import java.util.Scanner;

/**
 * Created by Lenovo on 08.07.2017.
 */
public class Task1If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if( a > b && a < c || a > c && a < b){
            System.out.println(a);
        }else if(b > a && b < c || b < a && b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }


    }
}
