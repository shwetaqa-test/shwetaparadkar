package com.company;

import java.util.Scanner;

public class Array {

public static void main(String[] args) {

    int marks[] = new int[] {
        12, 34, 56, 34, 46
    } ;

    int sum = 0;
    for (int i = 0; i <= marks.length; i++) {

        sum = sum + marks[i];
    }

    System.out.println(sum);
}
