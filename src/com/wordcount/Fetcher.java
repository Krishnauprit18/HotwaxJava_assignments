package com.wordcount;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Fetcher{

    public static String fetchHtmlContent(String url) throws IOException{
        Document doc = Jsoup.connect(url).get();
        return doc.html();
    }
}