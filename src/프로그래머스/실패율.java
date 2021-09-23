package 프로그래머스;

public class 실패율 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
        ;
        System.out.println(solution(N,stages));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};
        double fail = 0;
        int user = 0;
        
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] >= i) {
                    user++;
                    if(stages[j] == i) {
                        fail++;
                    }
                }
            }
            answer[i] = (int) (fail/user);
        }
        
        return answer;
    }
}
