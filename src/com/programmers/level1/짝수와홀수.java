package com.programmers.level1;

public class Â¦¼ö¿ÍÈ¦¼ö {
    public static void main(String[] args) {
        int num = 3;
        
        System.out.println(num);
    }

    public String solution(int num) {
        String answer = "";
        
        if( num % 2 == 0) {
            answer = "Even";
        } else
            answer = "Odd";
        
        return answer;
    }
}
