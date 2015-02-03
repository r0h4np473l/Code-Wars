package CodeWars2012Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class y2012p09 {

	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("y2012p09.txt"));
		String all="";
		String line="";
		all=f.readLine();
		line = f.readLine();
		StringTokenizer st = new StringTokenizer(line);
		String decoded = st.nextToken();
		decoded=st.nextToken();
		Boolean checkDecode=true;
		int x=1;
		String tempDecipher="";
		int indexOfDecoded=0;
		while(checkDecode){
			indexOfDecoded=0;
			tempDecipher = decipherCaesarShift(all,x,'L');
			int i=0;
			while(indexOfDecoded<decoded.length() && i<tempDecipher.length()){
				if(tempDecipher.charAt(i)==decoded.charAt(indexOfDecoded)){
					indexOfDecoded++;	
				}
				i++;
			}
			if(indexOfDecoded==decoded.length()){
				checkDecode=false;
			}
			x++;
		}
		System.out.println(tempDecipher);
		System.exit(0);
	}
	public static String decipherCaesarShift(String s, int shift, char dir)
	{
		String newString="";
		int currIndex;
		if(dir=='L'){
			for(int i = 0;i<s.length();i++)
			{

				if(s.charAt(i)!=' '){
					currIndex = ((findAlphaNumber(s.charAt(i))-shift)+26)%26;
					newString+=(char)(currIndex+(int)'A');
				}
				else{
					newString+=' ';
				}
			}
		}
		else if (dir=='R'){
			for(int i = 0;i<s.length();i++)
			{

				if(s.charAt(i)!=' '){
					currIndex = ((findAlphaNumber(s.charAt(i))+shift))%26;
					newString+=(char)(currIndex+(int)'A');
				}
				else{
					newString+=' ';
				}
			}
		}
		return newString;
	}
	public static int findAlphaNumber(char s)
	{
		int val = ((int)s-(int)'A');
		return val;
	}
}
