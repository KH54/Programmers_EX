package com.programmers.leve2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class «¡∏∞≈Õ {
    public static void main(String[] args) {
        int[] priorities = { 2, 1, 3, 2 };
        int location = 2;

        solution(priorities, location);
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities) {
            queue.add(i);
            System.out.println(queue.peek());
        }
        
        System.out.println(queue);

        

        return answer;
    }
}
