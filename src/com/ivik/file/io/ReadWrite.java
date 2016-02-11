package com.ivik.file.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Christian on 6-2-2016.
 */
public class ReadWrite {


    public static void main(String[] args) throws IOException{

        String fileName = "myFile.txt";
        char [] in = new char[50];
        FileWriter writer;
        FileReader reader;

        try{
            writer = new FileWriter("myFile.txt");

            writer.write("Het is zoet en juist\nte sterven voor het vaderland");
            writer.flush();
            writer.close();

            reader = new FileReader("myFile.txt");
            reader.read(in);

            System.out.println("In file : " + fileName);
            for(char c : in) {
                System.out.print(c);
        }
            reader.close();
    }

    catch (IOException e) {
        System.out.println("IO Exception thrown: " + e.getMessage());
        throw e;
        }
    }

}
