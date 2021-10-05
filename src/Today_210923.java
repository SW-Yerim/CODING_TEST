import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Today_210923 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int count = 1;
        int range = 2;

        if (num == 1) {
            System.out.println(1);
        } else {
            while (num >= range) {
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }

    }
}
