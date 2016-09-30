import java.util.*;

public class ProcessingNumbers {
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("How many numbers would you like to add");
		int howMany = input.nextInt();
		System.out.println("What are your numbers?");
		int min = input.nextInt();
		int max = min; 
		int evenSum = 0;
		if (min % 2 == 0){
			evenSum += min;
		}
		for (int i = 1; i<=howMany; i++){
			int nextNum = input.nextInt();
			if (nextNum %2 == 0){
				evenSum += nextNum;
			}
			if (nextNum < min){
				min = nextNum;
			}
			if (nextNum > max){
				max = nextNum;
			}
	
		}
		System.out.println("Your minimum is " + min + ". Your maximum is "+ max +);
	}
}
