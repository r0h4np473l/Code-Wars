package CodeLibrary;
/**
 * @author Divyanshu Gandhi
 * @description All the stuff needed for pangrams, strings with every single letter used.
 * CodeWars 2015
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Pangrams {
	public static void main(String[] args) throws IOException {
	    //test file found under codewars 2014 problem 5
			BufferedReader f = new BufferedReader(new FileReader("y2014p05.txt"));
			String line = "";
			while((line = f.readLine())!=null){
				int[] letterCount = new int[26];
				String sent = replaceAllNonAlphanumericCharacters(line);
				for(int j=0;j<sent.length();j++){
					letterCount[((int)sent.charAt(j)-(int)'A')]++;
				}
				if(checkPangram(letterCount)){
					if(checkPerfect(letterCount))
						System.out.println("PERFECT: " + line);
					else
						System.out.println("PANGRAM: " + line);
				}
				else
					System.out.println("NEITHER: " + line);
			}
			f.close();
			System.exit(0);
		}
		//returns text without puncutation and spaces
		public static String replaceAllNonAlphanumericCharacters(String str){
			return str.replaceAll("[^a-zA-Z]", "");
		}
		//argument is a frequency table of letters, checks to see if all letters are used
		public static Boolean checkPangram(int[] letters){
			int i=0;
			while(letters[i]!=0){
				i++;
				if(i==letters.length)
					return true;
			}
			return false;
		}
		//argument is a frequency table of letters, checks if all letters are 1
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