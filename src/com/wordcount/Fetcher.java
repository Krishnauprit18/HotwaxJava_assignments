package com.wordcount;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Fetcher{

    public static String fetchHtmlContent(String url) throws IOException{
        try {
            Document doc = Jsoup.connect(url).get();
            return doc.html();
        }
        catch(IOException e){
            System.out.println("Error fetching content from URL" + url +": "+ e.getMessage());
            return "";
        }
    }
}