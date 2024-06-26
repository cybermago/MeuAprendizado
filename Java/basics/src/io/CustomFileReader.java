package io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class CustomFileReader {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader reader = new FileReader(file)) {

            char[] in = new char[300];
            int size = reader.read(in);
            System.out.println(size);
            reader.read(in);
            for (char c : in) {
                System.out.println(c);
            }

            /*
             * int c;
             * while ((c = reader.read()) != -1) {
             * System.out.println((char) c);
             * }
             */
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}