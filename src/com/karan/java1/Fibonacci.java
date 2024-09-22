package com.karan.java1;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number up till which you want the fibonacci series: ");
        int n = in.nextInt();
        fibonacci(n);
    }

    static void fibonacci(int n){
        int fterm = 0;
        int sterm = 1;
        int nterm = 0;
        System.out.print(fterm + " " + sterm + " ");
        while(nterm<n){
            nterm = fterm + sterm;
            if(nterm>n){
                break;
            }
            fterm = sterm;
            sterm = nterm;
            System.out.print(nterm + " ");
        }
    }
}
