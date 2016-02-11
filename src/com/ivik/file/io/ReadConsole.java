package com.ivik.file.io;

import java.io.Console;

/**
 * Created by Christian on 6-2-2016.
 */
public class ReadConsole {

    public static void main(String[] args) {

        Console console = System.console();
        console.readLine();

        String Pattern = console.readLine();
        String Text = console.readLine();
        }
}
