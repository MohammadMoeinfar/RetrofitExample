package com.example.rssfeedlibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RssFeedProvider {

    private static List<RssItem> parse(String rssFeed){
        List<RssItem> list = new ArrayList<>();

        Random r = new Random();

        Integer number = r.nextInt(10) + 5;

        for (int i = 0; i < number; i++){
            String s = String.valueOf(r.nextInt(1000));

            RssItem item = new RssItem("Summary " + s, "Description " + s);

            list.add(item);
        }

        return list;
    }
}
