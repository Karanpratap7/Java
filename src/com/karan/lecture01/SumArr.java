package com.karan.lecture01;

public class SumArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int n=0; n< arr.length; n++ ) sum += arr[n];
        System.out.println(sum);

    }
}
