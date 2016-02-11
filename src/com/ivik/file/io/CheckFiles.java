package com.ivik.file.io;

import java.io.File;
import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Christian on 6-2-2016.
 */

public class CheckFiles {
    public static void main(String[] args) throws IOException {

        checkFile();
        usePath();
    }

    private static void checkFile() throws IOException {

        //create file object
        File file = new File("FileCB.txt"); //hier kan ook een volledig path zodat je de file kan opslaan waar je zelf wil.

        System.out.println("exist ? " + file.exists()); //true het bestand bestaat al
        System.out.println("created ? " + file.createNewFile()); // als het bestand al bestaat wordt er geen nieuw bestand gemaakt -> waarde = false

        System.out.println("File size = " + file.length()); // aantal characters in de file

    }

    private static void usePath() {

    }

}
