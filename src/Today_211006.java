import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Today_211006 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());   // 층
            int W = Integer.parseInt(st.nextToken());   // 방
            int N = Integer.parseInt(st.nextToken());   // n번째 손님

            int result = 0;
            if (N % H == 0) {
                result = (H * 100) + (N / H);
            } else {
                result = ((N % H) * 100) + ((N / H) + 1);
            }
            System.out.println(result);
        }
        System.out.print(sb);
    }
}
