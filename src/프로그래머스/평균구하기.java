package ���α׷��ӽ�;

public class ��ձ��ϱ� {
    public static void main(String[] args) {
        double[] arr = { 1, 2, 3, 4 };

        System.out.println(solution(arr));
    }

    public static double solution(double[] arr) {
        double answer = 0;
        
        for(int i = 0 ; i < arr.length; i++) {
            answer += arr[i];
        }
        answer = answer / arr.length;
        
        return answer;
    }
}
