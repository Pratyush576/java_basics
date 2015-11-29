package pratyush;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;


public class XMLParsing {
	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException{
		File fl= new File("/home/pratyush/Desktop/test.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fl);
		doc.getDocumentElement().normalize();
		System.out.println("Root element :"+ doc.getDocumentElement().getNodeName());
		NodeList nList = doc.getElementsByTagName("product");
		System.out.println(nList);
		System.out.println("----------------------------");
        for (int temp = 0; temp < nList.getLength(); temp++) {
        	//System.out.println(nList.item(temp));
        	Node nNode=nList.item(temp);
        	System.out.println("\nCurrent Element :" + nNode.getNodeName());
        	if (nNode.getNodeType() == Node.ELEMENT_NODE) {
        		//System.out.println("if");
        		Element eElement = (Element) nNode;
                System.out.print(eElement.getAttribute("id")+"\t");
                System.out.println(eElement.getElementsByTagName("name").item(0).getTextContent());
        	}
        	else{
        		System.out.println("else");
        	}
        }

	}
}
