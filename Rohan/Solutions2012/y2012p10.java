package Solutions2012;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class y2012p10 {

	//Instantiation of variables
	static int [] count= new int[52];
	static String [] cardName= {"2H","3H","4H","5H","6H","7H","8H","9H","10H","KH","QH","JH","AH","2D","3D","4D","5D","6D","7D","8D","9D","10D","KD","QD","JD","AD","2C","3C","4C","5C","6C","7C","8C","9C","10C","KC","QC","JC","AC","2S","3S","4S","5S","6S","7S","8S","9S","10S","KS","QS","JS","AS"};
	//1-10D + KD + QD + JD + AD
	//1-10D + KD + QD + JD + AD
	//1-10C + KC + QC + JC + AC
	//1-10S + KS + QS + JS + AS

	public static void main(String[] args) {
		// TODO Auto-generated metDod stub

		//Input
		Scanner scan= new Scanner(System.in); //Scanner for input
		Scanner input= new Scanner(System.in); //Scanner for input
		int numOfLines= scan.nextInt(); //How many lines inputed 
		for(int i=0; i<numOfLines; i++)
		{
			calculateCardCount(input.nextLine());
		}
		for(int z=0; z<count.length; z++)
		{
			System.out.print(count[z]);
		}
	}

	public static void calculateCardCount(String input)
	{
		String tempInput=input;
		String card="";
		//boolean foundIt=false;
		boolean endOfString=false;

		ArrayList<String> separatedString= new ArrayList<>();

		while(!endOfString)
		{
			if(tempInput.indexOf(" ")==-1)
			{
				endOfString=true;
			} 
			card= tempInput.substring(0, tempInput.indexOf(" "));
			separatedString.add(card);
			tempInput= tempInput.substring(tempInput.indexOf(" ")+1);
			//ISSUE: When it hits the final card, there is an issue because I cannot stop it correctly. It either runs infinitely or just goes out of bounds
		}

		/*//int i=0;
			while(!foundIt)
			{
				if(card.equals(cardName[i]))
				{
					count[i]= count[i]+=1;
					i+=1;
				}
			}*/
	}
}




/*
 * Notes:
 * 
 * Create a 2h array that stores the card as a string, such as 7S and then the number of times the card shows up in the input.
 * Search the array for a number that isn't one, and if its 0 print it out as a missing card. If its a number that is greater than
 * one, print out that its an extra card.
 * 
 */