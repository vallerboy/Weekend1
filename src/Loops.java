/**
 * Created by Lenovo on 09.07.2017.
 */
public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 100;i++){
            if(i == 50){
                continue;
            }
            System.out.println(i);
        }

        int counter = 0;
        while (counter <= 50) {
            System.out.println("Witaj świecie!");
            counter++;
        }

        counter = 100;

        do{
            System.out.println("Hehe i tak się pokażę");
        }while (counter <= 50);
    }

}
