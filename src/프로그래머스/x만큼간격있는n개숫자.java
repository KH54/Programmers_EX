package ���α׷��ӽ�;

import java.util.Arrays;

public class x��ŭ�����ִ�n������ {
    public static void main(String args[]) {
        int x = -4;
        int n = 2;
        
        System.out.println(Arrays.toString(solution(x,n)));
    }
    
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0 ; i < n; i ++) {
            answer[i] = x*(i+1);
        }
        
        return answer;
    }
}
