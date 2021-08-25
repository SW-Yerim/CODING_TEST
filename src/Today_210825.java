import java.util.Scanner;

public class Today_210825 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        String[] arr = s.split(" ");

        if (arr.length == 0) {
            System.out.println(0);
        } else if (arr[0].equals("") && arr.length > 0) {
            System.out.println(arr.length-1);
        } else {
            System.out.println(arr.length);
        }

    }
}
