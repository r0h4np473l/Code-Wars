package Solutions2014;
import java.util.ArrayList;
import java.util.Scanner;


public class y2014p01 {

	public static void main (String args[])
	{
		Scanner input=new Scanner(System.in);
		String tValues="";
		ArrayList <Integer> valuesOfT = new ArrayList <Integer> ();
		valuesOfT.add((Integer)input.nextInt());
		int i=0;
		while(valuesOfT.get(i) !=0)
		{
			valuesOfT.add((Integer) input.nextInt());
			i++;
		}
		valuesOfT.remove(valuesOfT.size()-1);
		for(int z=0; z<valuesOfT.size(); z++)
		{
			calcPop((valuesOfT.get(z)).intValue());
		}
	}

	public static int calcPop(int t)
	{
		System.out.println((int) ((100*Math.sqrt((double)t)) + ((201/(t+=1))+1.0)));
		return 0;
	}
	
}
