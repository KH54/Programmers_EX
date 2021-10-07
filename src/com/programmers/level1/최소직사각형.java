package com.programmers.level1;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };

        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        
        int maxW = 0;
        int maxH = 0;
        int temp = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxW = maxW < sizes[i][0] ? sizes[i][0] : maxW;
            maxH = maxH < sizes[i][1] ? sizes[i][1] : maxH;
        }

        return maxW * maxH;
    }
}
