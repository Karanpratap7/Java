package com.karan.lecture01;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float num1 = in.nextFloat();
        System.out.print("Enter an Operator: ");
        char opp = in.next().charAt(0);
        System.out.print("Enter second number: ");
        float num2 = in.nextFloat();
        float ans = 0;
        switch (opp){
            case '+' :
                ans = num1 + num2;
                break;
            case '-' :
                ans = num1 - num2;
                break;
            case '*' :
                ans = num1*num2;
                break;
            case '/' :
                if(num2 != 0){
                    ans = num1/num2;
                } else {
                    System.out.println("Division not possible!");
                    return;
                } break;
            case '%' :
                ans = num1%num2;
                break;
            default :
                System.out.println("Choose a valid operator from the list: '+', '-', '*', '/', '%' ");
                return;
        }

        System.out.print("Answer: " + ans);
    }
}
