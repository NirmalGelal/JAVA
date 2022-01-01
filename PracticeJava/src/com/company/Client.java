package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost",1235);

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(),true);
        Scanner ink = new Scanner(System.in);

        outs.println("hi");

        String recievedmsg,sentmsg;
        do {
            recievedmsg = ins.nextLine();
            System.out.println("Server:\t"+recievedmsg);
            System.out.print("Client:\t");
            sentmsg = ink.nextLine();
            outs.println(sentmsg);
        }while (recievedmsg.equals("bye")!=true);

        cs.close();
    }


}
