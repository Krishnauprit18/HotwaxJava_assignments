package com.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Input{
    public static List<String> readUrls(String filePath) throws IOException{
        try {
            return Files.readAllLines(Paths.get(filePath));
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}