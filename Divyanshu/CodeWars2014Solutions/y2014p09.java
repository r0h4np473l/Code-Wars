package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class y2014p09 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader f =new BufferedReader(new FileReader("y2014p09.txt"));
		String line ="";
		//list to hold the answers
		ArrayList<Integer> winners= new ArrayList<Integer>();
		//temp var to hold the number being tested
		int num =0;
		//iterate until the end 
		while((line=f.readLine())!=null && !line.equals("0")){
			num = Integer.parseInt(line);
			//start at the odd number
			int num1 = num-1;
			//start at 1, smallest odd number
			int num2 = 1;
			//minimum value to find the answers with the smallest difference
			int minDiff = Integer.MAX_VALUE;
			//temp varibable to hold difference
			int difference = 0;
			//clear the answers from before
			winners.clear();			
			//iterate while the 2 numbers do not cross
			while((num1>=num/2)&&(num2<=num/2)){			
				//System.out.println(num1 + " " + num2);
				difference = num1-num2;
				// if both are prime and have a new difference value then rewrite answers
				if(isPrime(num1) && isPrime(num2) && difference<minDiff){
					winners.clear();
					winners.add(num1);
					winners.add(num2);
					minDiff = difference;
				}
				//check every odd combination
				num1-=2;
				num2+=2;
			}
			//print the values
			System.out.println(winners.get(0) + "+" + winners.get(1) + "=" + num);
		}
		f.close();
		System.exit(0);
	}
	public static Boolean isPrime(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}