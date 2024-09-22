package com.karan.java1;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number whose factorial is desired: ");
        int n = in.nextInt();
        System.out.println(factorial(n));
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
