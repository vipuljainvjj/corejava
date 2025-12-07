package com.vipul.basics;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadFiles {

    public static void main(String[] args) throws IOException {
        String pathName = "/Users/vipuljain/Documents/Workspaces/practice";

        Path path = Paths.get(pathName);

        Files.walk(path)
                .filter(path1 -> path1.getFileName().toString().endsWith(".class"))
                //.filter(path1 -> path1.getFileName().endsWith("bak"))
                .forEach(System.out::println);
                //.forEach(ReadFiles::deleteFile);



//        File file = new File(pathName);
//        System.out.println(Arrays.toString(file.listFiles()));
    }

    static void deleteFile(Path path) {
        try {
            Files.delete(path);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
