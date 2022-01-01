package com.company;

import java.awt.*;



class SimpleAwt extends  Frame {

    SimpleAwt()
    {
        Frame f = new Frame();
        f.setSize(500,300);
        f.setLocation(500,300);
        f.setBackground(Color.lightGray);
        f.setForeground(Color.black);


        f.setTitle("MRS System");
        f.setVisible(true);
        f.setLayout(null);

        Label title = new Label("Title of movie: ");
        Label genre = new Label("Genre of movie: ");
        Label language = new Label("Language: ");


        title.setBounds(20, 80, 80, 30);
        genre.setBounds(20,110,80,30);
        language.setBounds(20,140,80,30);


        f.add(title);
        f.add(genre);
        f.add(language);

    }
    public static void main(String[] args) {

        SimpleAwt frame = new SimpleAwt();

    }
}

