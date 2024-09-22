package com.karan.lecture01;

import static java.lang.Math.*;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {329, 24, 4564, 8,32,0};
        int count = 0;
        for (int j : arr) {
            int digits = (int) (log10(j)) + 1;
            if (digits % 2 == 0) count++;
        }
        System.out.print(count);
    }
}
