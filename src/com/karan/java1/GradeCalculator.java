package com.karan.java1;
import java.util.*;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks to calculate grade: ");
        int mark = in.nextInt();
        switch (mark/10){
            case 10:
            case 9:
                System.out.println("GRADE A\nWell Done!");
                break;
            case 8:
                System.out.println("GRADE B\nCan do better.");
                break;
            case 7:
                System.out.println("GRADE C\nBellow Average :(");
                break;
            case 6:
                System.out.println("GRADE D\nAs expected!");
                break;
            case 5:
                System.out.println("GRADE E\nJust Passed.");
                break;
            default:
                System.out.println("GRADE F\nGet out of my sight!!");
                break;
        }
    }
}
