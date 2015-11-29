package pratyush;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonobj {
	public static void main(String args[]) throws IOException, ParseException{
	
	JSONObject obj=new JSONObject();
	obj.put("name","foo");
    obj.put("num",new Integer(100));
    obj.put("balance",new Double(1000.21));
    obj.put("is_vip",new Boolean(true));
	JSONObject obj1=new JSONObject();
	obj1.put("arg1", 123);
	obj1.put("arg2", 456);
	obj.put("js", obj1);

    

    StringWriter out = new StringWriter();
    obj.writeJSONString(out);
    
    String jsonText = out.toString();
    System.out.println(jsonText);
    
    System.out.println("\n"+obj.get("js"));
    JSONObject temp=(JSONObject) obj.get("js");
    
    System.out.println(temp.get("arg1"));
    StringWriter sw=new StringWriter();
    JSONValue.writeJSONString(obj, sw);
    System.out.println(sw.toString());
    
    
    //==========================================================
    
 
    
    
    		
	}
	
	


}
