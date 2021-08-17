package 프로그래머스;

public class 다트게임 {

	public static void main(String args[]) {

	}

	public int solution(String dartResult) {
		int answer = 0;

		String[] point = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] sdt = { "s", "d", "t" };
		String[] bonus = { "*", "#", "x" };

		String[] tmp = dartResult.split("");

		for (int i = 0; i < dartResult.length(); i++) {
			if (tmp[i].equals(point[i]) || tmp[i].equals(sdt[i]) || tmp[i].equals(bonus[i])) {
				
			}
		}
		
		return answer;
	}
}
