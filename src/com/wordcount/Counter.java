package com.wordcount;

import java.util.HashMap;
import java.util.Map;


public class Counter{

    public static Map<String, Integer> countWords(String text){
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = text.split("\\W+");
        for(String word: words){
            if(!word.isEmpty()){
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordCounts;
    }


}