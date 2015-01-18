package Snippets;

import java.util.ArrayList;

public class Input {

	//Used to test methods
	public static void main(String args[])
	{
		sentenceToWords("Test Sentence testing the sentence of course making sure it works");

	}

	//Takes a String and breaks it up and then stores it in an ArrayList
	static void sentenceToWords(String sentence)
	{
		if(sentence.charAt(sentence.length()-1)==' ')
		{
			//do nothing
		}
		else
		{
			sentence= sentence + " ";
		}
		ArrayList <String> words = new ArrayList<>();
		boolean keepGoing=true;
		while(keepGoing)		
		{
			int spaceIndex=sentence.indexOf(" ");
			if(spaceIndex==-1)
			{
				keepGoing=false;
			}
			else
			{	
				words.add(sentence.substring(0,spaceIndex));
				sentence = sentence.substring(spaceIndex+=1);
			}
		}
		printArraylistContents(words); //Uses the next method printArraylistContents to print out the contents of the ArrayList
	}

	//prints out the contents of the ArrayList
	static void printArraylistContents(ArrayList array)
	{
		for(int i=0; i<array.size(); i++)
		{
			System.out.println(array.get(i));
		}
	}


}
