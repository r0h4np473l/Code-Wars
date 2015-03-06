package solution2011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class y2011p11 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2011p11.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";
		String[] names = new String[4];
		StringTokenizer st = new StringTokenizer(line);
		int nameCount = 0;
		String tempName="";
		String function = "";
		ArrayList<String> wasRelation = new ArrayList<String>();
		ArrayList<String> beatRelation = new ArrayList<String>();
		while((line = f.readLine())!=null){
			st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				tempName = st.nextToken();
				names[nameCount]=tempName.substring(0, tempName.length()-1);
				System.out.println(names[nameCount]);
				tempName = st.nextToken();
				function = st.nextToken();
				if(function.equals("WAS")){
					wasRelation.add(tempName);
					wasRelation.add(st.nextToken());
				}
				else{
					beatRelation.add(tempName);
					beatRelation.add(tempName);
				}
			}
		}
		
		f.close();
		out.close();
		System.exit(0);
	}
}
