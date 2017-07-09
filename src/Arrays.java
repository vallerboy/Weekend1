/**
 * Created by Lenovo on 09.07.2017.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] arrayOfInts = {4, 414, 124124, 2, 512, 4, 2, 2, 2, 124, 124};

        int min = Integer.MAX_VALUE;
        for(int i : arrayOfInts) {
            if(i < min){
                min = i;
            }
        }
        System.out.println(min);


    }
}
