public class Today_210726_2 {

    public static int solution(String s) {

        String[] array = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (int i = 0; i < 10 ; i++) {
            s = s.replace(array[i], num[i]);
        }

        int answer = Integer.parseInt(s);

        return answer;

    }

    public static void main(String[] args) {

        // 예제 1
        String s = "one4seveneight";
        // 예제 1
//        String s = "23four5six7";
        // 예제 1
//        String s = "2three45sixseven";
        // 예제 1
//        String s = "123";

        System.out.println(solution(s));

    }

}
