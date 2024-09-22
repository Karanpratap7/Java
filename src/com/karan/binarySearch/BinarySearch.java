package com.karan.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,23,35,66,67,78,98,345};
        int target = 67;
        int ans = find(arr,target);
        System.out.print(ans);
    }

    static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid])
            {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}

