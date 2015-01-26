package Solutions2014;
import java.util.Scanner;

//NOT WORKING CODE
public class y2014p03 {

	public static void main (String args[])
	{
		Scanner scan= new Scanner(System.in);
		double totalPowerConsumed=0;
		int numOfTimes= scan.nextInt();
		Scanner input= new Scanner(System.in);
		for(int i=0; i<numOfTimes; i++)
		{
//NOT WORKING CODE			
		}
		String time= input.nextLine();
		if((Integer.parseInt(time.substring(0,time.indexOf(":")))<10))
		{
			totalPowerConsumed+=15*6;
		}
			for(int k=0; k<time.length(); k++)
			{
			switch (time.substring(k,k+=1))
			{
			case "1": totalPowerConsumed+=(15*2);
			break;
			case "2": totalPowerConsumed+=(15*5);
			break;
			case "3": totalPowerConsumed+=(15*5);
			break;
			case "4": totalPowerConsumed+=(15*4);
			break;
//NOT WORKING CODE
			case "5": totalPowerConsumed+=(15*5);
			break;
			case "6": totalPowerConsumed+=(15*6);
			break;
			case "7": totalPowerConsumed+=(15*4);
			break;
			case "8": totalPowerConsumed+=(15*7);
			break;
			case "9": totalPowerConsumed+=(15*6);
			case ":": totalPowerConsumed +=20;
			default: System.out.print("Error");
			}
//NOT WORKING CODE			
			}
			Integer.parseInt(time.substring(0,1));
			System.out.println(totalPowerConsumed);
	}
	
}

//NOT WORKING CODE
