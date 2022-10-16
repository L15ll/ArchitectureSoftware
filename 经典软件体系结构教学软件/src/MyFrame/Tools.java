package MyFrame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Tools {
	public static String output(String url) {
		StringBuilder result = new StringBuilder();
		try{
			BufferedReader br = new BufferedReader(new FileReader(url));//构造一个BufferedReader类来读取文件
			String s = null;
			while((s = br.readLine())!=null){//使用readLine方法，一次读一行
				result.append(System.lineSeparator()+s);
		}
		br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result.toString();
	}
	
	public static void input(String string) {
		try {
			PrintWriter pw = new PrintWriter("input.txt");
	        pw.print(string);
	        pw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}
}
