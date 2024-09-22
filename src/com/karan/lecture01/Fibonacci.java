package com.karan.lecture01;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int n = input.nextInt();
        if(n >= 3) {
            int term1 = 0;
            int term2 = 1;
            int nextTerm = term1 + term2;
            System.out.print(term1 + " " + term2 + " " + nextTerm + " ");
            for (int i = 3; i < n; i++) {
                term1 = term2;
                term2 = nextTerm;
                nextTerm = term1 + term2;
                System.out.print(nextTerm + " ");
            }
        }
        else if(n ==2){
            System.out.println("0 1");
        } else if (n == 1) {
            System.out.println("0");
        }
        else{
            System.out.println("Seriously this many terms!");
        }
    }
}
