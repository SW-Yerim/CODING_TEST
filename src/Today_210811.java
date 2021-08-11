import java.util.Scanner;

public class Today_210811 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int length = scan.nextInt();
        String[][] q1 = new String[length][];

        for (int i = 0; i < length; i++) {
            String q = scan.next();
            q1[i] = q.split("");
        }

        for (int i = 0; i < length; i++) {
            int sum=0, grade=0;
            for (int j = 0; j < q1[i].length; j++) {
                sum++;
                if(q1[i][j].equals("X")) sum=0;
                grade+=sum;
            }
            System.out.println(grade);
        }

    }

}
