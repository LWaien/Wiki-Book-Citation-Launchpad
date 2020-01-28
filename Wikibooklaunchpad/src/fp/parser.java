/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author logan
 */
public class parser {
    public static void refs(String refs,TNode parent){
        String books = "";
    
        try{
            Pattern pattern = Pattern.compile("<i>(.*?)</i>");
            Matcher matcher = pattern.matcher(refs);
                while(matcher.find()){               
                    books = matcher.group(1);                   
                    TNode book = new TNode(books,parent);
                    String book_el = book.getElement();
                    System.out.println("  + "+book_el);
                } 
        }
        catch(Exception e){
          
        }
     
    }
        
}

