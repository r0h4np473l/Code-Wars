package CodeLibrary;

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
