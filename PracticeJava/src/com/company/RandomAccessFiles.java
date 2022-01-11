package com.company;
import java.io.*;
public class RandomAccessFiles {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("test.txt","rw");
        raf.writeUTF("hello");
        raf.writeUTF("Hi");
        raf.seek(0);
        System.out.println(raf.readUTF());
        long pos = raf.getFilePointer();
        System.out.println(pos);
        raf.seek(pos);
        System.out.println(raf.readUTF());
        System.out.println(raf.getFilePointer());


    }
}
