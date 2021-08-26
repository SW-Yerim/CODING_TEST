import java.io.IOException;

public class Today_210826 {

    public static void main(String[] args) throws IOException {

        int n1 = 0;
        int n2 = 0;

        n1 += ( System.in.read() - 48 );
        n1 += ( System.in.read() - 48 ) * 10;
        n1 += ( System.in.read() - 48 ) * 100;

        System.in.read();

        n2 += ( System.in.read() - 48 );
        n2 += ( System.in.read() - 48 ) * 10;
        n2 += ( System.in.read() - 48 ) * 100;

        System.out.println(n1 > n2 ? n1 : n2);

//        int n1 = scan.nextInt();
//        int n2 = scan.nextInt();
//        int[] arr1 = new int[3];
//        int[] arr2 = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            arr1[i] = n1 % 10;
//            arr2[i] = n2 % 10;
//            n1 /= 10;
//            n2 /= 10;
//        }
//
//        int new1 = arr1[0]*100+arr1[1]*10+arr1[2];
//        int new2 = arr2[0]*100+arr2[1]*10+arr2[2];
//
//        System.out.println(new1 > new2 ? new1 : new2);
//

    }
}
