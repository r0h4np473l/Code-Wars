package Solutions2012;

import java.util.Scanner;

public class y2012p01 {

	public static void main(String[] args) {

		//Input
		Scanner input= new Scanner(System.in);
		int inputValue= input.nextInt();
		
		//Calculations
		final double LITERS_IN_ONE_GALLON =3.785;
		double gallonsConvertedToLiters= inputValue/LITERS_IN_ONE_GALLON;
		
		//Output
		System.out.println((int)gallonsConvertedToLiters);
	}

}
