package com.karan.java1;
import java.util.Scanner;
import java.lang.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter string: ");
//        String s = in.next();
//        if (palindrome(s)) {
//            System.out.println("Yes!");
//        } else {
//            System.out.println("No.");
//        }
        String str = "Hello, World!";
        str = str.replace('H','J');
        System.out.println(str);
    }

    static boolean palindrome(String s){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(s.length() - 1 - i) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
