package ���α׷��ӽ�;

public class ��Ŭ��ç���� {
	
	public static void main(String args[]) {
	int money = 20;
	int price = 3;
	int count = 4;
	
		solution(price, money, count);
		System.out.println(solution(price, money, count));
	}
	 public static long solution(int price, int money, int count) {
		long pay_money = 0;   
		 long answer = -1;
	        
	        
	        for(int i = 1 ; i <= count; i++) {
	        	pay_money += price * i;
	        }
	        
	        if(pay_money < money) {
	        	answer = 0;
	        } else {
	        	answer = pay_money - money; 
	   	        }
	        
	        return answer;
	 }
}

