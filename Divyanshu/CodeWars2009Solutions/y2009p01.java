package CodeWars2009Solutions;

import java.util.Scanner;

public class y2009p01 {

	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		double fo, fe, d;
		double f, p;
		
		fo= input.nextDouble();
		d= input.nextDouble();
		fe= input.nextDouble();
		
		f= fo/d;
		p= fe/f;
		
		System.out.println(f);
		System.out.println(p);
	}
	
}
