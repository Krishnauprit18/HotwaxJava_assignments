package com.wordcount;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser{

    public static String parseHtmltoPlainText(String html){
        try {
            Document doc = Jsoup.parse(html);
            return doc.body().text().toLowerCase();
        }
        catch(Exception e){
            System.out.println("Error parsing HTML content: " + e.getMessage());
            return "";
        }
    }
}
