package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class y2014p08 {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("y2014p08.txt"));
		String line = "";
		//List to hold the words
		ArrayList<String> tokens = new ArrayList<String>();
		//temp token variable
		String wordToken ="";
		while((line = f.readLine())!=null && !line.equals("0 $")){
			//clear tokens list
			tokens.clear();
			//tokenizer to analyze word by word
			StringTokenizer st = new StringTokenizer(line);
			//store N
			int N = Integer.parseInt(st.nextToken());
			//Keep adding tokens to the list until the token is $
			while(!(wordToken = st.nextToken()).equals("$")){
				tokens.add(wordToken);
			}
			//print results
			System.out.println(tokens.get(tokens.size()-N));
		}
		System.exit(0);
	}
}
