/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readding;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Admin
 */
public class Test1 {

    public static void main(String[] args) throws IOException {
        getUrl();
    }
    private static ArrayList<News> listNews = new ArrayList<>();
    private static HashMap<Integer, Element> hashMap = new HashMap<>();
        private static HashSet<String> linkSet = new HashSet<>();

    public static void getUrl() throws IOException {
     
        Document document = Jsoup.connect("https://thethao.vnexpress.net/").get();
        linkSet.add(document.select("section.featured article .thumb_big a").attr("href"));
        Elements els = document.select("section.featured .sub_featured .title_news a[title]");
        linkSet.add(els.text());
         for (int i = 0; i < els.size(); i++) {
           Element get = els.get(i);
        for (Element el : els) {
             System.out.println(linkSet.add(els.text()) +     "vnexpress");// lay tieu de
           els.attr("href");
            
        }
        
        
        }

    }
}

    
    

