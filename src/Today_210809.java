import java.util.Scanner;

public class Today_210809 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double max = 0, sum = 0;

        for (int i = 0; i < length; i++) {
            int num = scan.nextInt();
            sum += num;
            if (max < num) max = num;
        }

        System.out.printf("%.2f", sum * 100 / max / length);

    }

}
