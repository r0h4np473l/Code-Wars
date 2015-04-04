import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class prob10 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("prob10.txt"));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("outfile.txt")));
		String line="";

		int numOfLines=Integer.parseInt(f.readLine());
		for(int q=0; q<numOfLines; q++)
		{
			line=f.readLine();
			String[] lineSplit= line.split(" ");
			String output="";
			String[] newLineSplit= new String[lineSplit.length-1];
			for(int j=0; j<lineSplit.length-1; j++)
			{
				newLineSplit[j]= lineSplit[j+1];
			}

			for(int i=0; i<lineSplit.length; i++)
			{
				switch (lineSplit[i]){
				case "81": output= output + "a";
				break;
				case "82": output=output + "b";
				break;
				case "83": output=output + "c";
				break;
				case "84":output=output + "d";
				break;
				case"85": output=output + "e";
				break;
				case"86":output=output + "f";
				break;
				case "87": output= output + "g";
				break;
				case "88": output=output + "h";
				break;
				case "89": output=output + "i";
				break;
				case"91": output=output + "j";
				break;
				case"92":output=output + "k";
				break;
				case "93": output= output + "l";
				break;
				case "94": output=output + "m";
				break;
				case "95": output=output + "n";
				break;
				case "96":output=output + "o";
				break;
				case"97": output=output + "p";
				break;
				case"98":output=output + "q";
				break;
				case"99":output=output + "r";
				break;

				case "A2": output= output + "s";
				break;
				case "A3": output=output + "t";
				break;
				case "A4": output=output + "u";
				break;
				case "A5":output=output + "v";
				break;
				case"A6": output=output + "w";
				break;
				case"A7":output=output + "x";
				break;
				case "A8": output= output + "y";
				break;
				case "A9": output=output + "z";
				break;
				case "C1": output=output + "A";
				break;
				case"C2": output=output + "B";
				break;
				case"C3":output=output + "C";
				break;
				case "C4": output= output + "D";
				break;
				case "C5": output=output + "E";
				break;
				case "C6": output=output + "F";
				break;
				case "C7":output=output + "G";
				break;
				case"C8": output=output + "H";
				break;
				case"C9":output=output + "I";
				break;
				case"D1":output=output + "J";
				break;
				case "D2": output= output + "K";
				break;
				case "D3": output=output + "L";
				break;
				case "D4": output=output + "M";
				break;
				case "D5":output=output + "N";
				break;
				case"D6": output=output + "O";
				break;
				case"D7":output=output + "P";
				break;
				case "D8": output= output + "Q";
				break;
				case "D9": output=output + "R";
				break;
				case "E2": output=output + "S";
				break;
				case"E3": output=output + "T";
				break;
				case"E4":output=output + "U";
				break;
				case "E5": output= output + "V";
				break;
				case "E6": output=output + "W";
				break;
				case "E7": output=output + "X";
				break;
				case "E8":output=output + "Y";
				break;
				case"E9": output=output + "Z";
				break;
				case"40":output=output + " ";
				break;
				case"4B":output=output + ".";
				break;
				case "6B": output=output + ",";
				break;
				case "5A": output=output + "!";
				break;


				}
			}
			System.out.println(output);

		}

		f.close();
		System.exit(0);
	}
}
