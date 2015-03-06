package CodeWars2009Solutions;

import java.util.Scanner;

public class y2009p03 {

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		String character= input.nextLine();
		int scale= input.nextInt();
		
		for(int i=scale; i>0; i--)
		{
			System.out.print(character);
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			System.out.print(character);
			System.out.println();
		}
		
		}
	


}
