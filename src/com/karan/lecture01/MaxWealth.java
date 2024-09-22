package com.karan.lecture01;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int ans = richest(checkWealth(accounts));
        System.out.print (ans);
    }

    static int[] checkWealth(int[][] arr){
        int[] wealth = new int[arr.length];
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++){
                wealth[i] += arr[i][j];
            }
        }
        return wealth;
    }

    static int richest(int[] arr){
        int richest = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(richest<arr[i]){
                richest = arr[i];
            }
        }
        return richest;
    }
}
