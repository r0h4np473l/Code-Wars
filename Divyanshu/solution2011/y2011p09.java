package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class y2011p09 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2011p09.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String key=f.readLine();
		String tempString ="";
		while(!(tempString=f.readLine()).equals(".")){
			if(inKey(key,tempString)){
				System.out.print(tempString+" ");
				out.print(tempString+" ");
			}
		}
		f.close();
		out.close();
		System.exit(0);
	}
	public static Boolean inKey(String key, String word){
		for(int i=0;i<word.length();i++){
			if(key.indexOf(word.charAt(i))<0){
				return false;
			}
		}
		return true;
	}
}
