package CodeLibrary;
/**
 * @author Divyanshu Gandhi
 * @description Used for strings and stuff. Converting char to int so that 'A'=0 'B'=1 etc. Also recursive
 * string permutations and converting a string to a letter array. Refining strings, taking out punctuation 
 * and/or taking out everything thats not a letter.
 * 
 * CodeWars 2015
 */
import java.util.ArrayList;
import java.util.Arrays;


public class StringsAndChars {
	public static void main(String[] args){
		String s = "abcd";
		//System.out.println(Arrays.toString(stringToLetterArray(s,10)));
		//System.out.println(Arrays.toString(stringToLetterArray(s)));
		//s = s.toUpperCase();
		//s = s.toLowerCase();
		//System.out.println(s.getChars());
		permutation("",s);
		System.out.println(allPerms.toString());
	}
	/**
	 * used for capital letters
	 */
	public static int findAlphaNumber(char s){
		int val;
		val = ((int)s-(int)'A');
		return val;
	}
	//converts a string to an array of letters, input a maximum length of array and the string
	//any left overs will be null
	//BTW THERE IS ALREADY A METHOD FOR THIS. ITS CALLED getChars
	//i looked at getChars and it confusing and too many parameters so w/e idrc
	public static String[] stringToLetterArray(String s,int max){
		String[] sarr= new String[max];
		for(int i =0;i<s.length();i++){
			sarr[i] = ""+s.charAt(i);
		}
		return sarr;
	}	
	//converts a string to an array of letters, input a maximum length of array and the string
	public static String[] stringToLetterArray(String s){
		String[] sarr= new String[s.length()];
		for(int i =0;i<s.length();i++){
			sarr[i] = ""+s.charAt(i);
		}
		return sarr;
	}
	//recursion to get permutations of a string
	private static ArrayList<String> allPerms = new ArrayList<String>();
	private static void permutation(String prefix, String str){
		int n = str.length();
		if (n == 0){
			System.out.println(prefix);
			allPerms.add(prefix);
		}
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
		}
	}

	public static String removePunctuation(String s){
		return s.replaceAll("\\p{P}", "");
	}
	public static String replaceAllNonAlphanumericCharacters(String str){
		return str.replaceAll("[^a-zA-Z]", "");
	}
}