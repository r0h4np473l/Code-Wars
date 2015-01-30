package Solutions2012;

import java.util.Scanner;

public class y2012p04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input
		Scanner input= new Scanner(System.in);
		String inputValue= input.nextLine();
		String word= inputValue.substring(0, inputValue.indexOf(" "));
		int spaceIndex= inputValue.indexOf(" ");
		String stringWithoutWord = inputValue.substring(spaceIndex+=1);
		int spaceIndex2= stringWithoutWord.indexOf(" ");
		String letterToReplace = stringWithoutWord.substring (0, spaceIndex2 );
		String replaceLetter= stringWithoutWord.substring(spaceIndex2+=1);
	
		//String manipulation
		int indexOfLetterToReplace=inputValue.indexOf(letterToReplace, 0);
		int lengthOfLetterToReplace=letterToReplace.length();
		String newString= inputValue.substring(0,indexOfLetterToReplace) + replaceLetter + inputValue.substring(indexOfLetterToReplace+lengthOfLetterToReplace, inputValue.indexOf(" "));
		
		//Output
		System.out.println(newString);
	
	}

	
}
