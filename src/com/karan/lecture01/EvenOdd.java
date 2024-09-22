package com.karan.lecture01;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if(num == 0){
            System.out.println("0 is neither even nor odd!");
        }
        else if(num%2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd.");
        }

    }
}
