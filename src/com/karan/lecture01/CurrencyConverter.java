package com.karan.lecture01;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        int rupee = input.nextInt();
        float usd = rupee *0.012f;
        System.out.println("Amount in USD: " + usd);
    }
}
