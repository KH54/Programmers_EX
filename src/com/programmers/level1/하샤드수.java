package com.programmers.level1;

public class 하샤드수 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int n = x;
        
        while( x != 0) {
            sum += x %10;
            x /= 10;
        }
        
        if( n % sum == 0)
        return answer;
        
        return false;
    }
    
}
