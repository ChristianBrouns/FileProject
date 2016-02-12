package com.ivik.file.io.fileproject;

import java.io.*;
import java.nio.CharBuffer;

/**
 * Created by Christian on 7-2-2016.
 */
public class Opdracht2 {
    public static void main(String[] args) throws IOException {
        checkFile();
    }

    private static void checkFile() throws IOException {
        File file = new File("Opdracht2.txt");

        System.out.println("exist ? " + file.exists());
        System.out.println("created ? " + file.createNewFile());

        System.out.println("File size = " + file.length());

        String fileName = "Opdracht2.txt";
        char[] in = new char[5];
        FileWriter writer;
        FileReader reader;

        writer = new FileWriter("Opdracht2.txt");

            writer.write(40);
            writer.write(10);
            writer.write(2);
            writer.write(5);
            writer.write(14);

            writer.flush();
            writer.close();



        reader = new FileReader("Opdracht2.txt");
        reader.read(in);

        System.out.println("In file : " + fileName);

        int result = 0;
        for (int i = 0; i < in.length; i++) {
            result += in[i];

        }
        System.out.println("Sum of all integers = " + result);
    }
}