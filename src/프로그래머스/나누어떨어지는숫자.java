package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자 {
    public static void main(String[] args) {
        int[] arr = { 5, 9, 7, 10 };
        int divisor = 5;

        System.out.println(solution(arr, divisor));
    }

    public static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }
        Collections.sort(answer);

        if (answer.stream().count() == 0) {
            answer.add(-1);
        }

        return answer;
    }
}
