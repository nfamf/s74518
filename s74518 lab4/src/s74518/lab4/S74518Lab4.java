/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s74518.lab4;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class S74518Lab4 {

    /**
     * @param args the command line arguments
     */

          public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int num1 = input.nextInt();
        System.out.println("Enter second integer");
        int num2 = input.nextInt();
        int square1 = num1*num1;
        int square2 = num2*num2;
        int sumSquare = square1 + square2;
        int diffSquare = square1 - square2;
        System.out.println("The square of "+ num1+ " is "+ square1);
        System.out.println("The square of " + num2 + " is "+ square2);
        System.out.println("The sum of the square is "+ sumSquare);
        System.out.println("The difference of the square is " + diffSquare );
        
        
        
    
    }
    
}
