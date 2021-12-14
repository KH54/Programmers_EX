package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Test��
public class UseTest {
    public static void main(String[] args) {
        
        conversion(2,2);
    }

    public static void conversion(int number, int N) {
        StringBuilder sb = new StringBuilder();
        int current = number;

        // 진법 변환할 숫자가 0보다 큰 경우 지속 진행
        while (current > 0) {
            // 만약 N으로 나누었는데 10보다 작다면 해당 숫자를 바로 append
            if (current % N < 10) {
                sb.append(current % N);

                // 만약 N이 10보다 큰 경우, N으로 나누었는데 10 이상이면 A, B등으로 표현하므로 기존 숫자는 10진법이므로 10만큼 빼고 'A'를
                // 더한다.
                // 왜냐면 1~9까지는 숫자로 표기하지만, 10 부터는 'A', 'B' 순서로 나타내기 때문이다.
                // 나머지가 10이라면 'A' + 10이 아니라 'A'로 나타내야 하기 때문
            } else {
                sb.append((char) (current % N - 10 + 'A'));
            }
            current /= N;
        }
        // StringBuilder의 reverse를 사용해야 정상적으로 출력 가능. 안그러면 거꾸로 출력됨
        System.out.println("숫자 : " + number + "를 " + N + "진법으로 변환한 수 : " + sb.reverse());
    }
}
