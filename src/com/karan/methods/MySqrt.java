package com.karan.methods;

public class MySqrt {
    public static void main(String[] args) {
        int x=2147483647;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x){
        int ans = 0;
        if(x<4 && x>0){
            return 1;
        } else if (x == 0) {
            return 0;
        }
        for(int i = 0; i<x; i++){
            if(i*i>x){
                ans = i-1;
                break;
            }
            if(i*i == x){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
