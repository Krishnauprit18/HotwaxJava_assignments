package com.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Input{
    public static List<String> readUrls(String filePath) throws IOException{
        return Files.readAllLines(Paths.get(filePath));
    }


}