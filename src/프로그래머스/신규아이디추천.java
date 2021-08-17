package 프로그래머스;

import java.util.Scanner;

public class 신규아이디추천 {
	public static void mian(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		String new_id = input.next();
		
		solution(new_id);
	}
	public static String solution(String new_id) {
		String answer = "";

		new_id = new_id.toLowerCase(); // 1단계
		new_id = new_id.replaceAll("[^0-9a-z-_.]", ""); // 2단계
		new_id = new_id.replaceAll("[.]{2,}", "."); // 3단계

		if (new_id.startsWith(".") == true) {
			new_id = new_id.substring(1); // 4단계
		}
		if (new_id.endsWith(".") == true) {
			new_id = new_id.substring(0, new_id.length() - 1); // 4단계
		}
		if (new_id.equals("")) {
			new_id = "a"; // 5단계
		}
		if (new_id.length() > 15) {
			new_id = new_id.substring(0, 15);
		}
		if (new_id.endsWith(".") == true) {
			new_id = new_id.substring(0, new_id.length() - 1);
		}

		for (int i = 0; i < 2; i++) {
			if (new_id.length() > 0 && new_id.length() < 3) {
				new_id = new_id.concat(new_id.substring(new_id.length() - 1).toString());
			}
		}
		answer = new_id;
		System.out.println(new_id);
		return answer;
	}
}
