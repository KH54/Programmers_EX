package 프로그래머스;

public class 숫자문자열과영단어 {
	public static void main(String args[]) {

		String s = "one4seveneight";
		solution(s);
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		String[] Word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] Num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		final String REGEX = "[0-9]+";

		for (int i = 0; i < Word.length; i++) {
			if (s.matches(REGEX)) {
				break;
			} else {
				s = s.replace(Word[i], Num[i]);
			}
		}

		return Integer.parseInt(s);
	}
}
