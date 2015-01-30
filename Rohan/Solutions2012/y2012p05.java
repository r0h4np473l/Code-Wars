package Solutions2012;

import java.util.Scanner;

public class y2012p05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instantiation of variables
		double packagesOf11=0.0;
		double packagesOf13=0.0;
		double packagesOf6=0.0;

		//Input
		Scanner input= new Scanner(System.in);
		int inputValue= input.nextInt();
		double dividedNumber=0.0;
		//Calculations
		boolean combinationFound=false;
		for(double x=1.0; x<=10.0; x++)
		{
			for(double y=0.0; y<10.0; y++)
			{
				for(double z=0.0; z<10.0; z++)
				{
					dividedNumber= inputValue/((13*x)+(11*y)+(6*z));
					if(dividedNumber==1.0)
					{
						packagesOf13=x;
						packagesOf11=y;
						packagesOf6=z;
						combinationFound=true;
					}
				}
			}
		}
		double totalNumberOfPackages= packagesOf13 + packagesOf11 + packagesOf6;

		//Output
		if(combinationFound)
		{
			System.out.println((int)inputValue + " peppers can be packed most economically in:");
			System.out.println((int)packagesOf13 +  ((packagesOf13==1)?" package":" packages") + " of 13");
			System.out.println((int)packagesOf11 +  ((packagesOf11==1)?" package":" packages") + " of 11");
			System.out.println((int)packagesOf6 +  ((packagesOf6==1)?" package":" packages") + " of 6");
			System.out.println((int)totalNumberOfPackages + " total packages.");
		}
		else
		{
			System.out.println((int)inputValue + " peppers cannot be packed.");
		}
	}

}
