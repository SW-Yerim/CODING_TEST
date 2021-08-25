import java.util.Scanner;

public class Today_210824 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        int[] arr = new int[26];

        // A = 65 / a = 97
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                arr[s.charAt(i)-'A']++;
            } else {
                arr[s.charAt(i)-'a']++;
            }
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char)(i+65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
