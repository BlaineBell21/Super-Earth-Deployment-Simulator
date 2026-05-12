package com.pluralsight.utils;

import java.io.*;

public class InputReader {

    public static void fileReader() throws IOException {


        try {
            BufferedWriter write = new BufferedWriter(new FileWriter("src/newSession"));



        } catch (IOException e){
            System.out.println("File not found");
        }

    }
}
