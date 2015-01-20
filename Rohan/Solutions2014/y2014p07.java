package Solutions2014;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class y2014p07 {
	static int totalNumber=0;
	static int length=0;
	static int exponent=0;

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
				System.out.println(totalNumber);
			}
			else
			{
				System.out.print(numberToLetter(Integer.parseInt(line)));
			}
		}
	}


	//converts the string to a number
	public static void letterToNumber(String line)
	{
		int j=0;
		int jAdd=1;
		while(j<length)
		{
			if((jAdd)==length)
			{
				//do nothing
				totalNumber=totalNumber += letterToNumberIndividually(line.charAt(j));
			}
			else if(letterToNumberIndividually(line.charAt(j))<letterToNumberIndividually(line.charAt(jAdd)))
			{
				totalNumber=totalNumber+= (letterToNumberIndividually(line.charAt(j))*letterToNumberIndividually(line.charAt(jAdd)));
				j++;
				jAdd++;
			}
			else if(letterToNumberIndividually(line.charAt(j))>letterToNumberIndividually(line.charAt(jAdd)))
			{
				totalNumber=totalNumber+=letterToNumberIndividually(line.charAt(j));
			}
			else 
			{
				totalNumber=totalNumber+=letterToNumberIndividually(line.charAt(j));
			}
			j+=1;
			jAdd+=1;
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
	public static String numberToLetter(int number)
	{
		String convertedString="";
		String numberToString=Integer.toString(new Integer(number));
		int iAdd=1;
		for(int i=0; i<numberToString.length(); i++)
		{
			int digit=Integer.parseInt(Character.toString(numberToString.charAt(i)));
			exponent=numberToString.length()-iAdd;
			if(digit>4)
			{
				convertedString=convertedString + "P" + loop(digit-5);
			}
			/*else if(digit==5 && numberToString.length()==1) 
			{
				convertedString=convertedString + "P";
			}*/
			else
			{
				convertedString=convertedString + loop(digit);
			}
			iAdd++;
		}

		if(convertedString.endsWith("I"))
		{
			return convertedString.substring(0, convertedString.length()-1);
		}
		return convertedString;
	}

	public static String loop(int times)
	{
		times++;
		String addedLetter="";
		String finalString="";
		switch(exponent)
		{
		case 1: addedLetter= addedLetter + "D";
		break;
		case 2: addedLetter= addedLetter + "H";
		break;
		case 3: addedLetter= addedLetter + "C";
		break;
		case 4: addedLetter= addedLetter + "M";
		break;
		case 0: addedLetter= addedLetter + "I";
		break;
		}
		for(int i=0; i<times; i++)
		{
			finalString=finalString + addedLetter;
		}
		return finalString;
	}

}
