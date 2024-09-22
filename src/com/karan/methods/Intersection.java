package com.karan.methods;
import java.util.Arrays;
public class Intersection {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }


    static int[] intersection(int[] nums1, int[] nums2) {
        int[] intersection = new int[nums1.length];
        int i =0;
        for(int num=0; num<nums1.length; num++){
            if(Arrays.asList(nums2).contains(2)){
                    intersection[i] = nums1[num];
                    i++;
            }
        }
        return intersection;
    }


}
