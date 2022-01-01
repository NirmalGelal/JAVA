package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowsEvents extends WindowAdapter{
    WindowsEvents(){
        JFrame frame = new JFrame();
        frame.setTitle("Handling Window Events");
        frame.setSize(400,300);
        frame.setLocation(500,100);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                JOptionPane.showMessageDialog(frame,"Good Bye!!!");
            }
            @Override
            public void windowOpened(WindowEvent e){
                JOptionPane.showMessageDialog(frame,"Welcome!!");
            }
            @Override
            public void windowIconified(WindowEvent e){
                JOptionPane.showMessageDialog(frame,"See you later..");
            }
            @Override
            public void windowDeiconified(WindowEvent e){
                JOptionPane.showMessageDialog(frame,"Welcome back!!");
            }


        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new WindowsEvents();
    }
}
