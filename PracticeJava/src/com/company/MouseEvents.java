package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;


public class MouseEvents extends JFrame{
    int x,y,r1,r2;
    MouseEvents(){

        setSize(400,300);
        setLocation(500,100);
        setTitle("Handling Mouse Events");

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                r1 = 20;
                r2 = 20;
                Graphics g = getGraphics();
                paint(g);
            }

            public void paint(Graphics g){
                g.setColor(Color.blue);
                g.fillOval(x,y,r1,r2);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEvents();
    }



}
