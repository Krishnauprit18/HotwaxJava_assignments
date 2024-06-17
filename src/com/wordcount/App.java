package com.wordcount;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App{
    public static void main(String[] args){
        try{
            List<String> urls = Input.readUrls("src/resources/urls.txt");
            Map<String, Integer> totalWordCounts = new HashMap<>();

            for(String url: urls){
                System.out.println("Fetching content from: " + url);

                String htmlContent = Fetcher.fetchHtmlContent(url);
                String plainText = Parser.parseHtmltoPlainText(htmlContent);

                Map<String, Integer> wordCounts = Counter.countWords(plainText);

                for(Map.Entry<String, Integer> entry: wordCounts.entrySet()){
                    totalWordCounts.put(entry.getKey(), totalWordCounts.getOrDefault(entry.getKey(), 0) + entry.getValue());
                }
            }

            ResultAggregator.saveWordCounts("src/resources/words.txt", totalWordCounts);
            ResultAggregator.printTopWords(totalWordCounts, 3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}