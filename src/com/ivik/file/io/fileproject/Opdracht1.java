package com.ivik.file.io.fileproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Christian on 7-2-2016.
 * Given a positive integer, find the sum of its constituent digits.
 * Create a file (text editor) with at least 5 lines. Each line contains an integer.
 */

public class Opdracht1 {

    private static Logger log = Logger.getLogger(String.valueOf(Opdracht1.class));

    public static void main(String[] args) throws IOException {

        // do the following while there is a line to read.
        // readLine from file
        // calculate result
        // Print to log file or console or file


        List list = null;
        String line = " ";
        BufferedReader buffer = new BufferedReader(new FileReader("Opdracht1.txt"));

             while ((line = buffer.readLine()) != null) {
                list = new ArrayList<Integer>();
                for (int i = 0; i < line.length(); i++) {

                        char c = line.charAt(i);
                        String s = String.format("%c", c);
                        int num;

                        num = Integer.parseInt(s);
                        list.add(num);
                    }
                }
        System.out.println(list);
            }

}