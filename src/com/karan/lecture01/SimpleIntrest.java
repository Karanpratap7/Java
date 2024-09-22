package com.karan.lecture01;
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = input.nextFloat();
        System.out.print("Enter Time: ");
        int t = input.nextInt();
        System.out.print("Enter Rate (in %): ");
        float r = input.nextFloat();
        float SI = (p*r*t)/100;
        System.out.println("Simple Interest is " + SI);
    }
}
