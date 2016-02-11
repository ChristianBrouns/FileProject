package com.ivik.file.io.fileproject;

import java.io.*;

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

        writer.write(10);
        writer.write(20);
        writer.write(20);
        writer.write(5);
        writer.write(9);

        writer.flush();
        writer.close();

        reader = new FileReader("Opdracht2.txt");
        reader.read(in);

        System.out.println("In file : " + fileName);

        int a = in[0];
        int b = in[1];
        int c = in[2];
        int d = in[3];
        int e = in[4];

       System.out.println("Sum of all the integers in this file = " + (a + b + c + d + e));


    }
}




/*
Print out the sum of integers read from a file.
Create a file with an integer on each line
Create a class that reads the file and outputs the sum of all integers in the file

Sample input file :
23
77

Sample output
100

 */