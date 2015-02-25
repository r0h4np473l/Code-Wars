package CodeWars2012Solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class y2012p09 {

	public static void main(String[] args) throws IOException {
		//import lines
		BufferedReader f = new BufferedReader(new FileReader("y2012p09.txt"));
		String all="";
		String line="";
		all=f.readLine();		//cipher
		line = f.readLine();	//decoded message
		StringTokenizer st = new StringTokenizer(line);
		
		//idk what 'KEY' has to do with anything, just take the decoded word
		String decoded = st.nextToken();
		decoded=st.nextToken();
		
		//While we haven't found the correct shift, I simply tested every decoded cipher possibility
		//until it hit the correct one. 
		Boolean checkDecode=true;
		int x=1;
		String tempDecipher="";
		int indexOfDecoded=0;
		while(checkDecode)
		{
			indexOfDecoded=0;	//iterate through decoded
			int i=0;			//iterate through decipher
			//get the temporary cipher to test, changes with every iteration
			tempDecipher = decipherCaesarShift(all,x,'L');
			
			//iterate through the decipher
			//if a letter matches, increment the index of decoded message
			//keep checking until either you hit the end of the decipher or decoded message
			//if you hit the end of the decoded, then that means you found the correct shift
			while(indexOfDecoded<decoded.length() && i<tempDecipher.length())
			{
				if(tempDecipher.charAt(i)==decoded.charAt(indexOfDecoded))
				{
					indexOfDecoded++;	
				}
				i++;
			}
			if(indexOfDecoded==decoded.length())
			{
				checkDecode=false;
			}
			x++;
		}
		//print
		System.out.println(tempDecipher);
		f.close();
		//exit program
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
