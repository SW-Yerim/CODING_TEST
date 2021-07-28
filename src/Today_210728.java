public class Today_210728 {

    public static int[] solution(int[] answers) {

        int arr1[] = {1, 2, 3, 4, 5};                   // 5개
        int arr2[] = {2, 1, 2, 3, 2, 4, 2, 5};          // 8개
        int arr3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};    // 10개

        int num1 = 0, num2 = 0, num3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) num1++;
            if (answers[i] == arr2[i % arr2.length]) num2++;
            if (answers[i] == arr3[i % arr3.length]) num3++;
        }

        if (num1 > num2 && num1 > num3) {           // num1
            return new int[]{1};
        } else if (num2 > num1 && num2 > num3) {     // num2
            return new int[]{2};
        } else if (num3 > num1 && num3 > num2) {     // num3
            return new int[]{3};
        } else if (num1 == num2 && num1 != num3) {    // num1, num2
            return new int[]{1,2};
        } else if (num1 == num3 && num1 != num2) {    // num1, num3
            return new int[]{1,3};
        } else if (num2 == num3 && num2 != num1) {    // num2, num3
            return new int[]{2,3};
        } else {                                      // num1, num2, num3
            return new int[]{1, 2, 3};
        }

    }

    public static void main(String[] args) {

        // 예제 1
        int[] answers = {1, 2, 3, 4, 5};
        // 예제 2
//        int[] answers = {1, 3, 2, 4, 2};

        for (int arr : solution(answers)) {
            System.out.println(arr);
        }

    }

}
