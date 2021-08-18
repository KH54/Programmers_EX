package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s));
    }

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

}
