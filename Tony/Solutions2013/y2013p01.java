package Solutions2013;

import java.util.Scanner;

public class y2013p01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numShirts;
		int priceTotal;
		Scanner scan = new Scanner(System.in);
		numShirts = scan.nextInt();
		priceTotal = 8 * numShirts - 95;
		System.out.println(priceTotal);
		scan.close();
	}

}
