package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1235);
        Socket s = serverSocket.accept();
        System.out.println("Connection established");
        Scanner ins = new Scanner(s.getInputStream());
        PrintWriter outs = new PrintWriter(s.getOutputStream(),true);
        Scanner ink = new Scanner(System.in);


        String receivedmsg,sentmsg;
        do {
            receivedmsg = ins.nextLine();
            System.out.println("Client:\t"+receivedmsg);
            System.out.print("Server:\t");
            sentmsg = ink.nextLine();
            outs.println(sentmsg);

        }while (receivedmsg.equals("bye")!=true);

        s.close();
        serverSocket.close();
    }
}
