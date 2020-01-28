package fp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.Scanner;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author logan
 */
public class Fp {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a wikipedia topic");
        String topic = input.nextLine();
        TNode rooted = new Tree().addRoot(topic);
        String top = rooted.getElement();
        System.out.println("--------------"+"\n"+top+"\n"+"--------------");
        
        
        final String url = "https://en.wikipedia.org/wiki/"+topic;
        try{
            final Document document = Jsoup.connect(url).get();
            Elements hrefs = document.select("a.mw-redirect");
            for(Element e: hrefs.subList(1,hrefs.size())){
                String links = e.attr("href");
                //System.out.println("\n"+links+"---------------"+"\n");
                
                
                final String urlsubtopic = "https://en.wikipedia.org"+links;
                    try{
                        final Document document_2 = Jsoup.connect(urlsubtopic).get();
                        Elements references = document_2.getElementsByClass("citation book");                       
                        Elements refis = references.select("i");
                        String subgroup = links +"+"+refis;                      
                        //System.out.println("TOPIC = "+links);
                        TNode parent = new TNode(links,rooted);
                        String subtops = parent.getElement();
                        System.out.println("--------------"+"\n"+"SUBTOPIC: "+subtops+"\n"+"- - - - - - - "+"\n"+"Citations: ");
                        parser.refs(subgroup,parent);
                        //printer.printT(rooted);
                        //System.out.println("test");
                        // issue is how do I return "subgroup" to another 
                        //class file within this for loop so I can generate nodes
                                
                        
                    }
                    catch(Exception ex_2){
                        ex_2.printStackTrace();
                    }
                
            }
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
    

