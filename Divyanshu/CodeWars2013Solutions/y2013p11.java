package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class y2013p11 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p11.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p11out.txt")));
		String line=f.readLine();
		System.out.println(line);
		int numLines = Integer.parseInt(line);	//7 lines
		String word = "";
		//iterate through file line by line
		for(int i =0;i<numLines;i++){
			//create the text line
			line = f.readLine();
			line=line.replace(".","");
			String totalString="";		//string to hold the processed line
			//create tokenized string with new line
			StringTokenizer st = new StringTokenizer(line);
			//iterate through the words
			while(st.hasMoreTokens()&&(word = st.nextToken())!=null){
				totalString+=word+" ";
				//if the word is 'is'
				if(word.equals("is")){
					//if the word after is not 'not' then write not
					if(st.hasMoreTokens() && !((word = st.nextToken()).equals("not")))
						totalString+=("not " + word +" ");
					else{ 	//if the word is not 'not'
						// if theres a word next
						if(st.hasMoreTokens()){
							word=st.nextToken();
							totalString+=(word+" ");
						}
					}
				}
			}
			//print it while removing the extra space at the end and adding a period 
			System.out.println(totalString.substring(0,totalString.length()-1)+".");
			out.println(totalString.substring(0,totalString.length()-1)+".");
		}
		//close
		f.close();
		out.close();
		System.exit(0);
	}
}
