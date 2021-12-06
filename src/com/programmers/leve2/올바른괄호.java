package com.programmers.leve2;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = ")()(";

        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            
            count += s.charAt(i) == '(' ? 1 : -1;

            if (count < 0) {
                return false;
            }
        }

        return count == 0 ? true : false;
    }
}

//    static boolean solution(String s) {
//        boolean answer = true;
//
//        Stack<Character> stack = new Stack<>();
//        char a = ' ';
//        
//        for (int i = 0; i < s.length(); i++) {
//            a = s.charAt(i);
//            
//            if (a == '(') {
//                stack.push(a);
//            } else {
//                if (!stack.empty()) {
//                    stack.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//        answer = stack.empty() ? true : false;
//        return answer;
//    }
//}
