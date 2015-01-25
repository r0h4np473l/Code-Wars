package Solutions2014;

import java.util.ArrayList;
import java.util.Scanner;

public class y2014p14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		String inputLine= input.nextLine();
		int index=inputLine.indexOf(" ");
		int numOfWeights= Integer.parseInt(inputLine.substring(0, index));
		inputLine=inputLine.substring(index++);
		ArrayList <Integer> weights = new ArrayList<>();
		for(int i=0; i<numOfWeights; i++)
		{
			index=inputLine.indexOf(" ");
			inputLine=inputLine.substring(index++);
			System.out.print(inputLine);
			weights.add(Integer.parseInt(inputLine.substring(0, index)));
		}
		System.out.println(weights);
	}

	public static void numOfBeans()
	{

	}

}

/* PSUEDO CODE
 * 
 * read in the strings. 
 * next isolate the first value. store that in a variable. 
 * next read in the other two values and store them in their own variables
 * start attempting to divide a number by the two other numbers
 */