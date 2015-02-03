package Solutions2012;

import java.util.Scanner;

public class y2012p09 {

	static char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
		'X', 'Y', 'Z' };

	static char[] finalString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();

		int indexOfKey = inputString.indexOf("KEY ");
		int indexOfDecodingString = indexOfKey += 4;

		String decodingString = inputString.substring(indexOfDecodingString);
		int shiftSize = decodingString.length();

		// Search and replace
		String message = inputString.substring(0, indexOfKey-=4);
		int messageLength = message.length();
		finalString = new char[messageLength];
		message.getChars(0, indexOfKey, finalString, 0);
		int newLetterIndex;
		for (int i = 0; i < messageLength; i++) 
		{
			for (int j = 0; j < 26; j++) 
			{
				if (finalString[i] == letters[j]) 
				{
					int jMutable=j;
					int letterIndex = jMutable -= shiftSize;

					if (letterIndex < 0) 
					{
						newLetterIndex = (int) (26.0 - Math.abs((double) letterIndex));
					} 
					else 
					{
						newLetterIndex = letterIndex;
					}

					finalString[i] = letters[newLetterIndex];
				}
			}
		}
	
		//Print out
		
		for(int i=0; i<finalString.length; i++)
		{
			System.out.print(finalString[i]);
		}
	
	}

}
