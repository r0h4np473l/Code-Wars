package Solutions2014;

import java.util.ArrayList;
import java.util.Scanner;

public class y2014p10 {

	static char[] alphabet={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static char[] input;
	static ArrayList<Character> outputSeparated= new ArrayList<>();
	public static void main(String[] args) 
	{
		//HELLO
		Scanner scan= new Scanner(System.in);
		String line=scan.nextLine();
		input=new char[line.length()];
		line.getChars(0, line.length(), input, 0);
		for(int j=0; j<line.length(); j++)
		{
			for(int i=0; i<26; i++)
			{
				if(alphabet[i]==input[j])
				{
						if(outputSeparated.get(j)==input[j])
						{
							outputSeparated=shiftArrayList(outputSeparated, j);
						}
						else
						{
							System.out.println("Test");

							outputSeparated.set(j, input[j]);
						}
					}
					else
					{
						outputSeparated.add(input[j]);
					}
				}
			}
		
	System.out.println(outputSeparated);
	}
	public static ArrayList<Character> shiftArrayList(ArrayList<Character> arraylist, int index)
	{
		ArrayList <Character> temporaryArrayList = new ArrayList<>();
		int iAdd=index+=1;
		for(int i=index; i< arraylist.size(); i++){
			temporaryArrayList.set(iAdd, arraylist.get(i));
			iAdd++;
		}
		return temporaryArrayList;
	}

}
