package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("enter the number as you like");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the frist number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("the addition of this two numbers are");
    System.out.println(sum);

    }
}
