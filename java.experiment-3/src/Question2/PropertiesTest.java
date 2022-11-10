package Question2;

import java.io.*;
import java.util.Properties;
import java.util.*;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
			
		FileReader fr = new FileReader("prop.txt");
		
		prop.load(fr);
		fr.close();
		prop.forEach((nam,num)->System.out.println(nam+"\t"+num));
	
		
		System.out.println();
		Set<String> key = prop.stringPropertyNames();
		for(String k:key){
			if(k.equals("lisi"))
					prop.setProperty(k, "100");
		}
		
	
		FileWriter fw = new FileWriter("prop.txt");
		prop.store(fw, null);
		prop.forEach((x,y)->System.out.println(x+"\t"+y));
		fw.close();
	}

}
