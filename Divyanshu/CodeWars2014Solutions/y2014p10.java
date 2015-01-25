package CodeWars2014Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class y2014p10 {
	public static void main(String[] args) throws IOException {
		BufferedReader f =new BufferedReader(new FileReader("y2014p10.txt"));
		String line ="";
		while((line=f.readLine()) != null && !line.equals("0")){
			StringTokenizer st = new StringTokenizer(line);
			int lineLength = Integer.parseInt(st.nextToken());
			
			line=st.nextToken();
			
			while(st.hasMoreTokens()){
				line+=" "+st.nextToken();
			}
			String[] codedMessage = stringToLetterArray(line);
			String[] array = new String[lineLength];
			array[0] = codedMessage[0];
			codedMessage[0] = null;
			int test = findAlphaNumber(array[0].charAt(0))-1;
			int index = 0;
			int startIndex =0;
			System.out.println(Arrays.toString(codedMessage));
			for(int i =1;i<lineLength;i++){
				while(test>0){
				try{
					if(codedMessage[index]!=null){
						test--;
						index++;
					}
					else{
						index++;
					}
				}
				catch(IndexOutOfBoundsException e){
					index=0;
						while(codedMessage[index]==null){
							index++;
						}
						//test--;
				}
				}
				if(i==lineLength-1){
					index=0;
					while(codedMessage[index]==null){
						index++;
					}
				}
				if(index==lineLength){
					index=0;
					while(codedMessage[index]==null){
						index++;
					}
					//test--;
				}
				while(codedMessage[index]==null){
					index++;
					if(index==lineLength){
						index=0;
						while(codedMessage[index]==null)
							index++;
					}
				}
				array[i] = codedMessage[index];
				System.out.println(array[i]);
				codedMessage[index]=null;
				test = findAlphaNumber(array[i].charAt(0))-1;
				System.out.println(Arrays.toString(array));
				System.out.println(Arrays.toString(codedMessage));
				
			}
		}
		System.exit(0);
	}
	public static int findAlphaNumber(char s){
		int val;
		val = ((int)s-(int)'A'+1);
		if(val>25)
			val = ((int)s-(int)'a'+1);
		else if(val<0 || val>52){
			val=1;
		}
		return val;
	}
	public static String[] stringToLetterArray(String s){
		String[] sarr= new String[s.length()];
		for(int i =0;i<s.length();i++){
			sarr[i] = ""+s.charAt(i);
		}
		return sarr;
	}
}