package 프로그래머스;
import java.util.Arrays;

public class 로또번호생성기 {
    public static void main(String args[]) {
       int Mynum[] = new int[6];
       int RanNum = 0;
        
       
       for(int i = 0 ; i < Mynum.length; i++) {
           RanNum = (int)(Math.random()*44+1);
           Mynum[i] = RanNum;
           
           for(int j = 0 ; j < i ; j ++) {
               if(Mynum[j] == RanNum) {
                   i--;
                   break;
               }
           }
       }
       System.out.println(Arrays.toString(Mynum));
    }
}
