package CodeWars2012Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class y2012p10 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2012p10.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2012p10out.txt")));
		//Create the deck of cards
		String[] nums = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suites = {"C","D","H","S"};
		String[] all= new String[52];
		int i=0;
		while(i<52){
			for(int j=0;j<nums.length;j++){
				for(int k=0;k<suites.length;k++){
					all[i] = nums[j]+suites[k];
					i++;
				}
			}
		}
		
		int numOfLines = Integer.parseInt(f.readLine());
		Arrays.sort(all);
		//create a frequency table of the cards
		int[] freqs = new int[52];
		String line="";
		int index=0;
		while((line=f.readLine())!=null)
		{
			 StringTokenizer st = new StringTokenizer(line);
			 while(st.hasMoreTokens())
			 {
				 index=Arrays.binarySearch(all, st.nextToken());
				 freqs[index]++;
			 }
		}
		
		out.println("Missing Cards:");
		for(int l=0;l<freqs.length;l++){
			if(freqs[l]==0){
				out.print(all[l] + " ");
			}
		}
		out.println();
		out.println();
		out.println("Extra Cards:");
		for(int l=0;l<freqs.length;l++){
			if(freqs[l]>1){
				out.print(all[l] + " ("+(freqs[l]-1)+") ");
			}
		}
		out.close();
		f.close();
		System.exit(0);
	}
}