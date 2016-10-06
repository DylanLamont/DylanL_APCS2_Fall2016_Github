
/**
 * @author APCS2
 * Dylan Lamont
 * August 31, 2016
 * This is a library of various methods that can do various math functions
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

	public static double toDegrees (double radianVal){				//Method to turn Radians into degrees
		return( radianVal * (180/3.14159));
	}

	public static double toRadians (double degreeVal){			//Method to turn Degrees into radians
		return ( degreeVal * (3.14159/180));
	}
	
	public static double discriminant (double a , double b , double c ){			//Method used to find the discriminant of the three values
		return ( (b*b)-4*a*c);
	}

	public static String toImproperFrac (int wholeNum, int numerator, int denominator ){			//Method used to turn a fraction value into an improper fraction
		if (denominator == 0){
			throw new IllegalArgumentException("Please enter a valid fraction where the denominator does not equal 0");
		}
		int calcVar = (wholeNum * denominator) + numerator;
		Integer.toString(calcVar);
		Integer.toString(denominator);
		return (calcVar +  "/" +  denominator);		
	}
	
	
	public static String toMixedNum (int numerator, int denominator){			// Method used to turn the improper fraction into a mixed fraction
		if (denominator == 0){
			throw new IllegalArgumentException("Please enter a valid fraction where the denominator does not equal 0");
		}
		int wholeNum = numerator/denominator;
		int fracNum = numerator % denominator;
		Integer.toString(wholeNum);
		Integer.toString(fracNum);
		if (fracNum == 0){
			return (wholeNum + "");
		}
		return (wholeNum + "_" + fracNum + "/" + denominator);
	}
	
	public static String foil (int a, int b, int c, int d, char var){			//Method used for processing the foil method.
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
	
	public static boolean isDivisibleBy ( int numerator, int denominator){				//Method to check whether a value can be divided by another wholely
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
	public static double absValue ( double target){			//Method to find the absolute value of a number
		if (target < 0){
			target = target * -1;
		}
		return (target);
	}
	
	public static int max (int num1, int num2){				//Method to find max of 2 numbers
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
	
	public static double max (double num1, double num2, double num3){			//Method to find max of three numbers
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
	public static int min (int num1, int num2){					//Method to find the minimum of three numbers
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
	public static double round2 (double number){			//Rounds a double to 2 decimal points
		double timesOneHundered = number * 100.0;
		int truncNum = (int)timesOneHundered;
		double difference = Calculate.absValue(truncNum - (number*100));
		if (difference < .5){
			double returnNum = truncNum/100.0;
			return (returnNum);
		} else if (difference >= .5){
			if (number <0){
				double returnNum = (truncNum - 1.0)/100.0;
				return (returnNum);
			}
			double returnNum = (truncNum + 1.0)/100.0;
			return (returnNum);
		}
		return(-1.0);
	}
	
	public static double exponent (double baseNum, int exponent){			//Finds value of the base number to the exponent power
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
	
	public static int factorial (int factNum){			//Multiplies the fact num by the decrementing values under it
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
	
	public static boolean isPrime (int numPrime){				//Checks whether a number is prime
		int loopVar = numPrime-1;
		boolean output = true;
		for (; loopVar> 1; loopVar--){
			if (Calculate.isDivisibleBy(numPrime, loopVar) == true){
				output = false;
			}
		}
		return (output);
	}
						

	public static int gcf (int num1, int num2){				//finds the greatest common factor of the two numbers
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
	public static double sqrt (double target){				//Finds the square root value of the target
		if (target < 0){
			throw new IllegalArgumentException("PLease enter a value that is positive");
		}
		double answer = target/2;
		while (!(Calculate.absValue((answer*answer)- target)<= .009)){
			answer = .5 * (answer + (target/answer));
		}
		return (Calculate.round2(answer));
	}
	
	public static String quadForm (int a, int b, int c){			//Finds the quadratic formula outputs for the three variables passed
		double aDouble = a;
		double bDouble = b;
		double cDouble = c;
		double discriminant = Calculate.discriminant(aDouble, bDouble, cDouble);
		if (discriminant <0){
				 return("no real roots");
		}
		double quadAdditive = ((-1*bDouble) + (Calculate.sqrt(discriminant)))/(2*aDouble);
		double quadSubtractive = ((-1*bDouble) - (Calculate.sqrt(discriminant)))/(2*aDouble);
		quadAdditive = Calculate.round2(quadAdditive);
		quadSubtractive = Calculate.round2(quadSubtractive);
		if(quadAdditive == quadSubtractive){
			return(quadAdditive + "");
		}
		if (quadAdditive > quadSubtractive){
			return(quadSubtractive + " and " + quadAdditive);
		}else{
			return(quadAdditive + " and " + quadSubtractive);
		}
	}
}



