package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 폰켓몬 {
	public static void main(String args[]) {
		
		int nums[] = {3,1,2,3};
		
		solution(nums);
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums){
		int answer = 0;
		
		Arrays.sort(nums);
		ArrayList<Integer> list = new ArrayList();
		
		for(int choice : nums) {
			if(!list.contains(choice))
				list.add(choice);
		}
		answer = list.size();
		while(answer > nums.length / 2) {
			answer--;
		}
		
		return answer;
	}
}
