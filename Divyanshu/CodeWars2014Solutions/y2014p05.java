package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class y2014p05 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2014p05.txt"));
		
		String line = "";
		while((line = f.readLine())!=null){
			//creates frequency table
			int[] letterCount = new int[26];
			//sent is the sentence with only the letters
			String sent = replaceAllNonAlphanumericCharacters(line);
			//iterate through the string 'sent'
			for(int j=0;j<sent.length();j++){
				//add to the table
				letterCount[((int)sent.charAt(j)-(int)'A')]++;
			}
			//if statements
			if(checkPangram(letterCount)){
				if(checkPerfect(letterCount))
					System.out.println("PERFECT: " + line);
				else
					System.out.println("PANGRAM: " + line);
			}
			else
				System.out.println("NEITHER: " + line);
		}
		System.exit(0);
	}
	//deletes spaces and punctuation
	public static String replaceAllNonAlphanumericCharacters(String str){
		return str.replaceAll("[^a-zA-Z]", "");
	}
	//checks if all letters are used
	public static Boolean checkPangram(int[] letters){
		int i=0;
		while(letters[i]!=0){
			i++;
			if(i==letters.length)
				return true;
		}
		return false;
	}
	//checks if all frequencies occur once
	public static Boolean checkPerfect(int[] letters){
		int i=0;
		while(letters[i]==1){
			i++;
			if(i==letters.length)
				return true;
		}
		return false;
	}
}
