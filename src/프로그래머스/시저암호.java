package ���α׷��ӽ�;

public class ������ȣ {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;
        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        StringBuilder sb= new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z')
                    ch -= 26;
            } else if ( ch >='A' && ch <= 'Z') {
                ch = (char) (ch +n);
                if(ch > 'Z') {
                    ch -=26;
                }
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
