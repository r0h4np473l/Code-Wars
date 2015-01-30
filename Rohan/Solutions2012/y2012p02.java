package Solutions2012;

import java.util.Scanner;

public class y2012p02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Input
		Scanner input= new Scanner(System.in);
		String inputValue= input.nextLine();
		int indexOfSpace= inputValue.indexOf(" ");
		final int RINGWORLD_RADIUS= Integer.parseInt(inputValue.substring(0, indexOfSpace));
		final int RINGWORLD_WIDTH = Integer.parseInt(inputValue.substring(indexOfSpace+=1));
		final double PI=3.14159265;
		final double EARTH_SURFACE_AREA= 196.935*1000000;
		
		//Calculations
		double surfaceAreaOfRingworld= 2*PI*RINGWORLD_RADIUS*RINGWORLD_WIDTH;
		double ratioOfRingworldToEarth= surfaceAreaOfRingworld/EARTH_SURFACE_AREA;
		
		//Output
		System.out.println((int)ratioOfRingworldToEarth + " EARTHS");
	}

}
