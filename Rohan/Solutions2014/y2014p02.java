package Solutions2014;
import java.util.Scanner;


public class y2014p02 {

	public static void main (String args[])
	{
		Scanner input= new Scanner(System.in);
		Scanner input2= new Scanner(System.in);
		int numOfLines= input.nextInt();
		for(int q=0; q<numOfLines; q++)
		{
			String line = input2.nextLine();
			int oddSum=0;
			for(int i=0; i<21; i+=3)
			{
				oddSum=oddSum += (int)(Integer.parseInt(line.substring(i, i+=1)));
			}
			oddSum=oddSum*=3;
			int evenSum=0;
			for(int j=2; j<=20; j+=3)
			{
				evenSum=evenSum += (int)(Integer.parseInt(line.substring(j, j+=1)));
			}
			int totalSum=oddSum+=evenSum;
			int checkDigit = totalSum%10;
			if(totalSum%10!=0)
			{
				checkDigit=10-(totalSum%10);
			}
			else if(totalSum%10==0)
			{
				checkDigit=0;
			}
			System.out.println(line + " " + checkDigit);
		}
	}
}
