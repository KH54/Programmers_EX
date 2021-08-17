package 프로그래머스;

public class 콜라츠추측 {
    public static void main(String[] args) {
        int num = 6;

        System.out.println(solution(num));
    }

    public static long solution(long num) {
        long answer = 0;
        
        while( num != 1) {
            if(num % 2 ==0) {
                num = num / 2;
                answer++;
            } else {
                num = (num * 3)+1;
                answer++;
            }

        }
        if( answer == 500){
            answer =- 1;
        }
        return answer;
    }
}
