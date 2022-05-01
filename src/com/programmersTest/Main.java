package com.programmersTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

//        int[] arr = { 1, 52, 125, 10, 25, 201, 244, 192, 128, 23, 203, 98, 154, 255 };
        int[] arr = { 1, 1, 254, 254, 1, 1, 254, 254, 254 };
        // a-b 차이의 최솟값을 구하는거임
        // 254 a -> a 5개 b -> 4개 -> 1개
//int[] arr = { 100, 100, 100, 100, 100, 100, 100, 100, 100};
//        int[] arr = {100, 1 };
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        Arrays.sort(arr);

        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        if (set.size() == 2) {
            return arr[0] + 1;
        } else if (set.size() == 1) {
            return arr[0];
        }

        int index = Math.abs(Arrays.binarySearch(arr, arr[arr.length / 2]));

        int prevThreshold = cntThres(arr, arr[index - 1]);
        int Threshold = cntThres(arr, arr[index]);

        if (Threshold == prevThreshold) {
            return arr[index - 1] + 1;
        } else if (Threshold == -1) {
            return arr[index];
        } else {
            return arr[index - 1] + 1;
        }
    }

    static public int cntThres(int[] arr, int thres) {

        // 중간값 보다 같거나 큰 값
        int a = 0;
        // 중간값 보다 작은 값
        int b = 0;

        int cnt = 0;
        thres++;
        for (int i : arr) {
            if (thres < i) {
                a++;
            } else if (thres > i) {
                b++;
            } else if (thres == i) {
                cnt++;
            }
        }
        if (cnt == a && cnt != 0) {
            return -1;
        } else {
            return Math.abs(a - b);
        }
    }

}
