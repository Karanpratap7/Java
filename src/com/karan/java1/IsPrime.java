package com.karan.java1;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int n = in.nextInt();
        if (prime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }

    static boolean prime(int n){
        if(n == 0 || n == 1){
            return false;
        }
        boolean ans = true;
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                ans = false;
                break;
            }
        }
        return ans;
    }
}
