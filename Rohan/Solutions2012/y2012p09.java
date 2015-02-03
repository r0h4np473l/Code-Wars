package Solutions2012;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class y2012p09 {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z' };

		char[] finalString;
		// Input
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		//BufferedReader input = new BufferedReader(new FileReader("y2012p09.txt"));
		//String inputString1 = input.readLine();
		//String inputString = input.readLine();
		int indexOfKey = inputString.indexOf("KEY ");
		int indexOfDecodingString = indexOfKey += 4;

		String decodingString = inputString.substring(indexOfDecodingString);
		int shiftSize = 4;	//decodingString.length();

		// Search and replace
		String message = inputString.substring(0, indexOfKey-=4);
		int messageLength = message.length();
		finalString = new char[messageLength];
		message.getChars(0, indexOfKey, finalString, 0);
		int newLetterIndex;
		Boolean foundCharacter=false;
		for (int i = 0; i < messageLength; i++) 
		{
			if(finalString[i]!=' ')
			{
				foundCharacter=false;
				int j=0;
				//for (int j = 0; j < 26; j++) <== This is what was wrong
				while(j<26 && !foundCharacter)
				{
					if (finalString[i] == letters[j] ) 
					{
						//int jMutable=j;
						int letterIndex = j - shiftSize;

						if (letterIndex < 0) 
						{
							//newLetterIndex = (int) (26.0 - Math.abs((double) letterIndex));
							newLetterIndex = (letterIndex)+26;
						} 
						else 
						{
							newLetterIndex = letterIndex;
						}
						finalString[i] = letters[newLetterIndex];
						foundCharacter=true;
					}
					j++;
				}
			}
		}

		//Print out
		//System.out.println(Arrays.toString(finalString));
		
		for(int i=0; i<finalString.length; i++)
		{
			System.out.print(finalString[i]);
		}

	}

}
