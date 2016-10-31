/*Dylan Lamont
 * period 2
 * October 30th, 2016
 * 
 * 
 * 
 */


import java.util.Arrays;

public class Split 
{

	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
//		String s = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
		String s = "I really like really red apples";
		String[] f = s.split("really");
		System.out.println(Arrays.toString(f));
		//System.out.print(s.indexOf("bread"));
		

		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		System.out.println(sandwichSplit("breadpastramilettucecheesehambreadtomatopaprikabread"));
		System.out.println(sandwichSplit("cheesebreadpastramilettucecheesehambreadtomatopaprikabreadcrap"));
		System.out.println(sandwichSplit("cheesebread"));
		System.out.println(sandwichSplit("crap"));
		System.out.println(sandwichSplit("breadcrap"));
		System.out.println(sandwichSplit(""));
		System.out.println(sandwichSplit("cheesebreadbread"));
		System.out.println(spacesSandwhichSplit("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
		System.out.println(spacesSandwhichSplit(""));
		System.out.println(spacesSandwhichSplit("bread cheese"));
		System.out.println(spacesSandwhichSplit("no"));
		System.out.println(spacesSandwhichSplit("cheese bread bread"));
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}
	public static String sandwichSplit(String foodString){
		//if (s.indexOf("bread") != 0){
		//	s = s.substring(s.indexOf("bread"));
		//}
		//if(! s.substring(s.length()-5).equals("bread")){
		//	int secondPlaceofBread = s.indexOf("bread", (s.indexOf("bread")+1));
		//	s = s
		//}
		
//	}
		String[] contents = foodString.split("bread");		//conditional to find if first index outside first bread
		if (foodString.indexOf("bread")  == -1){			//test to see if any bread in string, ie if string is valid
			return ("That is not a sandwich");
		}
		if (foodString.indexOf("bread") != 0){				//conditional to find if first index outside first bread, if outside, assigned to blank value
			contents[0] = "";
		}
		if(! foodString.substring(foodString.length()-5).equals("bread")){	//test to see if ending index is outside bread, if outside, assigned to blank value
			contents[contents.length-1] = "";
		}
		int noContentsCounter = 0;
		boolean isSandwhich = true;
		for (int i = 0; i < contents.length;i++){					//loop finding number of blank indexes assigned
			String test = "";
			if (contents[i].equals(test) ){
				noContentsCounter++;
			}
			if(noContentsCounter == contents.length){
				isSandwhich = false;
			}
		}
		if (isSandwhich == false){							//test for faulty sandwich design i.e. if blank indexes are the only indexes left
			return ("That is not a sandwich");
		}else{
			String[] returnArray = new String[contents.length-noContentsCounter];		//creation of new proportional array, no blank indexes, length of new array = original matrix length - number of empty indexes
			int index = 0;
			for (int i = 0; i < contents.length; i++){
				if (!contents[i].equals("") ){
					returnArray[index] = contents[i];
					index++;
				}			
			}
			String returnStringContents = "";
			for (int i = 0; i < returnArray.length; i ++){								//conversion of returnarray into printable string
				returnStringContents = returnStringContents + returnArray[i];
			}
			return(returnStringContents);
		}
	}
	
	
	
	
	
	
	
	public static String spacesSandwhichSplit(String foodString){
		if (foodString.length()<5){											//test to see if string is valid
			return("That is not a sandwich");
		}
		String[] withoutSpacesArray = foodString.split(" ");
		String withoutSpacesString = "";
		for (int i = 0; i < withoutSpacesArray.length; i ++){				//Conversion of first string with spaces into one without
			withoutSpacesString = withoutSpacesString + withoutSpacesArray[i];
		}
		String[] contents = withoutSpacesString.split("bread");				//conditional to find if first index outside first bread
		if (withoutSpacesString.indexOf("bread") != 0){
			contents[0] = "";
		}
		if(! withoutSpacesString.substring(withoutSpacesString.length()-5).equals("bread")){		//test to see if ending index is outside bread
			contents[contents.length-1] = "";
		}
		int noContents = 0;
		boolean isSandwhich = true;
		for (int i = 0; i < contents.length;i++){					//loop finding number of blank indexes assigned
			String test = "";
			if (contents[i].equals(test) ){
				noContents++;
			}
			if(noContents == contents.length){						//test for faulty sandwich design i.e. if blank indexes are the only indexes left
				isSandwhich = false;
			}
		}
		if (isSandwhich == false){									//return statement for bad sandwich
			return ("That is not a sandwich");
		}else{
			String[] returnArray = new String[contents.length-noContents];		//creation of new proportional array, no blank indexes, length of new array = original matrix length - number of empty indexes
			int index = 0;
			for (int i = 0; i < contents.length; i++){
				if (!contents[i].equals("") ){
					returnArray[index] = contents[i];
					index++;
				}			
			}
			String returnStringContents = "";
			for (int i = 0; i < returnArray.length; i ++){			//conversion of returnarray into printable string
				returnStringContents = returnStringContents + returnArray[i];
			}
			return(returnStringContents);
		}
	}
}
