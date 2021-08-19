import java.util.Scanner;

public class Today_210819 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        int[] arr = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }

    }
}
