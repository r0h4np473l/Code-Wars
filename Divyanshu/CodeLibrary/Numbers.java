package CodeLibrary;
/**
 * 
 * @author Divyanshu
 * @description Lots of numbers, primes, fibonaccis, sums, reverses, etc. etc.
 * Codewars 2015
 */
public class Numbers {
	
	/**
	* checks if integer is prime
	*/
	public static Boolean isPrime(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	/**
	* Return the nth number in the fibonacci sequence 
	*/
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

	/**
	 * Finds the sum of a number's digits i.e. 321 will return 6 
	 */
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
	
	/**
	 * Finds the number of divisors 
	 */
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
	
	/**
	 * Returns the largest prime factor of a number i.e. 13195 will return 29 
	 */
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
}