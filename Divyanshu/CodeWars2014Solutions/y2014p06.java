package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class y2014p06 {
	public static void main(String[] args) throws IOException {
		//write key
		String[] negatives = {"DONT","CANT","ISNT","HAVENT","CANNOT","WOULDNT","COULDNT","WONT","NO","NOT","NEVER","NOBODY","NOWHERE","NEITHER","AINT"};
		
		BufferedReader f = new BufferedReader(new FileReader("y2014p06.txt"));
		String line="";
		String origLine=""; //created solely to print out line correctly
		ArrayList<String> tokens = new ArrayList<String>();	//arraylist
		//continue until end or '.'
		while((origLine = f.readLine())!=null && !origLine.equals(".")){
			line = origLine.replaceAll("\\p{P}", ""); //take out all punctuation
			tokens.clear();	//delete tokens
			int count = 0;
			StringTokenizer st = new StringTokenizer(line);	//take word by word, save into list
			while(st.hasMoreTokens()){
				tokens.add(st.nextToken());
			}
			//iterates through both arrays
			for(int i =0;i<negatives.length;i++){
				for(int j=0;j<tokens.size();j++){
					//checks if equivalent
					if(tokens.get(j).equals(negatives[i]))
						count++;
				}
			}
			//print results
			System.out.println(count+":"+origLine);	
		}
		f.close();
		System.exit(0);
	}
}