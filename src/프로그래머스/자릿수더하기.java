package ���α׷��ӽ�;

public class �ڸ������ϱ� {
    public static void main(String[] args) {
        int n = 123;
    }

    public int solution(int n) {

        StringBuilder sb = new StringBuilder(Integer.toString(n));

        String[] str = sb.toString().split("");

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += Integer.parseInt(str[i]);
        }
        return sum;
    }
}
