import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.charAt(0) >= 48 && word.charAt(0) <= 57){
            System.out.println("To jest cyfra");
        }else{
            System.out.println("Nie zaczyna sie");
        }
    }
}
