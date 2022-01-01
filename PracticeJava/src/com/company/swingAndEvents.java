package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingAndEvents extends JFrame implements ActionListener {
    JTextField txt;
    JLabel lbl;
    swingAndEvents()
    {
        setSize(500,500);
        setLocation(500,100);
        setLayout(new FlowLayout(FlowLayout.CENTER));

        lbl = new JLabel("output here");

        JLabel label = new JLabel("Type Something: ");
        txt = new JTextField(10);

        JButton btn = new JButton("Click");

        btn.addActionListener(this);

        add(label);
        add(txt);
        add(btn);
        add(lbl);

        setVisible(true);


    }
    public void actionPerformed(ActionEvent e){
        int sth = Integer.parseInt(txt.getText());

        if(e.getActionCommand()=="Click"){

            lbl.setText(String.valueOf((int)(Math.pow(sth,2))));
        }
    }

    public static void main(String[] args) {
        new swingAndEvents();
    }
}
