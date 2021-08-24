import java.util.Scanner;

public class Today_210823 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            String s = scan.next();
            for (int j = 0; j < s.length(); j++) {
                for (int z = 0; z < r; z++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
