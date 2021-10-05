import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Today_210927 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = 0;  // 갯수
        int n = 0;      // 행 번호

        while (true) {
            n++;
            count+=n;
            if (num <= count) {
                if (n % 2 == 0) {
                    System.out.println((num-count+n)+"/"+(count-num+1));
                } else {
                    System.out.println((count-num+1)+"/"+(num-count+n));
                }
                break;
            }
        }


    }
}
