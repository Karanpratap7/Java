package com.karan.lecture01;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number of rows and columns as input
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declaring a matrix (2D array) with the given size
        int[][] matrix = new int[rows][cols];

        // Taking input for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int top = 0, down = rows-1, left = 0, right = cols-1;
        int dir = 0;
        while(top<=down && left<=right){
            if(dir == 0){
                for(int i = left; i<=right; i++){
                    System.out.print(matrix[top][i]);
                }
                top += 1;
            }
            else if (dir == 1) {
                for(int i = top; i<=down; i++){
                    System.out.print(matrix[i][right]);
                }
                right -=1;
            }
            else if (dir == 2) {
                for(int i = right; i>=left; i--){
                    System.out.print(matrix[down][i]);
                }
                down -=1;
            }
            else if(dir == 3){
                for(int i = down; i>=top; i--){
                    System.out.print(matrix[i][left]);
                }
                left+=1;
            }
            dir = (dir+1)%4;
        }
    }
}
