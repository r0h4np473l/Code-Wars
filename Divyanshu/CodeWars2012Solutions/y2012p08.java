package CodeWars2012Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class y2012p08 {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader f = new BufferedReader(new FileReader("y2012p08.txt"));
		int[] letters = new int[26];
		String line="";
		//iterate through the end
		while((line = f.readLine())!=null && !(line.equals("###")))
		{
			//delete the crap
			line = replaceAllNonAlphanumericCharacters(line);
			//make it all uppercase
			line = line.toUpperCase();
			//iterate through the letters of each and add into the letter freq array
			for(int i=0;i<line.length();i++)
			{
				letters[findAlphaNumber(line.charAt(i))]++;
			}
		}
		displayHistogram(letters);
		System.exit(0);
	}
	//deletes all non letters from a string
	public static String replaceAllNonAlphanumericCharacters(String str)
	{
		return str.replaceAll("[^a-zA-Z]", "");
	}
	//converts integer to char
	public static int findAlphaNumber(char s)
	{
		int val;
		val = ((int)s-(int)'A');
		return val;
	}
	//Prints the problem in correct manner
	public static void displayHistogram(int[] freqs)
	{
		int max;
		int maxIndex=-1;
		for(int i =0;i<freqs.length;i++)
		{
			max = Integer.MIN_VALUE;
			for(int j=0;j<freqs.length;j++)
			{
				if(freqs[j]>max)
				{
					max = freqs[j];
					maxIndex=j;
				}
			}
			freqs[maxIndex]=-1;
			System.out.print((char)(maxIndex+(int)'A')+" ");
			for(int k=0;k<max;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}