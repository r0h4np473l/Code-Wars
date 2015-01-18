package CodeLibrary;


public class CompMethods {
	//Returns the reverse of a number i.e. 234 will return 432 
	public static int reverse(int n){
		int reverse = 0;
		while( n != 0 ){
			reverse *= 10; reverse += n%10; n /=10;
		}
		return reverse;
	}
	
	//Returns true if the number is a palindrome i.e. 9009 will return true 
	public static boolean numPalindrome(int num){
		if(num == reverse(num)){ 
			return true;
		}
		return false;
	}

	// Returns a string as the reverse of that string, // ie ’michael’ will return ’leahcim’
	public static String reverseString(String s){
		String reversed ="";
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return reversed;
	}
	
	//Return the nth number in the fibonacci sequence 
	public static long fibonacci(long n) {
		long prev1=0;
		long prev2=1;
		for(long i=0; i < n; i++) {
			long savePrev1 = prev1; 
			prev1 = prev2;
			prev2 += savePrev1;
		}
		return prev1;
	}
	//Finds the sum of a number’s digits i.e. 321 will return 6 
	public static int sumOfDigits(int num) {
		int sum = 0; 
		int n = num; 
		int t = n; 
		while (n > 0){
			long p = n % 10;
			sum = (int) (sum + p); n /= 10;
		}
		return sum;
	}
	
	//Finds the number of divisors 
	public static int divisors(int n){
		int i, f=1; if(n==1){
			return 1; 
			} else
		{
			for(i=2; i <=(n/2); i++){ 
				if(n% i == 0){
					f++;
				}	 
			}
		return (f+1);
		} 
	}
	
	//Returns the largest prime factor of a number i.e. 13195 will return 29 
	public static int largestPrimeFactor(int number) {
		int i;
		for (i = 2; i <= number; i++) {
			if (number % i == 0) { 
				number /= i;
				i--;
			} 
		}
	return i;
	}
	
	//replaces deletes all non alphabet characters in string
	public static String replaceAllNonAlphanumericCharacters(String str){
		return str.replaceAll("[^a-zA-Z]", "");
	}
	
	//converts number to base returns string
	public static String intToBaseN(int intNum, int n){ 
		return Integer.toString(intNum, n);
	}

}
