package com.ivik.file.io.properties;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * Created by Christian on 13-2-2016.
 */
public class ShowSysProperties {

    public static void main(String[] args) {
        showSysProperties();
    }

    private static void showSysProperties() {

       Properties properties = System.getProperties();

        try (PrintWriter pw = new PrintWriter(new File("system.properties"))) {

            properties.store(pw,"System Properties");

        }
         catch (IOException e){
            e.printStackTrace();
        }
    }
}


