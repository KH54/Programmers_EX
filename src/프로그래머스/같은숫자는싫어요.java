package 프로그래머스;
import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어요 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> tmpList = new ArrayList<Integer>();
        
        int preNum = 10;
        for(int num : arr) {
            if( preNum != num) 
                tmpList.add(num);
            preNum =num;
        }
        
        int[] answer = new int[tmpList.size()];
        for(int i=0; i< answer.length; i++) {
            answer[i] = tmpList.get(i).intValue();
        }
        return answer;
    }
}
