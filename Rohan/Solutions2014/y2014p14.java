package Solutions2014;

import java.util.ArrayList;
import java.util.Scanner;

public class y2014p14 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int largestNumber=0;
		int highestPossibleNumber=0;
		String inputLine=input.nextLine();
		int numOfWeights=Integer.parseInt(inputLine.substring(0,1));
		System.out.println(numOfWeights);
		inputLine=inputLine + " ";
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int k=2; k<inputLine.length(); k+=1)
		{
			numbers.add(new Integer(inputLine.substring(k,k+=1)));
		}
		System.out.println(numbers);

		//2 digits
		int i;
		if(numOfWeights==2)
		{
			highestPossibleNumber=numbers.get(0) * numbers.get(1);
			for(i=1; i<highestPossibleNumber; i++)
			{

				System.out.println("running for loop");//debug
					while(i%numbers.get(0)==0)
					{
						i=i/numbers.get(0);
						System.out.println("running first while" +  "i value" + i);//debug
					}
					while(i%numbers.get(1)==0)
					{
						System.out.println("i" + i);
						System.out.println(i%numbers.get(1));
						i=i/numbers.get(1); //(1)
						System.out.println("running second while" + "i value" + i);//debug
					}//gets stuck in these while loops, need to figure out a better way of ending them. gets stuck in infinite loop.
					// at (1) the value is changed to 5/5 =1 and then its never saved because after the while loop is done its changed back.
			}
			System.out.println(i); //debug
				
		}
		//3 digits
		if(numOfWeights==3)
		{	
			
		}
		//4 digits
		if(numOfWeights==4)
		{
			
		}
	
		System.out.println("Largest number" + largestNumber); //ignore, not fully working yet. 
	}
	

}

/* PSUEDO CODE
 * 
 * read in the strings. 
 * next isolate the first value. store that in a variable. 
 * next read in the other two values and store them in their own variables
 * start attempting to divide a number by the two other numbers
 */