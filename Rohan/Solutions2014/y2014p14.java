package Solutions2014;

import java.util.ArrayList;
import java.util.Scanner;

public class y2014p14 {

	public static void main(String[] args) 
	{
		//Input
		Scanner input= new Scanner(System.in);
		int largestNumber=0; //initialize variables
		int highestPossibleNumber=0; //initialize variables
		String inputLine=input.nextLine(); //read in input
		int numOfWeights=Integer.parseInt(inputLine.substring(0,1)); //get the number of weights
		System.out.println(numOfWeights); //debug
		inputLine=inputLine + " "; //used to manipulate string
		ArrayList<Integer> numbers = new ArrayList<>(); //stores the weights
		
		//adds the weights into the arraylist
		for (int k=2; k<inputLine.length(); k+=1)
		{
			numbers.add(new Integer(inputLine.substring(k,k+=1)));
		}
		System.out.println(numbers);
		

	}
	

}

/* PSUEDO CODE
 * 
 * read in the strings. 
 * next isolate the first value. store that in a variable. 
 * next read in the other two values and store them in their own variables
 * start attempting to divide a number by each number until there is a remainder, then move onto the next number
 */