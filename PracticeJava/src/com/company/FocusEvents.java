package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEvents extends JFrame implements FocusListener {

    JLabel l1,l2,l3;
    JTextField txt1,txt2,out;
    JButton b;
    FocusEvents(){
        setSize(400,300);
        setTitle("Handling Focus Events");
        setLocation(500,100);
        setLayout(new FlowLayout(FlowLayout.LEFT,150,15));
        l1 = new JLabel("First Value: ");
        txt1 = new JTextField(10);
        l2 = new JLabel("Second Value: ");
        txt2 = new JTextField(10);
        l3 = new JLabel("Result: ");
        out = new JTextField(10);
        b = new JButton("Multiply");

        add(l1);
        add(txt1);
        add(l2);
        add(txt2);
        add(l3);
        add(out);
        add(b);

        txt1.addFocusListener(this);
        txt2.addFocusListener(this);
        b.addFocusListener(this);
        setVisible(true);


    }

    public static void main(String[] args) {
        new FocusEvents();
    }

    @Override
    public void focusGained(FocusEvent e) {
        int x,y,z;
        if (e.getSource()==b){
            x = Integer.parseInt(txt1.getText());
            y = Integer.parseInt(txt2.getText());
            z = x*y;
            out.setText(String.valueOf(z));
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource()==txt1 && txt1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter number in tx1","Alert1",JOptionPane.WARNING_MESSAGE);
            txt1.requestFocus();
        }
        if(e.getSource()==txt2 && txt2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter number in tx2","Alert2",JOptionPane.WARNING_MESSAGE);
            txt2.requestFocus();
        }
    }
}
