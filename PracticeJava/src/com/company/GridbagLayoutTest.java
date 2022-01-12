package com.company;

import javax.swing.*;
import java.awt.*;

public class GridbagLayoutTest extends JFrame {
    JButton b1,b2,b3,b4,b5;
    GridBagConstraints gbc = new GridBagConstraints();
    GridbagLayoutTest(){
        setSize(400,250);
        setTitle("GridBag Layout Demo");
        setLayout(new GridBagLayout());

        b1 = new JButton("Button 1");
        gbc.ipady = 0;
        gbc.ipadx = 0;
        gbc.weightx = 0.1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy =0;
        gbc.insets = new Insets(5,5,5,5);
        add(b1,gbc);


        b2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.weightx =0.5;
        add(b2,gbc);

        b3 = new JButton("Button 3");
        gbc.weightx = 1;
        gbc.gridx = 2;
        add(b3,gbc);

//        b4 = new JButton("This is long button 4");
////        gbc.ipady = 40;
//        gbc.gridwidth = 3;
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        add(b4,gbc);
//
//        b5 = new JButton("Button 5");
//        gbc.gridx = 0;
//        gbc.gridy = 2;
////        gbc.ipady = 20;
//        gbc.gridwidth =2;
//        add(b5,gbc);

        setVisible(true);

    }

    public static void main(String[] args) {
        new GridbagLayoutTest();
    }
}
