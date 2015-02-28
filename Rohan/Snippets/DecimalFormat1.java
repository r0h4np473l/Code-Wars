package Snippets;
import java.text.DecimalFormat;

public class DecimalFormat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dec= new DecimalFormat("0.00");
		double testValue=3.14159;		
		System.out.println("Default:" + testValue);
		System.out.println("Decimal Format Version:" + dec.format(testValue));
		
	}

}
