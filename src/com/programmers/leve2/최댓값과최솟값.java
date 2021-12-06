package com.programmers.leve2;

import java.util.Arrays;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String[] arrStr = s.split(" ");
        int[] arrInt = new int[arrStr.length];
        int i = 0;
        for (String part : arrStr) {
            arrInt[i] = Integer.parseInt(part);
            i++;
        }

        StringBuffer sb = new StringBuffer();
        sb.append(Arrays.stream(arrInt).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(arrInt).max().getAsInt());

        return sb.toString();

    }
//    public static String solution(String s) {
//  String answer = "";
//
//  String[] arr = s.split(" ");
//
//  List<Integer> list = new ArrayList<>();
//
//  int num = 0;
//  for (String a : arr) {
//      num = Integer.parseInt(a);
//      list.add(num);
//  }
//  int max = list.stream().max(Integer::compare).orElse(-1);
//  int min = list.stream().min(Integer::compare).orElse(-1);
//
//  answer = min + " " + max;
//
//  return answer;
//  }
}
