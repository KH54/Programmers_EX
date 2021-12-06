package com.programmers.leve2;

public class JadenCase문자열만들기 {

    public static void main(String[] args) {
        String s = "3people unFollowed me";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.toLowerCase().split("");
        boolean flag = true;

        for (String a : arr) {
            if (flag == true) {
                answer.append(a.toUpperCase());
            } else {
                answer.append(a);
            }
            flag = a.equals(" ") ? true : false;
        }
        return answer.toString();
    }

}
