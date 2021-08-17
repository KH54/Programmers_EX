package 프로그래머스;

import java.util.Arrays;

public class x만큼간격있는n개숫자 {
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
