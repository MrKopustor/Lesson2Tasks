package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("enter a number");

        Scanner inputA = new Scanner(System.in);
        if (inputA.hasNextInt()) {
            int a = inputA.nextInt();
            System.out.println("You a number: " + a);

            for (int i = 1, j = 1; i <= a; i++, j += i) {
                System.out.println(j);
            }
        } else {
            System.out.println("Input error !");
        }

        inputA.close();
    }
}
