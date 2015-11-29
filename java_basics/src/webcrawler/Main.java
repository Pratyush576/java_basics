package webcrawler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import org.bouncycastle.crypto.macs.HMac;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {

	public static long count=0;
	public static HashMap<String , String> hm=new HashMap<String, String>();
	public static void processPage(String URL) throws SQLException, IOException{
		if(hm.containsKey(URL)){

		}else{



			hm.put(URL, URL);
			count++;

			System.out.println(count+":"+URL);
			try {
				Document doc = Jsoup.connect(URL).get();
				//System.out.println(URL);
				//get all links and recursively call the processPage method
				Elements questions = doc.select("a[href]");
				//System.out.println(questions);
				for(Element link: questions){
					//System.out.println(link);
					if(link.attr("href") != null){//.contains("jabong.com"))
						//System.out.println(link.attr("abs:href"));
						if(link.attr("abs:href").toString().contains("jabong.com/")){
							//System.out.println(link.attr("abs:href"));
							processPage(link.attr("abs:href"));
						}


					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws SQLException, IOException   {

		processPage("http://www.jabong.com/");

	}

}
