package com.karan.lecture01;
import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {12,14,1},
                {34,25,99,4,3},
                {45,37,67,34}
        };
        int target = 67;
       // int [] ans = search(arr,target);
        System.out.println(searchMax(arr));
    }

    static int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row =0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] >max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
