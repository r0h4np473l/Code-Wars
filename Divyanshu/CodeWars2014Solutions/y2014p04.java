package CodeWars2014Solutions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class y2014p04 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2014p04.txt"));
		//gets the amount of candies
		int numCandies = Integer.parseInt(f.readLine());
		//gets the number of people
		int numPeople = Integer.parseInt(f.readLine());
		//list for the winners
		ArrayList<String> winners = new ArrayList<String>();
		
		//minimum difference that will be computed
		int minDiff= Integer.MAX_VALUE;
		//temp variable for the differences
		int	difference = 0;
		String line = "";
		//iterates through test data file
		for(int i =0; i<numPeople;i++){
			line = f.readLine();
			StringTokenizer st = new StringTokenizer(line);
			//solves for current difference
			difference = Math.abs(numCandies-Integer.parseInt(st.nextToken()));
			//if theres a new minimum difference
			if(difference<minDiff){
				winners.clear();
				winners.add(st.nextToken());
				minDiff = difference;
			}
			//if theres a tie
			else if(difference == minDiff){
				winners.add(st.nextToken());
			}
		}
		//print results
		for(int i =0; i<winners.size();i++){
			System.out.print(winners.get(i) + " ");
		}
	}

}
