import java.util.Scanner;

/**
 * Created by Lenovo on 09.07.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.charAt(0) == word.charAt(word.length()-1)){
            System.out.println("Są takie same");
        }else{
            System.out.println("Nie są!");
        }
    }
}
