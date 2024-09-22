package com.karan.java1;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{

            int[] arr = {0,1,2,3,4};
            System.out.println(arr[5]);
        } catch (ArithmeticException e){
            System.out.println("There is " + e.getMessage() + " error which means you can't divide a number from zero");
        } catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("There is " + e1.getLocalizedMessage() + " error You dumb shit!");
        }
        finally {
            System.out.println("You dumb fuck why would you even want to try that.");
        }
    }
}
