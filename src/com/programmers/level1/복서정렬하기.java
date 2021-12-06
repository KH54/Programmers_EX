package com.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 복서정렬하기 {
    public static void main(String[] args) {

        int[] weights = { 50, 82, 75, 120 };
        String[] head2head = { "NLWL", "WNLL", "LWNW", "WWLN" };

        System.out.println(Arrays.toString(solution(weights, head2head)));
    }

    public static int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        List<Boxer> player = new ArrayList<>();

        for (int i = 0; i < head2head.length; i++) {
            double win = 0.0;
            double lose = 0.0;
            double winRate = 0.0;
            int heavy = 0;

            for (int j = 0; j < head2head.length; j++) {
                char c = head2head[i].charAt(j);

                lose += c == 'L' ? 1 : 0;
                win += c == 'W' ? 1 : 0;
                heavy += c == 'W' && weights[i] < weights[j] ? 1 : 0;

                winRate = win / (win + lose);
            }
            Boxer boxer = new Boxer(i + 1, winRate, heavy, weights[i]);
            player.add(boxer);
        }

        Collections.sort(player, new Comparator<Boxer>() {
            @Override
            public int compare(Boxer b1, Boxer b2) {
                if (b1.winRate > b2.winRate) {
                    return -1;
                } else if (b1.winRate < b2.winRate) {
                    return 1;
                } else {
                    if (b1.heavy > b2.heavy) {
                        return -1;
                    } else if (b1.heavy < b2.heavy) {
                        return 1;
                    } else {
                        if (b1.weight > b2.weight) {
                            return -1;
                        } else if (b1.weight < b2.weight) {
                            return 1;
                        } else {
                            if (b1.no > b2.no) {
                                return 1;
                            } else if (b1.no < b2.no) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            }
        });

        for (int i = 0; i < player.size(); i++) {
            Boxer boxer = player.get(i);
            answer[i] = boxer.no;
        }

        return answer;
    }
}

class Boxer {
    int no;
    double winRate;
    int heavy;
    int weight;

    public Boxer(int no, double winRate, int heavy, int weight) {
        this.no = no;
        this.winRate = winRate;
        this.heavy = heavy;
        this.weight = weight;
    }
}
