package ���α׷��ӽ�;

public class �ڸ������ϱ� {
    public static void main(String[] args) {
    int n = 1234;
    
    System.out.println(Solution(n));
    }
    
    static int Solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n));
        
        String[] str = sb.toString().split("");
        
        int sum = 0;
        
        for(String a : str) {
            sum += Integer.parseInt(a);
        }
       
        return sum;
    }
}
