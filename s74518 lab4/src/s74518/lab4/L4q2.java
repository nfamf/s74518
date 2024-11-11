/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s74518.lab4;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class L4q2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the radius of circle :");
        double r = Double.parseDouble(input);
        double diameter = 2*r;
        double circumference = 2*3.1459*r;
        double area = 3.14159*r*r;
        
        JOptionPane.showMessageDialog(null,"Enter the radius of circle " + diameter);
        JOptionPane.showMessageDialog(null,"Enter the radius of circle " + circumference);
        JOptionPane.showMessageDialog(null,"Enter the radius of circle " + area);
        
         
    }
}
