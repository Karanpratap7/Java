package com.karan.java1;
import java.util.*;
import java.lang.*;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8}
        };
        System.out.println(max(arr));
        System.out.println(Arrays.deepToString(arr));
    }

    static int max(int[][] arr){
        int maxValue = arr[0][0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                if(maxValue<arr[i][j]){
                    maxValue= arr[i][j];
                }
            }
        }
        return maxValue;
    }
}
