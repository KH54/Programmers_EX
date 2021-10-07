package com.programmers.level1;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        String[] strings = { "sun", "bed", "car" };
        int n = 1;

        System.out.println(solution(strings, n));
    }

    public static String[] solution(String[] strings, int n) {

//           List<String> list = new ArrayList<>();
//                   
//           for(int i = 0 ; i < strings.length; i++) {
//               list.add(strings[i].charAt(n) + strings[i]);
//           }
//           
//           Collections.sort(list);
//           String[] answer = new String[list.size()];
//           
//           for(int i = 0 ; i < list.size(); i++) {
//               answer[i] = list.get(i).substring(1, list.get(i).length());
//           }
//           return answer;

        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));

        return strings;
    }

}
