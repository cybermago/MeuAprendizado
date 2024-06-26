package io;

import java.io.*;

public class BWriter {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);) {
            fw.write("Hello World\nok");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
