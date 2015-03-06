package CodeWars2013Solutions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class y2013p13 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2013p13.txt"));
		BufferedReader key = new BufferedReader(new FileReader(
				"BannerCharacters.txt"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
				"y2013p13out.txt")));
		int height = 5;
		int width = 3;
		String[] lines = new String[height];
		
		
	
		String lineLetter = "";
		for (int i = 0; i < height; i++) {
			lines[i] = f.readLine();
		}
		ArrayList<String> letters = new ArrayList<String>();

		for (int i = 0; i < lines[0].length() - width; i += width) {
			lineLetter = "";
			if (i > 0)
				i++;
			for (int j = 0; j < height; j++)
				lineLetter += lines[j].substring(i, i + width);
			letters.add(lineLetter);
		}
		ArrayList<String> keyOfNumsAndLets = getKey(key);
		//System.out.println(keyOfNumsAndLets.toString());
		//System.out.println(keyOfNumsAndLets.get(12));
		//System.out.println(letters.get(8));
		//System.out.println((letters).toString());
		
		for (int k = 0; k < letters.size(); k++) {
			if (letters.get(k).equals("               ")) {
				System.out.print(" ");
			}
			else{
				for(int j=0; j<keyOfNumsAndLets.size(); j++)
				{
					if(letters.get(k).equals(keyOfNumsAndLets.get(j)))
					{
						if (j <= 9) {
							System.out.print(j);
						} else {
							System.out.print(findAlphaNumber(j - 10));
						}
					}
				}
			}
		}
		f.close();
		out.close();
		key.close();
		System.exit(0);
	}


	public static ArrayList<String> getKey(BufferedReader key)
			throws IOException {
		ArrayList<String> letters = new ArrayList<String>();
		String firstLine = "";
		while ((firstLine = key.readLine()) != null) {
			int height = 5;
			int width = 3;
			String[] lines = new String[height];
			lines[0] = firstLine;
			for (int i = 1; i < height; i++) {
				lines[i] = key.readLine();
			}
			String lineLetter = "";
			for (int i = 0; i < lines[0].length() - width; i += width) {
				lineLetter = "";
				if (i > 0)
					i++;
				for (int j = 0; j < height; j++)
					lineLetter += lines[j].substring(i, i + width);
				letters.add(lineLetter);
			}
			key.readLine();
		}

		return letters;
	}

	public static char findAlphaNumber(int s) {
		char val;
		val = (char) (s + (int) 'A');
		return val;
	}
}