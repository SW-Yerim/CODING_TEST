import java.util.Arrays;
import java.util.Scanner;

public class Today_210803 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            array[i] = scan.nextInt();
        }

        int num = 0, max = array[0];
        for (int i = 0; i < 9; i++) {
            if (max <= array[i]) {
                max = array[i];
                num = i+1;
            }
        }

        System.out.println(max);
        System.out.println(num);

    }

}
