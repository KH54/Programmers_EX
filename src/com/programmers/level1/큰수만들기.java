package com.programmers.level1;

public class 큰수만들기 {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        System.out.println(solution(number, k));
    }
    public static String solution(String number, int k) {
        String answer = "";

        String[] num = number.split("");
        int num2 = 0;
        int[] num3 = new int[number.length()];
        for(int i =0; i < number.length(); i++) {
            num2 = Integer.parseInt(num[i]);
            num3[i] = num2;
        }
        
        
        for(int i = 0; i < num.length; i++) {
            
        }
        
        return answer;
    }
}
