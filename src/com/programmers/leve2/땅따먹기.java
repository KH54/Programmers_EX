package com.programmers.leve2;

public class ¶¥µû¸Ô±â {

    public static void main(String[] args) {
        int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 }, { 5, 100, 100, 100 } };
        System.out.println(solution(land));
    }

    static int solution(int[][] land) {
        int answer = 0;
        int max = 0;
        int no = 0;
        int nno = 0;

        for (int i = 0; i < land.length; i++) {
            max = 0;
            for (int j = 0; j < 4; j++) {

                if (j == nno) {
                    continue;
                }
                if (max < land[i][j]) {
                    max = land[i][j];
                    no = j;
                }
            }
            nno = no;
            answer += max;
        }

        return answer;
    }
}
