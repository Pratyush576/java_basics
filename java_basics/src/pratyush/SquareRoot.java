package pratyush;
/*
 * The first sqrt number should be the input number / 2.
 */
public class SquareRoot {
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	public static void main(String[] args){
		System.out.println(sqrt(4));
	}

}
