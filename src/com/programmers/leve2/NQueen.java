package com.programmers.leve2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    static int[] arr;
    static int N;
    static int cnt = 0;
    
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        
    }
    
    private static void dfs(int depth) {
        if(depth == N) {
            cnt++;
            return;
        }
        
        for(int i = 0 ; i < N; i++) {
            if() {
                
            }
        }
    }
    
    private static boolean possible(int col) {
        
    }

}
