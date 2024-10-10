package edu.penzgtu;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number >> ");
        double number = scanner.nextDouble();
        System.out.println();

        HeronSqrt sqrt = new HeronSqrt(number);

        System.out.printf("Result: %f", sqrt.sqrtCalculate());

        scanner.close();
    }
}