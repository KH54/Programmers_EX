package ���α׷��ӽ�;

public class ���ڿ��ٷ��⺻ {
	public static void main(String args[]) {
		String s = "123456";

		solution(s);
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
		boolean answer = true;

		if (s.length() == 4 || s.length() == 6) {
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch < '0' || ch > '9')
					return false;
			}
			return true;
		} else
			return false;
	}
}