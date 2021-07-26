public class Today_210726 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int zero = 0;
        int num = 0;

        for (int i : lottos) {
            if (i == 0) {
                zero++;
            } else {
                for (int j : win_nums) {
                    if (i == j) {
                        num++;
                        break;
                    }
                }
            }
        }

        if (zero == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else if (num == 0) {
            if (zero == 0) {
                answer[0] = 6;
            } else {
                answer[0] = 7 - zero;
            }
            answer[1] = 6;
        } else {
            answer[0] = 7 - (num + zero);
            answer[1] = 7 - num;
        }

        return answer;
    }

    public static void main(String[] args) {

        // 예제 1
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        // 예제 2
//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};
        // 예제 3
//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] answer = solution(lottos, win_nums);

        for (int i = 0; i < 2; i++) {
            System.out.println("answer[" + i + "] : " + answer[i]);
        }
    }

}
