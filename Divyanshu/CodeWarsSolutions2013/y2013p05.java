package CodeWarsSolution2013;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//'Tribonacci' sequence
public class problem {
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader(("y2013p05.txt")));
		int[] trib = new int[30];
		trib[0] = 0;
		trib[1]=1;	
		trib[2]=1;
		for(int i =3;i<30;i++){
			trib[i]=trib[i-3]+trib[i-2]+trib[i-1];
		}
		Scanner in = new Scanner(System.in);
		String line = "";
		int userindex = 0;
		while((line = f.readLine())!=null){
			userindex=Integer.parseInt(line);
			try{
			System.out.println(trib[userindex]);
			}
			catch(IndexOutOfBoundsException e){
				break;
			}
		}
		
	}
}
