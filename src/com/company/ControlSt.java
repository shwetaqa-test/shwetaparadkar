package com.company;

public class ControlSt {

    public static void main(String[] args) {

        int x = 13;

    }
    public static void TestEvenOrOdd (int x){
        if (x%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }

    public static void testPositiveNegative (int x){
        if (x>0) {
            System.out.println("Positive");
        }
        else if (x<0){
            System.out.println("Negative");
        } else if (x==0) {
            System.out.println("Zero");
        }
    }
}
