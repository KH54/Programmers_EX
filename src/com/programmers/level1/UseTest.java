package com.programmers.level1;

import java.util.ArrayList;
import java.util.List;

// Test��
public class UseTest {
    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    list.add(j);
                }
            }
            result += list.size() % 2 == 0 ? left : -left;

        }

    }
}
