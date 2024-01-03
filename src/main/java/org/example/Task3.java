package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 9, j = 0; i <= 20; i++, j = i * i) {
            System.out.println(j);
        }
    }
}
