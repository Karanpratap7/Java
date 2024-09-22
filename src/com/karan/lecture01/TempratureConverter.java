package com.karan.lecture01;
import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in C: ");
        float tmepC = input.nextFloat();
        float tmepF = (tmepC*9/5) + 32;
        System.out.println(tmepF);
    }
}
