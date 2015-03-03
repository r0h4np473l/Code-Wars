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
		for(int i =0;i<numLines;i++){
			line = f.readLine();
			line=line.replace(".","");
			String totalString="";
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()&&(word = st.nextToken())!=null){
				totalString+=word+" ";
				if(word.equals("is")){
					if(st.hasMoreTokens() && !((word = st.nextToken()).equals("not")))
						totalString+=("not " + word +" ");
					else{
						if(st.hasMoreTokens()){
						word=st.nextToken();
						totalString+=(word+" ");
						}
					}
				}
			}
			System.out.println(totalString.substring(0,totalString.length()-1)+".");
			out.println(totalString.substring(0,totalString.length()-1)+".");
		}
		f.close();
		out.close();
		System.exit(0);
	}
}
