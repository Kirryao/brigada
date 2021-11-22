package com.fitness;
import java.awt.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		  JFrame frame = new JFrame("My First GUI");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(500,500);
         JButton button1 = new JButton("Button 1");
         button1.setBounds(10,10,90,20);
         JButton button2 = new JButton("Button 2");
         button2.setBounds(10,10,70,40);
         frame.getContentPane().add(button1);
         frame.getContentPane().add(button2);
         frame.setVisible(true);
         String courses[] = { "core java","advance java", "java servlet"};
         JComboBox c = new JComboBox(courses);
         c.setBounds(10,10,50,50);
	}
}
