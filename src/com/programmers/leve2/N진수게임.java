package com.programmers.leve2;

public class N진수게임 {

    public static void main(String[] args) {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;

        System.out.println(solution(n, t, m, p));
    }

    public static String solution(int n, int t, int m, int p) {
        StringBuilder convert = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        StringBuilder storage = new StringBuilder();

        int current = 0;
        int count = 0;

        storage.append(0);

        while (true) {
            if (storage.length() < (t-1) * m + p) {
                current = count++;
                convert.setLength(0);
                
                while (current > 0) {

                    if (current % n < 10) {
                        convert.append(current % n);
                    } else {
                        convert.append((char) (current % n - 10 + 'A'));
                    }
                    current /= n;
                }
                storage.append(convert.reverse());
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            answer.append(storage.charAt(p - 1));
            p += m;
        }
        return answer.toString();
    }
}
