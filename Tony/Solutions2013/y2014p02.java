package Solutions2013;

import java.util.Scanner;

public class y2014p02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		for(int x = 0; x < 4; x++){
			int time = scan.nextInt();
			if(time !=0){
				double pop = 100*Math.sqrt(time) + 201/(time +1) +1;
				System.out.println(time + " " + Math.round(pop));
			}
		} 

	}

}
