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
	//	String s = "applespineapplesbreadlettustomatobaconmayohambreadcheese";
//		String s = "I really like really red apples";
//		String[] f = s.split("really");
//		System.out.print(Arrays.toString(f));
		//System.out.print(s.indexOf("bread"));
		

		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
	System.out.println(sandwichSplit("breadpastramilettucecheesehambreadtomatopaprikabread"));
	System.out.print(sandwichSplit("breadpastramilettucecheesehambreadtomatopaprikabread"));
		System.out.println(sandwichSplit("cheesebreadpastramilettucecheesehambreadtomatopaprikabreadcrap"));
		System.out.println(sandwichSplit("cheesebread"));
		System.out.println(sandwichSplit("crap"));
		System.out.println(sandwichSplit("breadcrap"));
//		System.out.println(sandwichSplit(""));
		System.out.print(spacesSandwhichSplit("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
		System.out.print(spacesSandwhichSplit("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));

		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		

	}
	public static String sandwichSplit(String s){
		//if (s.indexOf("bread") != 0){
		//	s = s.substring(s.indexOf("bread"));
		//}
		//if(! s.substring(s.length()-5).equals("bread")){
		//	int secondPlaceofBread = s.indexOf("bread", (s.indexOf("bread")+1));
		//	s = s
		//}
		
//	}
		
		String[] contents = s.split("bread");
		if (s.indexOf("bread")  == -1){
			return ("That is not a sandwich");
		}
		if (s.indexOf("bread") != 0){
			contents[0] = "";
		}
		if(! s.substring(s.length()-5).equals("bread")){
			contents[contents.length-1] = "";
		}
		int noContents = 0;
		boolean isSandwhich = true;
		for (int i = 0; i < contents.length;i++){
			String test = "";
			if (contents[i].equals(test) ){
				noContents++;
			}
			if(noContents == contents.length){
				isSandwhich = false;
			}
		}
		if (isSandwhich == false){
			return ("That is not a sandwhich");
		}else{
			String[] returnArray = new String[contents.length-noContents];
			int index = 0;
			for (int i = 0; i < contents.length; i++){
				if (!contents[i].equals("") ){
					returnArray[index] = contents[i];
					index++;
				}			
			}
			String returnStringContents = "";
			for (int i = 0; i < returnArray.length; i ++){
				returnStringContents = returnStringContents + returnArray[i];
			}
			return(returnStringContents);
		}
	}
	
	public static String spacesSandwhichSplit(String s){
		String[] withoutSpacesArray = s.split(" ");
		String withoutSpacesString = "";
		for (int i = 0; i < withoutSpacesArray.length; i ++){
			withoutSpacesString = withoutSpacesString + withoutSpacesArray[i];
		}
		String[] contents = withoutSpacesString.split("bread");
		if (withoutSpacesString.indexOf("bread") != 0){
			contents[0] = "";
		}
		if(! withoutSpacesString.substring(withoutSpacesString.length()-5).equals("bread")){
			contents[contents.length-1] = "";
		}
		int noContents = 0;
		boolean isSandwhich = true;
		for (int i = 0; i < contents.length;i++){
			String test = "";
			if (contents[i].equals(test) ){
				noContents++;
			}
			if(noContents == contents.length){
				isSandwhich = false;
			}
		}
		if (isSandwhich == false){
			return ("That is not a sandwhich");
		}else{
			String[] returnArray = new String[contents.length-noContents];
			int index = 0;
			for (int i = 0; i < contents.length; i++){
				if (!contents[i].equals("") ){
					returnArray[index] = contents[i];
					index++;
				}			
			}
			String returnStringContents = "";
			for (int i = 0; i < returnArray.length; i ++){
				returnStringContents = returnStringContents + returnArray[i];
			}
			return(returnStringContents);
		}
	}
}
