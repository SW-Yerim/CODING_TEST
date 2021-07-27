import java.util.Arrays;

public class Today_210727 {

    public static String solution(String[] participant, String[] completion) {

        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!(participant[i].equals(completion[i]))) {
                answer = participant[i];
                break;
            } else if (i == completion.length - 1) {
                answer = participant[i + 1];
            }
        }

        return answer;

//        // 비슷한 좋은 코드
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//
//        for (int i = 0; i < completion.length; i++) {
//            if (!(participant[i].equals(completion[i]))) {
//                return participant[i];
//            }
//        }
//        return participant[participant.length-1];

    }

    public static void main(String[] args) {

        // 예제 1
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"kiki", "eden"};
        // 예제 2
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        // 예제 3
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));

    }

}
