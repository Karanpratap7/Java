package com.karan.java1;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number whose multiplication table you want: ");
        int n = in.nextInt();
        for(int i = 1; i<11; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }
    }
}
