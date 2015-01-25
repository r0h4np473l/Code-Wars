package Solutions2014;

import java.util.ArrayList;
import java.util.Scanner;
//NOT WORKING CODE
public class y2014p10 {

	static char[] alphabet={'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	static char[] input;
	static String decodedString="t";
	static int pointerIndex=0;
	public static void main(String[] args) 
	{
//NOT WORKING CODE
		//HELLO
		Scanner scan= new Scanner(System.in);
		String line=scan.nextLine();
		input=new char[line.length()];
		line.getChars(0, line.length(), input, 0);
		decodedString=decodedString + input[0];
		for(int i=1; i<line.length()-1; i++)
		{
			for (int j=0;j<26; j++)
			{
//NOT WORKING CODE
				System.out.println("running...for loop");
				if(alphabet[j]==input[i])
				{
					System.out.println("running...if loop");
					decodedString=decodedString.substring(0,i) + alphabet[j] + decodedString.substring(i++);
				}
			}
		}
		System.out.println(decodedString);
	}
	
//NOT WORKING CODE
}
