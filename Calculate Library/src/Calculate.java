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
		int fracNum = numerator % denominator;
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
		int maxValue = 0;
		if (num1 > num2){
			maxValue = num1;
			return (maxValue);
		} else if (num2 > num1){
			maxValue = num2;
			return (maxValue);
		}	
		return (-1);
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
		}
		return(-1);
		
	}
	public static int min (int num1, int num2){
		int minValue = 0;
		if (num1 > num2){
			minValue = num2;
		} else {
			minValue = num1;
		}
		return (minValue);
	}
	public static double round2 (double number){
		double timesOneHundered = number * 100.0;
		int truncNum = (int)timesOneHundered;
		double doubleTruncNum = truncNum;
		double difference = timesOneHundered - doubleTruncNum;
		if (difference <= 4.0){
			double returnNum = truncNum/100.0;
			return (returnNum);
		} else if (difference >= 5.0){
			double returnNum = (truncNum + 1.0)/100.0;
			return (returnNum);
		}
		return(-1.0);
	}
	
	public static double exponent (double baseNum, int exponent){
		double returnNum = 0;
		double calcNum = baseNum;
		for (int a = 1; a < exponent; a++){
			returnNum = calcNum * baseNum;
			calcNum = returnNum;
		}
		System.out.println(returnNum);
		return (returnNum);
	}
	
	public static int factorial (int factNum){
		int returnNum = factNum;
		int calcNum = 0;
		int loopVar = factNum-1;
		for (; loopVar>0; loopVar--){
			calcNum = returnNum * loopVar;
			returnNum = calcNum;
		}
		System.out.println(returnNum);
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
		System.out.println(output);
		return (output);
	}
						

	public static int gcf (int num1, int num2){
		int loopVar = Calculate.max(num1, num2);
		for (;loopVar > 0; loopVar--){
			if (num1 % loopVar == 0 && num2 % loopVar ==0){
				return (loopVar);
			}
		}
		return(1);
	}
	public static double sqrt (double squareRoot){
		double answer = squareRoot/2;
		while (!(Calculate.absValue((answer*answer)- squareRoot)<= .009)){
			answer = .5 * (answer + (squareRoot/answer));
		}
		return (Calculate.round2(answer));
	}
		/*double squareRootRound = Calculate.round2(squareRoot);
		double base = 1.0;
		for (; base*base != squareRootRound;){
			if (base*base > squareRootRound){
				base--;
			}
			if (base*base < squareRootRound/2){
				base ++;
				squareRootRound = squareRootRound / 2;
			}
			if (base*base > squareRootRound/2){
				base --;
			}
		}
		return (base);
	*/
	}


