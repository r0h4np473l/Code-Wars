package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class y2013p08 {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("y2013p08.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("y2013p08out.txt")));
		int[] letters = new int[26];
		String line="";
		while((line = f.readLine())!=null && !(line.equals(". ")))
		{
			letters = new int[26];
			line = replaceAllNonAlphanumericCharacters(line);
			line = line.toUpperCase();
			for(int i=0;i<line.length();i++)
			{
				letters[findAlphaNumber(line.charAt(i))]++;
			
			}
			//System.out.println(Arrays.toString(letters));
			System.out.println(line+" "+usedTwo(letters));
			out.println(line+" "+usedTwo(letters));
		}
		out.close();
		System.exit(0);
		f.close();
	}
	public static String replaceAllNonAlphanumericCharacters(String str)
	{
		return str.replaceAll("[^a-zA-Z]", "");
	}
	public static int findAlphaNumber(char s)
	{
		int val;
		val = ((int)s-(int)'A');
		return val;
	}
	public static String usedTwo(int[] letters){
		for(int i=0;i<letters.length;i++){
			if(letters[i]>1){
				return "DOES NOT USE DISTINCT LETTERS";
			}
		}
		return "USES DISTINCT LETTERS";
	}
}
