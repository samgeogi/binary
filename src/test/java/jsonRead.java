import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonRead {
	public static String value;
	public static String readJSONData(String keyword){
		
		try {
		
			Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sam\\Desktop\\sa\\src\\test\\resources\\testData.json")); 
	          
	        JSONObject jo = (JSONObject) obj; 
	          
				System.out.println(jo);
				System.out.println("The keyword is "+keyword);
				value = (String)jo.get(keyword);
				System.out.println("The value is "+value);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ParseException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return value;
	}
}