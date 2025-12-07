package com.vipul.basics;

import java.io.*;
import java.util.stream.IntStream;

public class WriterBasics {

    public static void main(String[] args) throws IOException {

        File file = new File("RECON.txt");

        FileWriter fw = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fw);
        PrintWriter printWriter = new PrintWriter(file);

        IntStream.range(0, 10)
                 .forEach(i -> printWriter.write(String.valueOf(i)));

         printWriter.flush();
         printWriter.close();
    }

}