package com.programmers.leve2;

import java.util.Arrays;

public class 행렬테두리회전하기 {

    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;
        int[][] queries = { { 1, 1, 2, 2 }, { 2, 3, 3, 4 }, { 1, 2, 3, 4 }, { 1, 1, 3, 4 }, { 2, 2, 3, 5 } };

        System.out.println(Arrays.toString(solution(rows, columns, queries)));
    }

    static public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] arr = new int[rows][columns];
        int[][] arr2 = new int[rows][columns];
        int number = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr2[i][j] = number++;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int min_row = queries[i][0] - 1;
            int min_col = queries[i][1] - 1;
            int max_row = queries[i][2] - 1;
            int max_col = queries[i][3] - 1;

            answer[i] = Integer.MAX_VALUE;

            arr = copy(arr2);

            for (int j = min_row; j <= max_row; j++) {

                for (int k = min_col; k <= max_col; k++) {

                    // row가 최대일 때
                    if (j == max_row) {
                        if (k == max_col) {
                            arr2[j][k] = arr[j - 1][k];
                        } else {
                            arr2[j][k] = arr[j][k + 1];
                        }
                    }
                    // row가 최소일 때
                    else if (j == min_row) {
                        if (k == min_col) {
                            arr2[j][k] = arr[j + 1][k];
                        } else {
                            arr2[j][k] = arr[j][k - 1];
                        }
                    }
                    // 둘다 아닐 때
                    else if (k == max_col) {
                        arr2[j][k] = arr[j - 1][k];
                    } else if (k == min_col) {
                        arr2[j][k] = arr[j + 1][k];
                    }
                    answer[i] = arr[j][k] < answer[i] ? arr[j][k] : answer[i];
                }
            }
        }

        return answer;
    }

    public static int[][] copy(int[][] arr) {

        int[][] arr2 = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, arr2[i], 0, arr[0].length);
        }

        return arr2;
    }
}
