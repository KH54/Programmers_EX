package com.programmers.leve2;

public class 스킬트리 {

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

        System.out.println(solution(skill, skill_trees));
    }

    public static int solution(String skill, String[] skill_trees) {
       int answer = 0;
        
        for (String tree : skill_trees) {
            String check = tree;
            
            for (int i = 0; i < tree.length(); i++) {
                String str = tree.substring(i, i+1);
                
                
                if (!skill.contains(str)) {
                    check = check.replace(str, "");
                }
            }
            
            if (skill.indexOf(check) == 0)
                answer++;
        }
 
        return answer;
    }
}
