package CodeLibrary;

public class mathEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int numOfQuadSolutions(double a, double b, double c){
		double d = discriminant(a,b,c);
		if(d>0){
			return 2;
		}
		else if(d==0){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static double discriminant(double a, double b, double c){
		return  Math.pow(b,2) - 4*a*c;
	}
	

}
