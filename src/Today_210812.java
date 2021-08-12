import java.util.Scanner;

public class Today_210812 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();

        for (int i = 0; i < length; i++) {
            int n = scan.nextInt();
            int[] arr = new int[n];

            double sum = 0;

            for (int j = 0; j < n; j++) {
                int val = scan.nextInt();
                arr[j] = val;
                sum += val;
            }

            sum /= n;
            double count = 0;

            for (int j = 0; j < n; j++) {
                if (sum < arr[j]) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/n)*100);

        }

    }
}
