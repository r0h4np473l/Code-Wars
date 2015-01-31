package Solutions2012;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class y2012p08 {

	//Instantiation of variables- arrays
	static char[] letters= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static String[] count= {"","","","","","","","","","","","","","","","","","","","","","","","","",""};
	static int[] lengths;
	static String[] sortedCount;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader f = new BufferedReader(new FileReader("y2012p08.txt"));
		//Instantiation of variables
		String line="";
		
		//Input
		
		Scanner input= new Scanner(System.in);
		//while (line != "###")
		while((line = f.readLine())!=null && !(line.equals("###")))
		{
			line=input.nextLine();
			countLetters(line);
			sortedCount=insertionSort(count);
			printHistogram(sortedCount);
		}
		
	}
	
	public static void countLetters(String line)
	{
		for(int i=0;i<line.length(); i++)
		{
			for(int j=0; j<26; j++)
			{
				if(line.charAt(i)==letters[j])
				{
					count[j] = count[j] + "*";
				}
			}
		}
	}
	
	public static String[] insertionSort(String[] arr) {
	    for(int i=1;i<arr.length;i++) {
	        int j = 0;
	        for(;j<i;j++) {
	            if(arr[j].length() > arr[j+1].length()) {
	                String temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	    return arr;
	}
	
	public static void printHistogram(String[] arr)
	{
		for(int i=0; i<26; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
