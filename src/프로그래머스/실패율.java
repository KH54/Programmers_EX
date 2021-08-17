package 프로그래머스;

import java.util.ArrayList;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };

        System.out.println(solution(N, stages));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        int nonPass = 0;
        int pass = 0;
        int[] step = new int[N + 1];
        int rev = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if (stages[j] > j + 1) {
                    pass++;
                } else if (stages[j] == j) {
                    nonPass++;
                }
            }
            rev = nonPass / (pass+nonPass);
        }

        return answer;
    }
}
