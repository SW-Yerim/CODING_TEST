import java.util.Arrays;

public class Today_210727_2 {

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for(int a = 0; a < commands.length; a++) {
            int i = commands[a][0] - 1;
            int j = commands[a][1];
            int k = commands[a][2];

            int[] nArr = new int[j-i+1];
            int n = 0;

            for(int b = i; b < j; b++) {
                nArr[n] = array[b];
                n++;
            }
            Arrays.sort(nArr);
            answer[a] = nArr[k];
        }

        return answer;


//        // 전에 풀었던 코드
//        int[] answer = {};
//
//        int length = 0;
//        answer=new int[commands.length];
//
//        for (int i = 0; i < commands.length; i++) {
//
//            length = commands[i][1] - commands[i][0] + 1;
//
//            int[] arr = new int[length];
//
//            for (int j = 0; j < length; j++) {
//                arr[j] = array[commands[i][0] + j - 1];
//            }
//
//            Arrays.sort(arr);
//
//            answer[i]=arr[commands[i][2] - 1];
//        }
//
//        return answer;

    }

    public static void main(String[] args) {

        // 예제 1
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7 ,3}};

        System.out.println(solution(array, commands));

    }

}
