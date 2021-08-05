import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;

public class Today_210805 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            h.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(h.size());


//        int[] arr = new int[10];
//
//        for (int i = 0; i < 10; i++) {
//            arr[i] = scan.nextInt() % 42;
//        }
//        for (int i = 0; i < 10; i++) {
//            for (int j = i+1; j < 10; j++) {
//                if (arr[j] >= 0 && arr[i] == arr[j]) {
//                    arr[j] = -1;
//                }
//            }
//        }
//        int answer = 0;
//        for (int i = 0; i < 10; i++) {
//            if (arr[i] >= 0) {
//                answer++;
//            }
//        }
//        System.out.println(answer);

    }

}
