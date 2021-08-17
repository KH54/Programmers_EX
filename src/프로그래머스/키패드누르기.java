package 프로그래머스;

public class 키패드누르기 {

	public static void main(String args[]) {

		int numbers[] = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };

		String hand = "right";

		solution(numbers, hand);
		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		StringBuilder answer = new StringBuilder();

		int numL = 10, numR = 12;
		int disL = 0, disR = 0;

		for (int n : numbers) {
			if (n == 1 || n == 4 || n == 7) {
				answer.append("L");
				numL = n;
			} else if (n == 3 || n == 5 || n == 9) {
				answer.append("R");
				numR = n;
			} else {
				if (n == 0) n = 11;

				disL = (Math.abs(n - numL)) / 3 + (Math.abs(n - numL)) % 3;
				disR = (Math.abs(n - numR)) / 3 + (Math.abs(n - numR)) % 3;
				
				if(disL == disR) {
					if(hand.equals("left")) {
						answer.append("L");
						numR = n;
					} else {
						answer.append("R");
						numR = n;
					}
					
				} else if (disL < disR) {
					answer.append("L");
					numR = n;
				} else {
					answer.append("R");
					numL = n;
				}
			}
		}
		return answer.toString();
	}
}
