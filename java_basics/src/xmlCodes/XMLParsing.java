package xmlCodes;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;

/**
 * 
 * @author pratyusk
 *
 */
public class XMLParsing {
	// String xml="<?xml version = \"1.0\"?><class><student rollno =
	// \"393\"><firstname>dinkar</firstname><lastname>kad</lastname><nickname>dinkar</nickname><marks>85</marks></student><student
	// rollno =
	// \"493\"><firstname>Vaneet</firstname><lastname>Gupta</lastname><nickname>vinni</nickname><marks>95</marks></student><student
	// rollno =
	// \"593\"><firstname>jasvir</firstname><lastname>singn</lastname><nickname>jazz</nickname><marks>90</marks></student></class>";
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File inputFile = new File(System.getProperty("user.dir")+"/files/myxml.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("book");
        System.out.println(nList.getLength());
        for(int i=0;i<nList.getLength();i++){
        	Node nNode = nList.item(i);
        	if (nNode.getNodeType() == Node.ELEMENT_NODE) {
        		System.out.println("==>"+((Element) nNode).getElementsByTagName("title").item(0).getTextContent());
        	}else{
        		System.out.println("test");
        	}
        }
	}
}
