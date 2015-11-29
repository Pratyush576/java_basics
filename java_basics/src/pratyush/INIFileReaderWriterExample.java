package pratyush;


/*
 * How to read and write value for an .ini
 * file on Java Environment Example
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @author pratyush
 */
public class INIFileReaderWriterExample {

	public static void main(String[] args) {

		//appending to the file
		//appending file functionality can be modified by changing true and false parameter of
		//FileOutputStream object if the parameter is set to false
		//it will remove all content of ini file
		//of it is set to true it will append the new key/value pairs
		INIFileReaderWriterExample.writeKeyValuePairsINIFile("java", "James Gosling");
		INIFileReaderWriterExample.writeKeyValuePairsINIFile("linux", "Linus Torvalds");
		INIFileReaderWriterExample.writeKeyValuePairsINIFile("microsoft", "Bill Gates");

		INIFileReaderWriterExample.readINIFile();

		Map<String, String> keyValueMapXML = new HashMap<String, String>();
		keyValueMapXML.put("book1", "How to program Java");
		keyValueMapXML.put("book2", "PL/SQL programming best practices");
		keyValueMapXML.put("book3", "ORACLE Performance Tuning");

		//storing key values a XML inside .ini file
		INIFileReaderWriterExample.writeKeyValuePairsINIFileXML(keyValueMapXML);

		//reading the XML key value pairs inside .ini file
		INIFileReaderWriterExample.readINIFileXML();
	}
	private static void readINIFile() {

		try {
			Properties props = new Properties();
			//loading the .ini file under ini folder
			props.load(new FileInputStream(System.getProperty("user.dir")+"/ini/"+"example.ini"));
			System.out.println("access with the key java = >> " + props.getProperty("java"));
			System.out.println("access with the key linux = >> " + props.getProperty("linux"));
			System.out.println("access with the key microsoft = >> " + props.getProperty("microsoft"));
			props.list(System.out);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void readINIFileXML() {

		try {
			Properties props = new Properties();
			//loading the .ini file under ini folder
			props.load(new FileInputStream(System.getProperty("user.dir")+"/ini/"+"example.ini"));
			props.loadFromXML(new FileInputStream(System.getProperty("user.dir")+"/ini/"+"example.ini"));
			System.out.println(props.getProperty("book3"));
			System.out.println(props.getProperty("book2"));
			System.out.println(props.getProperty("book1"));
			System.out.println("Hash Code for the map: "+props.hashCode());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void writeKeyValuePairsINIFile(String key,String value) {

		try {
			Properties props = new Properties();
			//loading the .ini file under ini folder
			props.load(new FileInputStream(System.getProperty("user.dir") + "/ini/" + "example.ini"));
			props.setProperty(key, value);
			props.store(new FileOutputStream(System.getProperty("user.dir")
					+ "/ini/" + "example.ini", true), "Here you can enter comment");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
	private static void writeKeyValuePairsINIFileXML (Map<String, String> keyValuePairs) {

		try {
			Properties props = new Properties();
			//loading the .ini file under ini folder
			props.load(new FileInputStream(System.getProperty("user.dir") + "/ini/" + "example.ini"));
			Iterator mapInterator = keyValuePairs.entrySet().iterator();
			while (mapInterator.hasNext()) {
				Map.Entry<String, String> pairs = (Map.Entry) mapInterator.next();
				props.setProperty(pairs.getKey(), pairs.getValue());
			}
			props.storeToXML(new FileOutputStream(System.getProperty("user.dir")
					+ "/ini/" + "example.ini", false), "Here you can enter comment");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}