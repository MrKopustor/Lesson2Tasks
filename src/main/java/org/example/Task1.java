package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("enter a number");

        Scanner inputA = new Scanner(System.in);
        int a = inputA.nextInt();
        inputA.close();

        System.out.println(a % 2 == 0 ? "even number" : "odd number");
    }
}
