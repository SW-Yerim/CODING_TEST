import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Today_210902 {

    public static void main(String[] args) throws IOException {

//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        if (s.contains("c=")) s = s.replaceAll("c=", "A");
        if (s.contains("c-")) s = s.replaceAll("c-", "A");
        if (s.contains("dz=")) s = s.replaceAll("dz=", "A");
        if (s.contains("d-")) s = s.replaceAll("d-", "A");
        if (s.contains("lj")) s = s.replaceAll("lj", "A");
        if (s.contains("nj")) s = s.replaceAll("nj", "A");
        if (s.contains("s=")) s = s.replaceAll("s=", "A");
        if (s.contains("z=")) s = s.replaceAll("z=", "A");

        int result = s.length();

        System.out.println(result);

    }
}
