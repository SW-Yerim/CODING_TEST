import java.util.Scanner;

public class Today_210817 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        String num = scan.next();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += num.charAt(i)-48;
        }

        System.out.println(sum);


//        String num = scan.next();
//        String[] arr = num.split("");
//
//        for (int i = 0; i < length; i++) {
//            sum += Integer.parseInt(arr[i]);
//        }
//
//        System.out.println(sum);

    }
}
