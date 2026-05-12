package com.pluralsight.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputWriter {

    public static void csvWriter() throws IOException {

        boolean isDoneWriting = false;

        while(!isDoneWriting) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/battleSimulationReport"));
                String line;

            } catch (IOException e) {
                System.out.println("");
            }
        }
    }
}
