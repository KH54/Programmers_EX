package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ½ÇÆÐÀ² {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = { 2, 0, 0, 0, 0, 0, 0, 0 };
        ;
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        double failPer = 0.0;
        List<Rate> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            double challenger = 0.0;
            double passer = 0.0;

            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i + 1) {
                    passer++;
                }
                if (stages[j] == i + 1) {
                    challenger++;
                }
            }
            failPer = challenger / passer;

            list.add(new Rate(i+1, failPer));
        }

        Collections.sort(list, ((r1, r2) -> Double.compare(r2.rate, r1.rate)));

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).idx;
        }
        return answer;
    }
}

class Rate {
    int idx;
    double rate;

    public Rate(int idx, double rate) {
        this.idx = idx;
        this.rate = rate;
    }
}
