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
	
	public static double average (double num1 ,  double num2){		// Method for averaging two numbers
		return( (num1 + num2)/2 );		
	}

	public static double average (double num1 , double num2, double num3){		// Method for averaging two numbers
		return( (num1 + num2 + num3)/3 );		
	}

	public static double toDegrees (double radianVal){
		return( radianVal * (180/3.14159));
	}

	public static double toRadians (double degreeVal){
		return ( degreeVal * (3.14159/180));
	}
	
	public static double discriminant (double a , double b , double c ){
		return ( (b*b)-4*a*c);
	}

	public static String toImproperFrac (int wholeNum, int numerator, int denominator ){
		if (denominator == 0){
			throw new IllegalArgumentException("Please enter a valid fraction where the denominator does not equal 0");
		}
		int calcVar = (wholeNum * denominator) + numerator;
		Integer.toString(calcVar);
		Integer.toString(denominator);
		return (calcVar +  "/" +  denominator);		
	}
	
	
	public static String toMixedNum (int numerator, int denominator){
		if (denominator == 0){
			throw new IllegalArgumentException("Please enter a valid fraction where the denominator does not equal 0");
		}
		int wholeNum = numerator/denominator;
		int fracNum = numerator % denominator;
		Integer.toString(wholeNum);
		Integer.toString(fracNum);
		return (wholeNum + "_" + fracNum + "/" + denominator);
	}
	
	public static String foil (int a, int b, int c, int d, char var){
		int degreeTwo = a*c;
		int degreeOne = (a*d) + (b*c);
		int yInt = b*d;
		String operator1 = " + ";
		String operator2 = " + ";
		Integer.toString(degreeTwo);
		Integer.toString(degreeOne);
		Integer.toString(yInt);
		if(degreeOne < 0){
			operator1 = " - ";
		}
		if(yInt < 0){
			operator2 = " - ";
		}		
		return ( degreeTwo + "" + var + "^2" + operator1 + (int)Calculate.absValue(degreeOne) + var + operator2 + (int)Calculate.absValue(yInt));
	}
	
	public static boolean isDivisibleBy ( int numerator, int denominator){
		if (denominator == 0){
			throw new IllegalArgumentException("PLease enter a denominatior value that is not 0");
		}
		int calc = numerator % denominator;
		boolean comparator = false;
		if (calc == 0){
			comparator = true;
		}
		return (comparator);
	}
	public static double absValue ( double target){
		if (target < 0){
			target = target * -1;
		}
		return (target);
	}
	
	public static int max (int num1, int num2){
		int maxValue = 0;
		if (num1 > num2){
			maxValue = num1;
			return (maxValue);
		} else if (num2 > num1){
			maxValue = num2;
			return (maxValue);
		}else{
			return (num1);
		}
	}
	
	public static double max (double num1, double num2, double num3){
		double maxValue = 0;
		if (num1 > num2 && num1 > num3){
			maxValue = num1;
			return (maxValue);
		} else if (num2 > num1 && num2 > num3){
			maxValue = num2;
			return (maxValue);
		} else if (num3 > num1 && num3 > num2){
			maxValue = num3;
			return (maxValue);
		}else {
		return(num2);
		}
	}
	public static int min (int num1, int num2){
		int minValue = 0;
		if (num1 > num2){
			minValue = num2;
		} else if(num2>num1) {
			minValue = num1;
		} else if(num1 == num2){
			minValue = num1;
		}
		return (minValue);
	}
	public static double round2 (double number){
		double timesOneHundered = number * 100.0;
		int truncNum = (int)timesOneHundered;
		double difference = Calculate.absValue(truncNum - (number*100));
		if (difference < .5){
			double returnNum = truncNum/100.0;
			return (returnNum);
		} else if (difference >= .5){
			double returnNum = (truncNum + 1.0)/100.0;
			return (returnNum);
		}
		return(-1.0);
	}
	
	public static double exponent (double baseNum, int exponent){
		if (exponent < 0){
			throw new IllegalArgumentException("Please enter a positive integer for the exponent");
		}
		double returnNum = 0;
		double calcNum = baseNum;
		for (int a = 1; a < exponent; a++){
			returnNum = calcNum * baseNum;
			calcNum = returnNum;
		}
		return (returnNum);
	}
	
	public static int factorial (int factNum){
		if (factNum<0){
			throw new IllegalArgumentException("Please enter a positive number");
		}
		int returnNum = factNum;
		int calcNum = 0;
		int loopVar = factNum-1;
		for (; loopVar>0; loopVar--){
			calcNum = returnNum * loopVar;
			returnNum = calcNum;
		}
		return(returnNum);
	}
	
	public static boolean isPrime (int numPrime){
		int loopVar = numPrime-1;
		boolean output = true;
		for (; loopVar> 1; loopVar--){
			if (Calculate.isDivisibleBy(numPrime, loopVar) == true){
				output = false;
			}
		}
		return (output);
	}
						

	public static int gcf (int num1, int num2){
		int loopVar = Calculate.max(num1, num2);
		if (num1 == num2){
			return(num1);
		}
		for (;loopVar > 0; loopVar--){
			if (num1 % loopVar == 0 && num2 % loopVar ==0){
				return (loopVar);
			}
		}
		return(1);
	}
	public static double sqrt (double target){
		if (target < 0){
			throw new IllegalArgumentException("PLease enter a value that is positive");
		}
		double answer = target/2;
		while (!(Calculate.absValue((answer*answer)- target)<= .009)){
			answer = .5 * (answer + (target/answer));
		}
		return (Calculate.round2(answer));
	}
	
	public static String quadForm (int a, int b, int c){
		double aDouble = a;
		double bDouble = b;
		double cDouble = c;
		double discriminant = Calculate.discriminant(aDouble, bDouble, cDouble);
		if (discriminant <0){
				 return("no real roots");
		}
		double quadAdditive = ((-1*bDouble) + (Calculate.sqrt(discriminant)))/(2*aDouble);
		double quadSubtractive = ((-1*bDouble) - (Calculate.sqrt(discriminant)))/(2*aDouble);
		if(quadAdditive == quadSubtractive){
			return(quadAdditive + "");
		}
		return(quadAdditive + " and " + quadSubtractive);
	}
}



