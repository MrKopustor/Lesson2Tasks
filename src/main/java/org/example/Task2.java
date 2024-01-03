package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("enter a temperature");

        Scanner inputT = new Scanner(System.in);
        int t = inputT.nextInt();
        inputT.close();

        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
