package com.wordcount;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser{

    public static String parseHtmltoPlainText(String html){
        Document doc = Jsoup.parse(html);
        return doc.body().text().toLowerCase();
    }
}
