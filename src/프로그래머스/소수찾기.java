package 프로그래머스;

public class 소수찾기 {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] numbers = new int[n+1];
        
        for(int i =2; i <=n ; i++) numbers[i]=i;
        
        
        return answer;
    }
}
