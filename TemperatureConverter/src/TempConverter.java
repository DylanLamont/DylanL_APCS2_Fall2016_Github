/* Dylan Lamont
 * August 30, 2016
 * AP Comp Sci period 2
 * 
 */



import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		System.out.println("Hello, what is your temperature in Fahrenheit?");
		Scanner initialF = new Scanner(System.in);
		double intergerF = initialF.nextInt();
		double outputF = (5.0/9.0)* (intergerF - 32);
		System.out.println( intergerF + " degrees fahrenheit in celcius is " + outputF + " degrees.");
	   
	}

}
