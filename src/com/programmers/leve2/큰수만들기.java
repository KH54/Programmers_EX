package com.programmers.leve2;

import java.util.ArrayList;
import java.util.List;

public class 큰수만들기 {
    public static void main(String[] args) {
        String number = "1924";
        int k = 2;
        System.out.println(solution(number, k));
    }

    public static String solution(String number, int k) {
        String answer = "";

        String[] num = number.split("");

        StringBuilder num3 = new StringBuilder();
        String num4 = "";
        StringBuilder num5 = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            num3.setLength(0);
            num3.append(num[i]);
            
            for(int j = i+1; j <num.length; j++) {
                num3.append(num[j]);
                num4 = num3.toString();
                list.add(num4);
//                System.out.println(list);
                
                if(num3.length() >= num.length-k) {

                    System.out.println(num5.toString());
                }
            }
        } 
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.toString());

//        String[] num = number.split("");
//        int[] num2 = new int[num.length];
//        
//        for(int i = 0 ; i < num.length; i++) {
//           num2[i] = Integer.parseInt(num[i]);
//        }
//        
//        for(int i = 0; i < num.length; i++) {
//            int count= 0;
//            
//            
//            for(int j = i+1; j < num.length; j++) {
//                
//            }
//        }
//        
//        System.out.println(Arrays.toString(num2));

        return answer;
    }
}
