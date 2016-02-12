package com.ivik.file.io.fileproject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Christian on 7-2-2016.
 */
public class Opdracht1 {

    public static void main(String[] args) throws IOException {
        checkFile();
    }

    private static void checkFile() throws IOException {
        File file = new File("Opdracht1.txt");

        System.out.println("exist ? " + file.exists());
        System.out.println("created ? " + file.createNewFile());

        System.out.println("File size = " + file.length());

        String fileName = "Opdracht1.txt";
        FileWriter writer;
        FileReader reader;
        writer = new FileWriter("Opdracht1.txt");
        char[] in = new char[6];

        writer.write(Integer.valueOf("23"));
        writer.write(Integer.valueOf("961"));
        writer.write(Integer.valueOf("10008"));
        writer.write(Integer.valueOf("99"));
        writer.write(Integer.valueOf("017"));
        writer.write(Integer.valueOf("17"));

        writer.flush();
        writer.close();

        reader = new FileReader("Opdracht1.txt");
        reader.read(in);


        System.out.println("In file : " + fileName);

        int element = 0;
        for (int count = 0; count < in.length; count++) {

            int x = in[element];
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x = x / 10;

            }
            element++;

            System.out.println(sum);
        }

    }
}



