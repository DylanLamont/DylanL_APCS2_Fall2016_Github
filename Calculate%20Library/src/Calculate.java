/**
 * 
 */

/**
 * @author APCS2
 * Dylan Lamont
 * August 31, 2016
 */
public class Calculate {
	public static int square (int baseSquare){  		// Method for Squaring input
		return (baseSquare * baseSquare);
	}
	
	public static int cube (int baseCube){ 				//Method for cubing input
		return (baseCube * baseCube * baseCube);
	}
	
	public static double average (double avgNum1 ,  double avgNum2){		// Method for averaging two numbers
		return( (avgNum1 + avgNum2)/2 );		
	}

	public static double average (double avgNum1 ,  double avgNum2, double avgNum3){		// Method for averaging two numbers
		return( (avgNum1 + avgNum2 + avgNum3)/3 );		
	}

	public static double toDegrees (double radian){
		return( radian * (3.14159/180));
	}

	public static double toRadians (double degree){
		return ( degree * (180/3.14159));
	}
	
	public static double discriminant (double a , double b , double c ){
		return ( (b*b)-4*a*c);
	}

	public static String toImproperFrac (int wholeNum, int numerator, int denominator ){
		int calcVar = (wholeNum * denominator) + numerator;
		Integer.toString(calcVar);
		Integer.toString(denominator);
		return (calcVar +  "/" +  denominator);		
	}
	
	public static String toMixedNum (int numerator, int denominator){
		int wholeNum = numerator/denominator;
		int fracNum = numerator % denominator
		Integer.toString(wholeNum);
		Integer.toString(fracNum);
		return (wholeNum + "_" + fracNum + "/" + denominator);
	}
	
	public static String foil (int a, int b, int c, int d, char var){
		int degreeTwo = a*c;
		int degreeOne = (a*d) + (b*c);
		int yInt = b*d;
		Integer.toString(degreeTwo);
		Integer.toString(degreeOne);
		Integer.toString(yInt);
		return ( degreeTwo + var + "^2 + " + degreeOne + var + " + " + yInt);
	}
	
	public static boolean isDivisibleBy ( int numerator, int denominator){
		int calc = numerator % denominator;
		boolean comparator = false;
		if (calc == 0){
			comparator = true;
		}
		return (comparator);
	}
	public static double absValue ( double absNum){
		if (absNum < 0){
			absNum = absNum * -1;
		}
		return (absNum);
	}
	
	public static int max (int num1, int num2){
		int maxValue;
		if (num1 > num2){
			maxValue = num1;
		} else if (num2 > num1){
			maxValue = num2;
		}
		return (value);
	}
	
	public static double max (double num1, double num2, double num3){
		double maxValue;
		if (num1 > num2 && num1 > num3){
			maxValue = num1;
		} else if (num2 > num1 && num 2 > num 3){
			maxValue = num2;
		} else if (num3 > num1 && num3 > num2){
			maxValue = num3;
		}
		return (value);
	}
	public static int min (int num1, int num2){
		int minValue;
		if (num1 > num2){
			minValue = num2;
		} else {
			minValue = num1;
		}
		return (minValue);
	}
	public static double round2 (double number)
}