package Question1;
import java.util.*;
import java.io.*;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.put("����ϼ","27");
		prop.put("��ԲԲ", "30");
		prop.put("�����Ȱ�", "23");
		
		FileWriter fw = new FileWriter("name.txt");
		
		prop.store(fw, "666");
		
		FileReader fr = new FileReader("name.txt");
		
		prop.load(fr);
		
		prop.forEach((x,y)->System.out.println(x+"\t\t"+y));

		fr.close();
	}

}
