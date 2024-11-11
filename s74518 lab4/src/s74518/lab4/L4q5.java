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
public class L4q5 {
    public static void main(String[] args) {
        String distanceInput = JOptionPane.showInputDialog("Enter the distance in meters:");
        double distance = Double.parseDouble(distanceInput);
        String hoursInput = JOptionPane.showInputDialog("Enter the time in hours:");
        int hours = Integer.parseInt(hoursInput);
        String minutesInput = JOptionPane.showInputDialog("Enter the time in minutes:");
        int minutes = Integer.parseInt(minutesInput);
        String secondsInput = JOptionPane.showInputDialog("Enter the time in seconds:");
        int seconds = Integer.parseInt(secondsInput);
        int totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double speedMps = distance / totalTimeInSeconds;
        double speedKmph = (distance / 1000) / (totalTimeInSeconds / 3600);
        double speedMph = (distance / 1609) / (totalTimeInSeconds / 3600);
        String message = String.format("Speed Calculation Results:\n\n" +"Speed in meters per second: %.2f m/s\n" +"Speed in kilometers per hour: %.2f km/h\n" +
            "Speed in miles per hour: %.2f mph",speedMps, speedKmph, speedMph);
        
        JOptionPane.showMessageDialog(null, message);
        
    }
}
