package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll no.: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no.is " + rollno);

        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Your name is " + name);

        System.out.print("Enter your cgpa: ");
        float cgpa = input.nextFloat();
        System.out.println("your cgpa is " + cgpa);
    }
}
