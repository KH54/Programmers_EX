package com.programmers.level1;

public class 김서방찾기 {
	public static void main(String args[]) {
		String[] seoul = {"Jane", "Kim"};
		
		solution(seoul);
		
		System.out.println(solution(seoul));
	}
	public static String solution(String[] seoul){
		String answer = "";
		
		for(int i = 0; i <seoul.length; i++) {
			if(seoul[i] == "Kim") {
				answer = "�輭���� " + i +"�� �ִ�.";
			}
		}
		
		return answer;
		
	}
}
