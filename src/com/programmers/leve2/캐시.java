package com.programmers.leve2;

import java.util.ArrayList;
import java.util.List;

public class 캐시 {

    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };

    }

    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;

        List<String> list = new ArrayList<>();

        for (int i = 0; i < cities.length; i++) {
            if (!list.contains(cities[i])) {
                list.add(cities[i]);
            }
        }

        return answer;
    }

}
