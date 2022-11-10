package Question3;
import java.util.*;
import java.io.*;
import java.lang.Integer;
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties prop =new Properties();
		FileReader fr = new FileReader("count.txt");
		prop.load(fr);
		fr.close();
		
		String value=prop.getProperty("count");
		int number = Integer.parseInt(value);
		
		if(number--<=1) {
			System.out.println("游戏试玩已结束，请付费");
			System.exit(0);
		}else {
			
			System.out.print("您还有"+number+"次实验机会");
			FileWriter fw = new FileWriter("count.txt");
			prop.setProperty("count",String.valueOf(number));
			prop.store(fw, null);
			fw.close();
			
			
		}
		
	}

}
