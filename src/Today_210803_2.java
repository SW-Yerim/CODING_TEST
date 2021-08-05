import java.util.Scanner;

public class Today_210803_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mul = scan.nextInt() * scan.nextInt() * scan.nextInt();
        int length = (int)(Math.log10(mul)+1);
        int num0=0, num1=0, num2=0, num3=0, num4=0, num5=0, num6=0, num7=0, num8=0, num9=0;

        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = mul%10;
            mul = mul/10;
        }
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (num[j] == i) {
                    count++;
                }
            }
            System.out.println(count);
        }

//        System.out.println(num0+"\n"+num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);
//
//        int[] num = new int[length];
//        for (int i = 0; i < length; i++) {
//            num[i] = mul%10;
//            mul = mul/10;
//            if (num[i] == 0) num0++;
//            else if (num[i] == 1) num1++;
//            else if (num[i] == 2) num2++;
//            else if (num[i] == 3) num3++;
//            else if (num[i] == 4) num4++;
//            else if (num[i] == 5) num5++;
//            else if (num[i] == 6) num6++;
//            else if (num[i] == 7) num7++;
//            else if (num[i] == 8) num8++;
//            else if (num[i] == 9) num9++;
//        }
//
//        System.out.println(num0+"\n"+num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9);

    }

}
