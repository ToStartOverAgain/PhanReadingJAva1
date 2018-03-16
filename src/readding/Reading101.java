/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readding;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Admin
 */
public class Reading101 {
   private static ArrayList<News> listNews = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        getUrl();
    }
   public static void getUrl() throws IOException{
       String link = "https://vnexpress.net/tin-tuc/thoi-su/tp-hcm-chi-hon-2-300-ty-dong-tang-thu-nhap-cho-can-bo-3716400.html";
       Document document = Jsoup.connect(link).get();
       
       Elements elements = document.select("section.sidebar_home_1 .list_news .title_news a[title]");//a[title] lây the a 
       
       for (int i = 0; i < elements.size(); i++) {
           Element get = elements.get(i);
           
       }
       for (Element element : elements) {
           System.out.println(element.text());// lay tieu de
           element.attr("href");// attr la lay link 
           
       }
   }
    
}
