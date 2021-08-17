package ���α׷��ӽ�;

import java.util.*;

public class ����������¼��� {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 6 };
		int divisor = 10;

		solution(arr, divisor);
	}

	public static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i]%divisor) == 0) {
				list.add(arr[i]);
			}
			if(list.isEmpty()) {
				list.add(-1);
			}
		}
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		
		return answer;
	}
}
