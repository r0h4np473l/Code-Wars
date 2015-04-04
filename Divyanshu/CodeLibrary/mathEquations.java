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
	public static double distance(double x, double x0, double y, double y0){
		return Math.sqrt(Math.pow(x-x0, 2)+Math.pow(y-y0, 2));
	}
	public static double cosLaw(double a, double b, double c){
		return Math.acos((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c, 2))/(2 * a * b)); 
	}
	public static double genTriArea(double a, double b, double w){
		return (a*b*Math.sin(w)/2);
	}
	public static double parallelResistors(double[] resistors){
		double sum = 0;
		for(int i = 0; i < resistors.length;i++){
			sum += 1.0/resistors[i];
		}
		return 1 / sum;
	}

}
