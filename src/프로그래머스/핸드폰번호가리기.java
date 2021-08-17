package 프로그래머스;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        String phone_number = "01093407587";
        
        System.out.println(solution(phone_number));
    }
    
    public static String solution(String phone_number) {

        char[] ch = phone_number.toCharArray();
        
        for(int i = 0 ; i < phone_number.length()-4; i++) {
            ch[i] = '*';
           
            
        }
        
        return String.valueOf(ch);
    }
}
