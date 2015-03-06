package CodeWars2013Solutions;
//UNFINISHED
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class y2013p18 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader(("y2013p18.txt")));
		int numRowOfScramble = Integer.parseInt(f.readLine());
		int numRowOfInput = Integer.parseInt(f.readLine());
		String[] scramble = new String[numRowOfScramble];
		String line="";
		int k=0;
		for(int i = 0; i<numRowOfInput;i++){
			line = f.readLine();
			line =replaceAllNonAlphanumericCharacters(line);
			line = line.toUpperCase();
			for(int j =0;j<line.length();j++){
				if(scramble[k]==null){
					scramble[k]=""+line.charAt(j);
				}
				else
					scramble[k]+=""+line.charAt(j);
				k++;
				k%=numRowOfScramble;
			}
		}
		
		int numOfWords = Integer.parseInt(f.readLine());
		String testWord = "";
		ArrayList<Integer> indeces = new ArrayList<Integer>();
		
		ArrayList<Integer> numOccurence = new ArrayList<Integer>();
		System.out.println(diagonol(scramble,scramble[0].length()));
		for(int i=0;i<numOfWords;i++){
			testWord=f.readLine();
			
		}
		
	}
	public static String replaceAllNonAlphanumericCharacters(String str){
		return str.replaceAll("[^a-zA-Z]", "");
	}
	public static int findSmallestSize(String[] s){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<s.length;i++){
			if(min>s[i].length()){
				min = s[i].length();
			}
		}
		return min;
	}
	public static String diagonol(String[] s, int i){
		String newString=""+s[0].charAt(i);
		for(int j=1;j<s.length;j++){
			i++;
			try{
			newString+=s[j].charAt(i);
			}
			catch(StringIndexOutOfBoundsException e){
				return newString;
			}
		}
		return newString;
	}
	public static String reverseString(String s){
		String reversed ="";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
}
