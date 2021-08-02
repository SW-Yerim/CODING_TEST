import java.util.Arrays;
import java.util.Scanner;

public class Today_210802 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[0] + " " + array[n-1]);

//        int min = array[0], max = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//            if (min >= array[i]) {
//                min = array[i];
//            }
//            if (max <= array[i]) {
//                max = array[i];
//            }
//        }
//
//        System.out.println(min + " " + max);

    }

}
