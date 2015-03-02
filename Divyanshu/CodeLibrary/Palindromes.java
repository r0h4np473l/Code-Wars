package CodeLibrary;
/**
 * @author Divyanshu Gandhi
 * @description All the stuff needed for testing palindromes.
 * CodeWars 2015
 */

public class Palindromes {

	/**
	 * Returns the reverse of a number i.e. 234 will return 432 
	 */
	public static int reverse(int n){
		int reverse = 0;
		while( n != 0 ){
			reverse *= 10; reverse += n%10; n /=10;
		}
		return reverse;
	}
	
	/**
	 * Returns true if the number is a palindrome i.e. 9009 will return true 
	 */
	public static boolean numPalindrome(int num){
		if(num == reverse(num)){ 
			return true;
		}
		return false;
	}
	
	/**
	 *  Returns a string as the reverse of that string, // ie "michael" will return "leahcim"
	 */
	public static String reverseString(String s){
		String reversed ="";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	
	/**
	 * checks if string is palindrome
	 */
	public static Boolean palindrome(String s){
		if(s.equals(reverseString(s))){
			return true;
		}
		return false;
	}
}