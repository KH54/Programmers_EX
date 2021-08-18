package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        List<Integer> arr2 = new ArrayList<Integer>();

        if (arr.length <= 1) {
            answer = new int[] { -1 };
            return answer;
        }

        for(int i = 0; i < arr.length; i++) {
            arr2.add(arr[i]);
        }
        
        int min = 0;
        
        for(int i = 1; i < arr.length; i ++) {
            if(arr[min] > arr[i])
                min = i;
        }
        arr2.remove(min);
        
        for(int i = 0 ; i < arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }
            
        
        return answer;
    }
}
