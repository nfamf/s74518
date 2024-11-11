/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s74518.lab4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class L4q6 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the first value (x1): ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the second value (x2): ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the third value (x3): ");
        double x3 = scanner.nextDouble();
        double mean = (x1 + x2 + x3) / 3;
        double variance = ((Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2)) / 3);
        double standardDeviation = Math.sqrt(variance);
        System.out.printf("Mean (μ) = %.2f\n", mean);
        System.out.printf("Variance (σ²) = %.2f\n", variance);
        System.out.printf("Standard Deviation (σ) = %.2f\n", standardDeviation);
        


    }
}
