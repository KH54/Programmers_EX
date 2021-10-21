package com.programmers.level1;

import java.util.regex.Pattern;

public class 다트게임 {

    public static void main(String args[]) {
        String dartResult = "10D10T*10S";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;

        String[] tmp = dartResult.split("");
        int cac = 0;
        int count = 0;
        int[] sum = new int[3];

        for (int i = 0; i < dartResult.length(); i++) {
            if (Pattern.matches("^[0-9]*$", tmp[i])) {

                if (tmp[i + 1].equals("0")) {
                    cac = 10;
                    i++;
                } else {
                    cac = Integer.parseInt(tmp[i]);
                }
            } else if (Pattern.matches("^[A-Z]*$", tmp[i])) {
                switch (tmp[i]) {
                case "S":
                    sum[count] = cac;
                    count++;
                    break;
                case "D":
                    cac = (int) Math.pow(cac, 2);
                    sum[count] = cac;
                    count++;

                    break;
                case "T":
                    cac = (int) Math.pow(cac, 3);
                    sum[count] = cac;
                    count++;
                    break;
                }
            } else if (Pattern.matches("^[*,#]$", tmp[i])) {
                switch (tmp[i]) {
                case "*":
                    if (i == 2) {
                        sum[0] = sum[0] * 2;
                    } else if (i == 4 || i == 5) {
                        sum[0] = sum[0] * 2;
                        sum[1] = sum[1] * 2;
                    } else {
                        sum[1] = sum[1] * 2;
                        sum[2] = sum[2] * 2;
                    }
                    break;
                case "#":
                    if (i == 2) {
                        sum[0] = sum[0] * (-1);
                    } else if (i == 4 || i == 5) {
                        sum[1] = sum[1] * (-1);
                    } else {
                        sum[2] = sum[2] * (-1);
                    }
                    break;
                default:
                    break;
                }
            }
        }
        for (int cc : sum) {
            answer += cc;
        }
        return answer;
    }
}
