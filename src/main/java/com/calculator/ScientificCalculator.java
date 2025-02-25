package com.calculator;

import java.util.Scanner;

public class ScientificCalculator {

    public static double squareRoot(double x) {
        if (x < 0) throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static double naturalLog(double x) {
        if (x <= 0) throw new IllegalArgumentException("Natural log is not defined for non-positive numbers");
        return Math.log(x);
    }

    public static double power(double base, double exp) {
        return Math.pow(base, exp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 5) break;

            double num, exp;
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    num = scanner.nextDouble();
                    System.out.println("Square root: " + squareRoot(num));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int n = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(n));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    num = scanner.nextDouble();
                    System.out.println("Natural log: " + naturalLog(num));
                    break;
                case 4:
                    System.out.print("Enter base: ");
                    num = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    exp = scanner.nextDouble();
                    System.out.println("Result: " + power(num, exp));
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        scanner.close();
    }
}
