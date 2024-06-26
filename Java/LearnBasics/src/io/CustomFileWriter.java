package io;

import java.io.File;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

public class CustomFileWriter {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (java.io.FileWriter fw = new java.io.FileWriter(file, true)) {
            fw.write("Hello World\nok");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
