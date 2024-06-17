package com.wordcount;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App{
    public static void main(String[] args){
        try{
            List<String> urls = Input.readUrls("src/resources/urls.txt");
            if(urls.isEmpty()){
                System.out.println("No URL's found or Error reading URL's file");
                return;
            }
            Map<String, Integer> totalWordCounts = new HashMap<>();

            for(String url: urls){
                System.out.println("Fetching content from: " + url);

                String htmlContent = Fetcher.fetchHtmlContent(url);
                if(htmlContent.isEmpty()){
                    System.out.println("Skipping URL's fetching due to fetching error: " + url);
                }
                String plainText = Parser.parseHtmltoPlainText(htmlContent);
                if(plainText.isEmpty()){
                    System.out.println("Skipping URL due to parsing error: " + url);
                }

                Map<String, Integer> wordCounts = Counter.countWords(plainText);

                for(Map.Entry<String, Integer> entry: wordCounts.entrySet()){
                    totalWordCounts.put(entry.getKey(), totalWordCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }

                System.out.println("Top 3 words are:");
                ResultAggregator.printTopWords(wordCounts, 3);
            }

            ResultAggregator.saveWordCounts("src/resources/words.txt", totalWordCounts);
        } catch (IOException e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}