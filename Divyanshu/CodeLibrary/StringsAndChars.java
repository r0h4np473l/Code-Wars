package CodeLibrary;

import java.util.ArrayList;
import java.util.Arrays;


public class StringsAndChars {
	public static void main(String[] args){
		String s = "hello";
		System.out.println(Arrays.toString(stringToLetterArray(s,10)));
		System.out.println(Arrays.toString(stringToLetterArray(s)));
	}
	//used for capital letters
	public static int findAlphaNumber(char s){
		int val;
		val = ((int)s-(int)'A');
		return val;
	}
	//converts a string to an array of letters, input a maximum length of array and the string
	//any left overs will be null
	public static String[] stringToLetterArray(String s,int max){
		String[] sarr= new String[max];
		for(int i =0;i<s.length();i++){
			sarr[i] = ""+s.charAt(i);
		}
		return sarr;
	}
	//recursion to get permutations of a string
	//Recursive Code taken from http://learnprogramming.machinesentience.com/java_permutations_recursion/
	private static ArrayList<String> allPerms = new ArrayList<String>();
	private static void permutation(String prefix, String str){
		int n = str.length();
		if (n == 0){
			//System.out.println(prefix);
			allPerms.add(prefix);
		}
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
		}
	}
	//converts a string to an array of letters, input a maximum length of array and the string
	public static String[] stringToLetterArray(String s){
		String[] sarr= new String[s.length()];
		for(int i =0;i<s.length();i++){
			sarr[i] = ""+s.charAt(i);
		}
		return sarr;
	}
	public static String removePunctuation(String s){
		return s.replaceAll("\\p{P}", "");
	}
	public static String replaceAllNonAlphanumericCharacters(String str){
		return str.replaceAll("[^a-zA-Z]", "");
	}
}
