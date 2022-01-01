package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends JFrame implements KeyListener, ActionListener {

    JLabel l1,l2,l3;
    JTextField txt1,txt2,out;
    JButton btn;
    KeyEvents(){

        setSize(400,300);
        setTitle("Handling Key Events");
        setLocation(500,100);
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));

        l1 = new JLabel("First Value: ");
        txt1 = new JTextField(10);
        l2 = new JLabel("Second Value: ");
        txt2 = new JTextField(10);
        l3 = new JLabel("Result");
        out = new JTextField(10);
        btn = new JButton("Calculate");

        add(l1);
        add(txt1);
        add(l2);
        add(txt2);
        add(l3);
        add(out);
        add(btn);

        btn.addKeyListener(this);
        btn.addActionListener(this);

        setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x,y,z;
        x = Integer.parseInt(txt1.getText());
        y = Integer.parseInt(txt2.getText());
        if(e.getKeyChar() == 's'){
            z = x-y;
            out.setText(String.valueOf(z));
        }
        else if (e.getKeyChar() == 'a'){
            z = x+y;
            out.setText(String.valueOf(z));
        }
        else{
            out.setText("Press a or s");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }



    public static void main(String[] args) {
        new KeyEvents();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==btn){
            int x,y,z;
            x = Integer.parseInt(txt1.getText());
            y = Integer.parseInt(txt2.getText());
            z = x+y;
            out.setText(String.valueOf(z));
        }
    }

}
