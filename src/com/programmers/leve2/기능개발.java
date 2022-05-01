package com.programmers.leve2;

public class 기능개발 {

    public static void main(String[] args) {
        int[] progresses = { 90, 30, 55 };
        int[] speeds = { 1, 30, 5 };

        System.out.println(solution(progresses, speeds));

    }

    static public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        int cnt = 0;
        
        for(int i = 0; i < progresses.length; i++) {
            while(progresses[i] +(speeds[i] * cnt) < 100) {
                progresses[i] += speeds[i];
                cnt++;
            }
            
        }
            
            
            return answer;
    }
}
