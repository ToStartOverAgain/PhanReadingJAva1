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
public class Test {
    public static void main(String[] args) throws IOException {
        getUrl1();
    }
    private static ArrayList<News> listNews = new ArrayList<>();
   public static  void getUrl1() throws IOException{
       Document document = Jsoup.connect("https://vnexpress.net/").get();
       Elements elements  = document.select("section.container .sidebar_1 ");
       
        for (int i = 0; i < elements.size(); i++) {
           Element get = elements.get(i);
           
       }
       for (Element element : elements) {
           System.out.println(element.text());// lay tieu de
           element.attr("href");// attr la lay link 
           
           
       }
   }
    
}
