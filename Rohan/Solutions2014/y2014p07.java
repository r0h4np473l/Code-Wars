package Solutions2014;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class y2014p07 {
	static int totalNumber=0;
	static int length=0;

	public static void main(String[] args) 
	{
		Scanner input= new Scanner(System.in);
		Scanner scan= new Scanner(System.in);
		int numOfLines=input.nextInt();
		//create a two dimensional array, store the character and the value as a string, then convert the string using Integer.parseInt()
		//[I][1		]
		//[P][5		]
		//[D][10	]	
		//[H][100	]
		//[C][1000	]
		//[M][10000	]
		//CCPHHDDDDPII
		for(int i=0; i<numOfLines; i++)
		{
			String line= scan.nextLine();
			length=line.length();
			if(Pattern.matches("[a-zA-Z]+", line))
			{
				letterToNumber(line);
			}
			else
			{
				//call numberToLetter method
				//Showing Tony how to use Github and Eclipse. 
			}
		}
		System.out.println(totalNumber);
	}

	
	//converts the string to a number
	public static void letterToNumber(String line)
	{
		int j=0;
		int jAdd=1;
		while(j<length)
		{
			System.out.println("J Counter" + j);
			System.out.println("JAdd Counter" + jAdd);
			System.out.println();
			if((jAdd)==length)
			{
				//do nothing
			}
			else if(letterToNumberIndividually(line.charAt(j))<letterToNumberIndividually(line.charAt(jAdd)))
			{
				totalNumber=totalNumber+= (letterToNumberIndividually(line.charAt(j))*letterToNumberIndividually(line.charAt(jAdd)));
				System.out.println("Total number in else if statement" + totalNumber);
			}
			else
			{
				totalNumber=totalNumber+=letterToNumberIndividually(line.charAt(j));
				System.out.println("Total number in else statement " + totalNumber);
			}
			j++;
			jAdd++;
		}
	}
	//converts the character to the equivalent int value
	public static int letterToNumberIndividually(char c)
	{
		if(c=='C')
		{
			return 1000;
		}
		else if(c=='M')
		{
			return 10000;
		}
		else if(c=='H')
		{
			return 100;
		}
		else if(c=='D')
		{
			return 10;
		}
		else if(c=='P')
		{
			return 5;
		}
		else if(c=='I')
		{
			return 1;
		}
		return 0;
	}
	
	//converts a number to the equivalent alpha string
	public static String numberToLetter()
	{
		return "";
	}

}
