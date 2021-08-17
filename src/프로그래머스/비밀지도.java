package ���α׷��ӽ�;

import java.util.Arrays;

public class ������� {

	public static void main(String args[]) {

		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		System.out.println(Arrays.toString(solution(n, arr1, arr2)));
	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
		
			String temp = Integer.toBinaryString(arr1[i] | arr2[i]);
			temp = String.format("%"+n+"s", temp);
			temp = temp.replaceAll("1", "#");
			temp = temp.replaceAll("0", " ");
			answer[i] = temp;
		}
		return answer;
	}
}
