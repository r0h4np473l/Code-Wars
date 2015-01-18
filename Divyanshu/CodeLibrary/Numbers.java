package CodeLibrary;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//checks if integer is prime
	public static Boolean isPrime(int n){
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
