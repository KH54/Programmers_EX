package com.programmers.level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s));
    }
//문자열 더하기 x, 반복문안에 변수 x, comment
    public static String solution(String s) {
        String answer = "";

        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            String temp = strArr[i];
            for (int j = 0; j < temp.length(); j++) {
                if (j % 2 == 0)
                    answer += temp.toUpperCase().charAt(j);
                else
                    answer += temp.toLowerCase().charAt(j);
            }
            if (i != strArr.length - 1)
                answer += " ";
        }

        if (s.length() > answer.length())
            answer += s.substring(answer.length());

        return answer;
    }

    public static String solution2(String answer) {
        return answer;
    }
}
