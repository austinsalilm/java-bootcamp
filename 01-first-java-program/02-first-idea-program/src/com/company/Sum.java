package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter float one: ");
        float float1 = input.nextFloat();
        System.out.print("enter float two ");
        float float2 = input.nextFloat();
        float sum = float1 + float2;
        System.out.println("Sum = " + sum);
    }
}
