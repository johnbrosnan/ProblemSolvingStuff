package week3.exercisea;

import javax.swing.*;

public class TestDate {
    public static void main(String[] args) {

        Date date1 = new Date();
        String output = "";

        output = "The results of testing the Date class is as follows:\n\n\n" +
                 "Just called the Date() constructor, the value of first Date object is " + date1.toString();

        int day = Integer.parseInt(JOptionPane.showInputDialog("Please enter a day value"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Please enter a month value"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter a year value"));

        Date date2 = new Date(day,month,year);

        output += "\n\nJust called the Date(int,int,int) constructor, the value of secnd Date object is " + date2.toString() +
                  "\n\n\nThe day part of this object is " + date2.getDay();

        JOptionPane.showMessageDialog(null,output,"Date Ckass Test Results",JOptionPane.INFORMATION_MESSAGE);


        System.exit(0);
    }
}
