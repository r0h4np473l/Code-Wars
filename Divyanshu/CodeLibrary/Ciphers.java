package CodeLibrary;
/**
 * 
 * @author Divyanshu
 * @description Holds all cipher codes: morse and caesar shifts.
 */
public class Ciphers {
	public static String convertToMorse(String s){
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String morseString="";
		for(int i=0;i<s.length();i++){ //iterate through letters
			try{//takes care of spaces and punctuation
				morseString+=morse[findAlphaNumber(morseString.charAt(i))];//get morse for letter
			}
			catch(ArrayIndexOutOfBoundsException e){
				morseString+="";
			}
		}
		return morseString;
	}
	
	public static String decipherCaesarShift(String s, int shift, char dir)
	{
		String newString="";
		int currIndex;
		if(dir=='L'){
			for(int i = 0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					currIndex = ((findAlphaNumber(s.charAt(i))-shift)+26)%26;
					newString+=(char)(currIndex+(int)'A');
				}
				else
				{
					newString+=' ';
				}
			}
		}
		else if (dir=='R')
		{
			for(int i = 0;i<s.length();i++)
			{

				if(s.charAt(i)!=' ')
				{
					currIndex = ((findAlphaNumber(s.charAt(i))+shift))%26;
					newString+=(char)(currIndex+(int)'A');
				}
				else
				{
					newString+=' ';
				}
			}
		}
		return newString;
	}
	public static int findAlphaNumber(char s)
	{
		int val;
		val = ((int)s-(int)'A');
		return val;
	}

}
