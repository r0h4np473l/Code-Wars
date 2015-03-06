package CodeWars2009Solutions;

import java.util.Scanner;

public class y2009p02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		int num=input.nextInt();
		boolean keepgoing=true;
		while(keepgoing)
		{
			num=num/2;
			if(num==1)
			{
				System.out.println(num+ " is impolite");
			}
			else
			{
				System.out.println(num + " is polite");
			}
		}
	}

}
