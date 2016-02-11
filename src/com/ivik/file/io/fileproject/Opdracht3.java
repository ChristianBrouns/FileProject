package com.ivik.file.io.fileproject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Christian on 7-2-2016.
 */

public class Opdracht3 {
    public static void main(String[] args) throws IOException {

        FileWriter writer;
        FileReader reader;

        writer = new FileWriter("TargetOpd3.txt");

        reader = new FileReader("Opdracht3.txt");
        char [] in = new char[83];
        reader.read(in);


        List<String> list = new ArrayList<>();
        list.add(String.valueOf(in));
        list.add(String.valueOf(55.552));

        writer.write(String.valueOf(list));
        writer.flush();
        writer.close();

    }
}

/*
Write a class that sorts numbers.
Create a class that reads a file of numbers and writes a file with each line
sorted by the numbers.

Sample input file ..
70.920 38.797
14.354 99.323 90.374 7.581
37.507
3.263
40.079 27.999 65.213 55.552

Sample Output file
38.797
7.581 14.354 70.920 90.374 99.323
55.552
37.507
3.263
27.999 40.079 65.213

*/
