package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class y2013p12 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader(("y2013p12.txt")));
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		System.out.println(morse.length);
		String line="";
		String newLine="";
		while((line=f.readLine())!=null && !line.equals(". ")){//iterate through file
			newLine="";//line
			for(int i=0;i<line.length();i++){ //iterate through letters
				try{//takes care of spaces and punctuation
					newLine+=morse[findAlphaNumber(line.charAt(i))];//get morse for letter
				}
				catch(ArrayIndexOutOfBoundsException e){
					newLine+="";
				}
			}
			//print
			if(palindrome(newLine)){
				System.out.println(line+" is a MCP");
			}
			else{
				System.out.println(line+" is *not* a MCP");
			}
		}
		f.close();
		System.exit(0);
	}
	public static Boolean palindrome(String s){
		if(s.equals(reverseString(s))){
			return true;
		}
		return false;
	}
	public static String reverseString(String s){
		String reversed ="";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	public static int findAlphaNumber(char s){
		int val;
		val = ((int)s-(int)'A');
		return val;
	}
}